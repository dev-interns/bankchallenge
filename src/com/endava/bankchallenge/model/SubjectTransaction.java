package com.endava.bankchallenge.model;

import com.endava.bankchallenge.observer.ObserverTransaction;

import java.util.ArrayList;
import java.util.List;

public final class SubjectTransaction {

    private List<ObserverTransaction> subscriptors;
    private static SubjectTransaction instance;

    private SubjectTransaction(){
        subscriptors = new ArrayList<>();
    }
    public static SubjectTransaction getInstance(){
        if(instance==null)
            instance = new SubjectTransaction();
        
        return instance;
    }

    public void attach(ObserverTransaction newObserver){
        this.subscriptors.add(newObserver);
    }

    public void detach(ObserverTransaction observer){
        if(this.subscriptors.contains(observer))
            this.subscriptors.remove(observer);
    }

    public void notifyListeners(MessageTransaction message ){
        for (ObserverTransaction listener :
                subscriptors) {
            listener.update(message);
        }

    }



}
