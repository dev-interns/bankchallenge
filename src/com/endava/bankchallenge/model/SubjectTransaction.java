package com.endava.bankchallenge.model;
import com.endava.bankchallenge.observer.ObserverTransaction;
import java.util.ArrayList;
import java.util.List;

public final class SubjectTransaction {

    private final List<ObserverTransaction> subscribers;
    private static SubjectTransaction instance;

    private SubjectTransaction(){
        subscribers = new ArrayList<>();
    }
    public static SubjectTransaction getInstance(){
        if(instance==null)
            instance = new SubjectTransaction();
        return instance;
    }

    public void attach(ObserverTransaction newObserver){
        this.subscribers.add(newObserver);
    }

    public void detach(ObserverTransaction observer){
        this.subscribers.remove(observer);
    }

    public void notifyListeners(MessageTransaction message ){
        for (ObserverTransaction listener :
                subscribers) {
            listener.update(message);
        }

    }
}
