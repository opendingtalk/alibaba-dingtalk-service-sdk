package com.taobao.api.internal.toplink;

import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentLinkedQueue;

// easy buffer pool
public class BufferManager {
	private static ConcurrentLinkedQueue<ByteBuffer> buffers = new ConcurrentLinkedQueue<ByteBuffer>();

	private static boolean enableDirect;
	private static int maxBufferSize = 1024 * 4;

	public static void enableDirectBuffer(boolean enable) {
		enableDirect = enable;
	}

	public static void setBufferSize(int max) {
		maxBufferSize = max;
		buffers.clear();
	}

	public static ByteBuffer getBuffer() {
		ByteBuffer buffer = buffers.poll();
		// TODO:change fixed capacity
		return buffer == null ? allocate() : buffer;
		// direct buffer efficiently for netty ?
		// https://github.com/wsky/top-link/issues/12#issuecomment-14550453
		// -XX:MaxDirectMemorySize=10m -XX:+PrintGC
		// return buffer == null ? ByteBuffer.allocateDirect(1024 * 4) : buffer;
	}

	public static void returnBuffer(ByteBuffer buffer) {
		buffer.clear();
		buffers.add(buffer);
	}

	private static ByteBuffer allocate() {
		return enableDirect ?
				ByteBuffer.allocateDirect(maxBufferSize) :
				ByteBuffer.allocate(maxBufferSize);
	}
}
