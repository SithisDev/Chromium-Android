
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/udp_socket.mojom
//

package org.chromium.network.mojom;

import org.chromium.mojo.bindings.DeserializationException;


class UdpSocketReceiver_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<UdpSocketReceiver, UdpSocketReceiver.Proxy> MANAGER =
            new org.chromium.mojo.bindings.Interface.Manager<UdpSocketReceiver, UdpSocketReceiver.Proxy>() {
    
        @Override
        public String getName() {
            return "network::mojom::UDPSocketReceiver";
        }
    
        @Override
        public int getVersion() {
          return 0;
        }
    
        @Override
        public Proxy buildProxy(org.chromium.mojo.system.Core core,
                                org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }
    
        @Override
        public Stub buildStub(org.chromium.mojo.system.Core core, UdpSocketReceiver impl) {
            return new Stub(core, impl);
        }
    
        @Override
        public UdpSocketReceiver[] buildArray(int size) {
          return new UdpSocketReceiver[size];
        }
    };


    private static final int ON_RECEIVED_ORDINAL = 0;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements UdpSocketReceiver.Proxy {

        Proxy(org.chromium.mojo.system.Core core,
              org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void onReceived(
int result, org.chromium.net.interfaces.IpEndPoint srcAddr, org.chromium.mojo.common.mojom.ReadOnlyBuffer data) {

            UdpSocketReceiverOnReceivedParams _message = new UdpSocketReceiverOnReceivedParams();

            _message.result = result;

            _message.srcAddr = srcAddr;

            _message.data = data;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(ON_RECEIVED_ORDINAL)));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<UdpSocketReceiver> {

        Stub(org.chromium.mojo.system.Core core, UdpSocketReceiver impl) {
            super(core, impl);
        }

        @Override
        public boolean accept(org.chromium.mojo.bindings.Message message) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(org.chromium.mojo.bindings.MessageHeader.NO_FLAG)) {
                    return false;
                }
                switch(header.getType()) {
            
                    case org.chromium.mojo.bindings.interfacecontrol.InterfaceControlMessagesConstants.RUN_OR_CLOSE_PIPE_MESSAGE_ID:
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRunOrClosePipe(
                                UdpSocketReceiver_Internal.MANAGER, messageWithHeader);
            
            
            
            
            
                    case ON_RECEIVED_ORDINAL: {
            
                        UdpSocketReceiverOnReceivedParams data =
                                UdpSocketReceiverOnReceivedParams.deserialize(messageWithHeader.getPayload());
            
                        getImpl().onReceived(data.result, data.srcAddr, data.data);
                        return true;
                    }
            
            
                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }

        @Override
        public boolean acceptWithResponder(org.chromium.mojo.bindings.Message message, org.chromium.mojo.bindings.MessageReceiver receiver) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(org.chromium.mojo.bindings.MessageHeader.MESSAGE_EXPECTS_RESPONSE_FLAG)) {
                    return false;
                }
                switch(header.getType()) {
            
                    case org.chromium.mojo.bindings.interfacecontrol.InterfaceControlMessagesConstants.RUN_MESSAGE_ID:
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRun(
                                getCore(), UdpSocketReceiver_Internal.MANAGER, messageWithHeader, receiver);
            
            
            
            
                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }
    }


    
    static final class UdpSocketReceiverOnReceivedParams extends org.chromium.mojo.bindings.Struct {
    
        private static final int STRUCT_SIZE = 32;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(32, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public int result;
        public org.chromium.net.interfaces.IpEndPoint srcAddr;
        public org.chromium.mojo.common.mojom.ReadOnlyBuffer data;
    
        private UdpSocketReceiverOnReceivedParams(int version) {
            super(STRUCT_SIZE, version);
        }
    
        public UdpSocketReceiverOnReceivedParams() {
            this(0);
        }
    
        public static UdpSocketReceiverOnReceivedParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }
    
        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static UdpSocketReceiverOnReceivedParams deserialize(java.nio.ByteBuffer data) {
            if (data == null)
                return null;
    
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }
    
        @SuppressWarnings("unchecked")
        public static UdpSocketReceiverOnReceivedParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            UdpSocketReceiverOnReceivedParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                result = new UdpSocketReceiverOnReceivedParams(mainDataHeader.elementsOrVersion);
                if (mainDataHeader.elementsOrVersion >= 0) {
                    
                    result.result = decoder0.readInt(8);
                }
                if (mainDataHeader.elementsOrVersion >= 0) {
                    
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, true);
                    result.srcAddr = org.chromium.net.interfaces.IpEndPoint.decode(decoder1);
                }
                if (mainDataHeader.elementsOrVersion >= 0) {
                    
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(24, true);
                    result.data = org.chromium.mojo.common.mojom.ReadOnlyBuffer.decode(decoder1);
                }
            } finally {
                decoder0.decreaseStackDepth();
            }
            return result;
        }
    
        @SuppressWarnings("unchecked")
        @Override
        protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
            org.chromium.mojo.bindings.Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            
            encoder0.encode(this.result, 8);
            
            encoder0.encode(this.srcAddr, 16, true);
            
            encoder0.encode(this.data, 24, true);
        }
    
        /**
         * @see Object#equals(Object)
         */
        @Override
        public boolean equals(Object object) {
            if (object == this)
                return true;
            if (object == null)
                return false;
            if (getClass() != object.getClass())
                return false;
            UdpSocketReceiverOnReceivedParams other = (UdpSocketReceiverOnReceivedParams) object;
            if (this.result!= other.result)
                return false;
            if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.srcAddr, other.srcAddr))
                return false;
            if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.data, other.data))
                return false;
            return true;
        }
    
        /**
         * @see Object#hashCode()
         */
        @Override
        public int hashCode() {
            final int prime = 31;
            int result = prime + getClass().hashCode();
            result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.result);
            result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.srcAddr);
            result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.data);
            return result;
        }
    }



}
