
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     media/mojo/interfaces/cdm_proxy.mojom
//

package org.chromium.media.mojom;

import org.chromium.mojo.bindings.DeserializationException;


public interface CdmProxy extends org.chromium.mojo.bindings.Interface {



    public static final class Status {
    
    
    
        private static final boolean IS_EXTENSIBLE = false;
    
        public static boolean isKnownValue(int value) {
            return false;
        }
    
        public static void validate(int value) {
            if (IS_EXTENSIBLE || isKnownValue(value))
                return;
    
            throw new DeserializationException("Invalid enum value.");
        }
    
        private Status() {}
    
    }


    public static final class Protocol {
    
    
    
        private static final boolean IS_EXTENSIBLE = false;
    
        public static boolean isKnownValue(int value) {
            return false;
        }
    
        public static void validate(int value) {
            if (IS_EXTENSIBLE || isKnownValue(value))
                return;
    
            throw new DeserializationException("Invalid enum value.");
        }
    
        private Protocol() {}
    
    }


    public static final class Function {
    
    
    
        private static final boolean IS_EXTENSIBLE = false;
    
        public static boolean isKnownValue(int value) {
            return false;
        }
    
        public static void validate(int value) {
            if (IS_EXTENSIBLE || isKnownValue(value))
                return;
    
            throw new DeserializationException("Invalid enum value.");
        }
    
        private Function() {}
    
    }


    public interface Proxy extends CdmProxy, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<CdmProxy, CdmProxy.Proxy> MANAGER = CdmProxy_Internal.MANAGER;


    void initialize(
org.chromium.mojo.bindings.AssociatedInterfaceNotSupported client, 
InitializeResponse callback);

    interface InitializeResponse extends org.chromium.mojo.bindings.Callbacks.Callback4<Integer, Integer, Integer, Integer> { }



    void process(
int function, int cryptoSessionId, byte[] inputData, int outputDataSize, 
ProcessResponse callback);

    interface ProcessResponse extends org.chromium.mojo.bindings.Callbacks.Callback2<Integer, byte[]> { }



    void createMediaCryptoSession(
byte[] inputData, 
CreateMediaCryptoSessionResponse callback);

    interface CreateMediaCryptoSessionResponse extends org.chromium.mojo.bindings.Callbacks.Callback3<Integer, Integer, Long> { }



    void setKey(
int cryptoSessionId, byte[] keyId, byte[] keyBlob);



    void removeKey(
int cryptoSessionId, byte[] keyId);


}
