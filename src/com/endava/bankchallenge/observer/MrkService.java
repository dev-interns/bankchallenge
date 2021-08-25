package com.endava.bankchallenge.observer;

import com.endava.bankchallenge.model.MessageTransaction;

public class MrkService implements IObserverTransaction {



    @Override
    public void Update(MessageTransaction mensaje) {
        System.out.println("wowi");

    }
}
