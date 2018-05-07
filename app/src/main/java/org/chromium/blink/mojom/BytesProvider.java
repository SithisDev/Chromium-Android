
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/WebKit/public/mojom/blob/data_element.mojom
//

package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.DeserializationException;


public interface BytesProvider extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends BytesProvider, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<BytesProvider, BytesProvider.Proxy> MANAGER = BytesProvider_Internal.MANAGER;


    void requestAsReply(

RequestAsReplyResponse callback);

    interface RequestAsReplyResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<byte[]> { }



    void requestAsStream(
org.chromium.mojo.system.DataPipe.ProducerHandle pipe);



    void requestAsFile(
long sourceOffset, long sourceSize, org.chromium.mojo.common.mojom.File file, long fileOffset, 
RequestAsFileResponse callback);

    interface RequestAsFileResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<org.chromium.mojo.common.mojom.Time> { }


}
