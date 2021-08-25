package ObserverTransaction;

import Transactions.MessageTransaction;

public class MrkService implements IObserverTransaction{



    @Override
    public void Update(MessageTransaction mensaje) {

        System.out.println("Check value: "+mensaje.getTransactionValue());
        this.sendAD(mensaje.getCustomerId(), mensaje.getCustomerEmail());
    }

    public void sendAD(int customerId, String customerEmail){

        System.out.println("Sending email to: "+customerEmail);

    }
}
