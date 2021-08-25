package com.endava.bankchallenge.model;

import com.endava.bankchallenge.observer.IObserverTransaction;

import java.util.List;

public final class SubjectTransaction {

    private List<IObserverTransaction> subscriptors;
    private static SubjectTransaction instance;

    private SubjectTransaction(){
    }
    public static SubjectTransaction getInstance(){
        if(instance==null)
            instance = new SubjectTransaction();
        return instance;
    }

    public void attach(IObserverTransaction newObserver){
        this.subscriptors.add(newObserver);
    }

    public void detach(IObserverTransaction observer){
        if(this.subscriptors.contains(observer))
            this.subscriptors.remove(observer);
    }

    public void notifyListeners(MessageTransaction message ){
        for (IObserverTransaction listener :
                subscriptors) {
            listener.Update(message);
        }

    }



}
