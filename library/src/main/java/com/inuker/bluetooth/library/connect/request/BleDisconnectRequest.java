package com.inuker.bluetooth.library.connect.request;


import com.inuker.bluetooth.library.connect.IBleRequestProcessor;

public class BleDisconnectRequest extends BleRequest {

    public BleDisconnectRequest() {
        super(null);
    }

    @Override
    public void process(IBleRequestProcessor processor) {
        super.process(processor);
        closeBluetoothGatt();
        notifyRequestResult(REQUEST_SUCCESS, null);
    }
}
