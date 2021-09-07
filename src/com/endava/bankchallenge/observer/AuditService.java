package com.endava.bankchallenge.observer;

import com.endava.bankchallenge.Util.DateUtil;
import com.endava.bankchallenge.Util.FileUtil;
import com.endava.bankchallenge.model.MessageTransaction;
import com.endava.bankchallenge.Properties.Config;
import java.io.*;


public class AuditService implements ObserverTransaction {
    @Override
    public void update(MessageTransaction message) {

        if(Config.AUDIT_SERVICE_TRANSACTION_TYPE.toString().equals(message.getTransactionType()) &&
                message.getTransactionValue()> Config.AUDIT_SERVICE_MIN_TRANSACTION_VALUE){

            String fileName=String.format("DEPOSITSTOREVIEW-%s.txt",DateUtil.getCurrentDate());

            StringBuilder data= new StringBuilder(message.getCustomerId()+" , "+
                    message.getAccountId()+" , "+
                    message.getTransactionValue()+"\n");
            File file = null;
            try {
                file = FileUtil.createFile(fileName);
            } catch (IOException e) {
                e.printStackTrace();
            }
            FileUtil.writeFile(file,data.toString());
        }
    }
}
