package com.endava.bankchallenge.observer;

import com.endava.bankchallenge.model.MessageTransaction;



    public  class MrkService implements ObserverTransaction {


        @Override
        public void update(MessageTransaction message) {

            System.out.println("Check value: "+ message.getTransactionValue());
            this.sendAD(message.getCustomerId(), message.getCustomerEmail());
        }

        public void sendAD(int customerId, String customerEmail){

            System.out.println("Sending email to: "+customerEmail);

        }
    }

