/*
 * The MIT License
 * 
 * Copyright (c) 2011 Takahiro Hashimoto
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.taobao.api.internal.toplink.embedded.websocket.frame.rfc6455;


import java.nio.ByteBuffer;

import com.taobao.api.internal.toplink.embedded.websocket.frame.Frame;


/**
 * The Class FrameBuilderRfc6455.
 *
 * @author Takahiro Hashimoto
 */
public class FrameBuilderRfc6455 {

    /**
     * The Enum Opcode.
     *
     * @author Takahiro Hashimoto
     */
    protected enum Opcode {

        /**
         * The CONTINUATION.
         */
        CONTINUATION(0x0),
        /**
         * The TEXT_FRAME.
         */
        TEXT_FRAME(0x1),
        /**
         * The BINARY_FRAME.
         */
        BINARY_FRAME(0x2),
        // 0x3-7 reserved
        /**
         * The CONNECTION_CLOSE.
         */
        CONNECTION_CLOSE(0x8),
        /**
         * The PING.
         */
        PING(0x9),
        /**
         * The PONG.
         */
        PONG(0xA);
        // 0xB-F reserved

        /**
         * The opcode.
         */
        private final int opcode;

        /**
         * Instantiates a new opcode.
         *
         * @param opcode the opcode
         */
        private Opcode(int opcode) {
            this.opcode = opcode;
        }

        /**
         * Int value.
         *
         * @return the int
         */
        public int intValue() {
            return opcode;
        }

        /**
         * Value of.
         *
         * @param opc the opc
         * @return the opcode
         */
        public static Opcode valueOf(int opc) {
            switch (opc) {
                case 0x0:
                    return CONTINUATION;
                case 0x1:
                    return TEXT_FRAME;
                case 0x2:
                    return BINARY_FRAME;
                case 0x8:
                    return CONNECTION_CLOSE;
                case 0x9:
                    return PING;
                case 0xA:
                    return PONG;
                default:
                    return null;
            }
        }
    }

    /**
     * The Enum Fin.
     *
     * @author Takahiro Hashimoto
     */
    protected enum Fin {

        /**
         * The MORE_FRAME.
         */
        MORE_FRAME(0),
        /**
         * The FINAL.
         */
        FINAL(1);

        /**
         * The fin.
         */
        private final int fin;

        /**
         * Instantiates a new fin.
         *
         * @param fin the fin
         */
        private Fin(int fin) {
            this.fin = fin;
        }

        /**
         * Int value.
         *
         * @return the int
         */
        public int intValue() {
            return fin;
        }
    }

    /**
     * The Enum Rsv.
     *
     * @author Takahiro Hashimoto
     */
    protected enum Rsv {

        /**
         * The RESERVE.
         */
        RESERVE(0);

        /**
         * The rsv.
         */
        private final int rsv;

        /**
         * Instantiates a new rsv.
         *
         * @param rsv the rsv
         */
        private Rsv(int rsv) {
            this.rsv = rsv;
        }

        /**
         * Int value.
         *
         * @return the int
         */
        public int intValue() {
            return rsv;
        }
    }

    /**
     * The Enum PayloadLengthType.
     *
     * @author Takahiro Hashimoto
     */
    protected enum PayloadLengthType {

        /**
         * The LEN_SHORT.
         */
        LEN_SHORT((byte) 0x7D, 0), // 0x00 - 0x7D
        /**
         * The LEN_16.
         */
        LEN_16((byte) 0x7E, 2), // 0x0000 - 0xFFFF
        /**
         * The LEN_63.
         */
        LEN_63((byte) 0x7F, 8); // 0x0000000000000000 - 0x7FFFFFFFFFFFFFFF
        /**
         * The payload length type.
         */
        private final byte payloadLengthType;

        /**
         * The offset.
         */
        private final int offset;

        /**
         * Instantiates a new payload length type.
         *
         * @param payloadLengthType the payload length type
         * @param offset            the offset
         */
        private PayloadLengthType(byte payloadLengthType, int offset) {
            this.payloadLengthType = payloadLengthType;
            this.offset = offset;
        }

        /**
         * Byte value.
         *
         * @return the byte
         */
        public byte byteValue() {
            return payloadLengthType;
        }

        /**
         * Offset.
         *
         * @return the int
         */
        public int offset() {
            return offset;
        }

        /**
         * Value of.
         *
         * @param plt the plt
         * @return the payload length type
         */
        public static PayloadLengthType valueOf(byte plt) {
            switch (plt) {
                case 0x7E:
                    return LEN_16;
                case 0x7F:
                    return LEN_63;
            }
            if (0 <= plt && plt <= 0x7D) {
                return LEN_SHORT;
            }
            return null;
        }

        /**
         * Value of.
         *
         * @param payloadLength the payload length
         * @return the payload length type
         */
        public static PayloadLengthType valueOf(long payloadLength) {
            if (payloadLength <= PayloadLengthType.LEN_SHORT.byteValue()) {
                return PayloadLengthType.LEN_SHORT;
            } else if (payloadLength <= MAX_FRAME_LENGTH_16) {
                return PayloadLengthType.LEN_16;
            } else if (payloadLength <= MAX_FRAME_LENGTH_63) {
                return PayloadLengthType.LEN_63;
            } else {
                throw new IllegalArgumentException("Overflow payload length. payloadLength: " + payloadLength);
            }
        }

    }

