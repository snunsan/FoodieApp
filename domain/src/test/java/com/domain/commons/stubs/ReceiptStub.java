package com.domain.commons.stubs;

import com.domain.models.ReceiptModel;

public class ReceiptStub {

    public static ReceiptModel getReceipt(){
        return new ReceiptModel(1, "Hummus", null, null, 15, "description");
    }

}
