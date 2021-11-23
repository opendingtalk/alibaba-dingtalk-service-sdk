package com.taobao.api.internal.toplink.remoting.protocol;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map.Entry;

import com.taobao.api.internal.toplink.protocol.NotSupportedException;
import com.taobao.api.internal.toplink.protocol.tcp.TcpHeaderFormat;
import com.taobao.api.internal.toplink.protocol.tcp.TcpProtocolHandle;

public class RemotingTcpProtocolHandle extends TcpProtocolHandle {
	public RemotingTcpProtocolHandle(ByteBuffer source) {
		super(source);
	}

	@Override
	protected boolean writeExtendedHeader(Entry<String, Object> entry) {
		if (entry.getKey().equalsIgnoreCase(RemotingTransportHeader.Flag)) {
			this.WriteUInt16(RemotingTcpHeaders.Flag);
			this.WriteByte(TcpHeaderFormat.Int32);
			this.WriteInt32(entry.getValue() != null ? (Integer) entry.getValue() : -1);
			return true;
		}
		if (entry.getKey().equalsIgnoreCase(RemotingTransportHeader.Format)) {
			if (entry.getValue() != null) {
				this.WriteUInt16(RemotingTcpHeaders.Format);
				this.WriteByte(TcpHeaderFormat.CountedString);
				this.WriteCountedString(entry.getValue().toString());
			}
			return true;
		}
		return false;
	}

	@Override
	protected boolean readExtendedHeader(short headerType,
			HashMap<String, Object> dict) throws NotSupportedException {
		if (headerType == RemotingTcpHeaders.Flag) {
			this.ReadByte();
			dict.put(RemotingTransportHeader.Flag, this.ReadInt32());
			return true;
		}
		if (headerType == RemotingTcpHeaders.Format) {
			this.ReadByte();
			dict.put(RemotingTransportHeader.Format, this.ReadCountedString());
			return true;
		}
		return false;
	}
}
