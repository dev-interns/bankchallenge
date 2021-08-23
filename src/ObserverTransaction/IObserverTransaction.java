package ObserverTransaction;

import Transactions.MessageTransaction;

public interface IObserverTransaction {

    public void Update(MessageTransaction mensaje);
}