    /**
     * The Constant MAX_FRAME_LENGTH_16.
     */
    protected static final int MAX_FRAME_LENGTH_16 = 0xFFFF;

    /**
     * The Constant MAX_FRAME_LENGTH_63.
     */
    protected static final long MAX_FRAME_LENGTH_63 = 0x7FFFFFFFFFFFFFFFL;

    /**
     * The Constant FIN_MASK.
     */
    protected static final int FIN_MASK = 1 << 7;

    /**
     * The Constant RSV1_MASK.
     */
    protected static final byte RSV1_MASK = 1 << 6;

    /**
     * The Constant RSV2_MASK.
     */
    protected static final byte RSV2_MASK = 1 << 5;

    /**
     * The Constant RSV3_MASK.
     */
    protected static final byte RSV3_MASK = 1 << 4;

    /**
     * The Constant OPCODE_MASK.
     */
    protected static final byte OPCODE_MASK = 0xF;

    /**
     * The Constant MASK_MASK.
     */
    protected static final int MASK_MASK = 1 << 7;

    /**
     * The Constant PAYLOAD_LEN_MASK.
     */
    protected static final int PAYLOAD_LEN_MASK = 0x7F;


    /**
     * create frame header from parameter bytes
     * if a invalid frame data received which may throw IllegalArgumentException.
     *
     * @param chunkData      the chunk data
     * @param previousHeader the previous header
     * @return a sub class of Frame
     */
    public static FrameHeaderRfc6455 createFrameHeader(ByteBuffer chunkData, FrameHeaderRfc6455 previousHeader) {
        if (chunkData == null) {
            throw new IllegalArgumentException("Data is null.");
        }

        int length = chunkData.limit() - chunkData.position();

        if (length < 2) {
            return null;
        }

        // check frameData[0]
        byte hb1 = chunkData.get();
        // No check FIN. because FIN bit permit 0 or 1.
        boolean fragmented = (hb1 & FIN_MASK) == 0;

        // check reserve field.
        if ((hb1 & (RSV1_MASK | RSV2_MASK | RSV3_MASK)) != 0) {
            throw new IllegalArgumentException("Found nonzero bit in reserve field. (RSV1,2,3)");
        }

        // check opcode
        int opcodeNum = hb1 & OPCODE_MASK;
        Opcode opcode = Opcode.valueOf(opcodeNum);
        if (opcode == null) {
            throw new IllegalArgumentException("Found illegal opcode " + opcodeNum + ".");
        }

        // check frameData[1]
        byte hb2 = chunkData.get();
        // check reserve field.
        if ((hb2 & MASK_MASK) != 0) {
            throw new IllegalArgumentException("Found mask bit field. (MASK)");
        }

        // check payload len
        byte payloadLength1 = (byte) (hb2 & PAYLOAD_LEN_MASK);
        PayloadLengthType payloadLengthType = PayloadLengthType.valueOf(payloadLength1);
        if (payloadLengthType == null) {
            throw new IllegalArgumentException("Found illegal payload length " + payloadLength1 + ".");
        }

        if (length < 2 + payloadLengthType.offset()) {
            return null;
        }

        long payloadLength2 = payloadLength1;
        switch (payloadLengthType) {
            case LEN_16:
                payloadLength2 =  ((chunkData.get()&0xFF)<<8) | (chunkData.get()&0xFF);
                break;
            case LEN_63:
                payloadLength2 = 0x7FFFFFFFFFFFFFFFL & chunkData.getLong();
                break;
			default:
				break;
        }

        if (payloadLength2 > Integer.MAX_VALUE) {
            throw new IllegalArgumentException("large data is not support yet");
        }
        
        if (Opcode.CONTINUATION.equals(opcode) && previousHeader != null) {
            return new FrameHeaderRfc6455(fragmented, 2, payloadLengthType, (int) payloadLength2, opcode, previousHeader.getOpcode());
        } else {
            return new FrameHeaderRfc6455(fragmented, 2, payloadLengthType, (int) payloadLength2, opcode);
        }
    }

    /**
     * Creates the frame header.
     *
     * @param body       the contents
     * @param fragmented the fragmented
     * @param opcode     the opcode
     * @return the frame header draft06
     */
    public static FrameHeaderRfc6455 createFrameHeader(byte[] body, boolean fragmented, Opcode opcode) {
        int payloadLength = 0;
        if (body != null) {
            payloadLength = body.length;
        }
        PayloadLengthType payloadLengthType = PayloadLengthType.valueOf(payloadLength);
        return new FrameHeaderRfc6455(fragmented, 2, payloadLengthType, (int) payloadLength, opcode);
    }

    /**
     * Creates the frame.
     *
     * @param header   the header
     * @param bodyData the contents data
     * @return the frame
     */
    public static Frame createFrame(FrameHeaderRfc6455 header, byte[] bodyData) {
        Opcode opcode = header.getRealOpcode();
        if (opcode == null) {
            opcode = header.getOpcode();
        }
        switch (opcode) {
            case CONNECTION_CLOSE:
                return new CloseFrame(header, bodyData);
            case PING:
                return new PingFrame(header, bodyData);
            case PONG:
                return new PongFrame(header, bodyData);
            case TEXT_FRAME:
                return new TextFrame(header, bodyData);
            case BINARY_FRAME:
                return new BinaryFrame(header, bodyData);
            default:
                throw new IllegalStateException("Not found Opcode type!");
        }
    }
}
