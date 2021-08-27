package com.endava.bankchallenge.observer;

import com.endava.bankchallenge.model.MessageTransaction;

public interface ObserverTransaction {

    void update(MessageTransaction message);
}
