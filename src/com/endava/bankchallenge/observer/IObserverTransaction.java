package com.endava.bankchallenge.observer;

import com.endava.bankchallenge.model.MessageTransaction;

public interface IObserverTransaction {

    public void Update(MessageTransaction message);
}
