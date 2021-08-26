package com.endava.bankchallenge.observer;

import com.endava.bankchallenge.model.MessageTransaction;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class AuditService implements IObserverTransaction{
    @Override
    public void Update(MessageTransaction message) {

        if(message.getTransactionType().equals("DEPOSIT") &&
                message.getTransactionValue()> 10000){

            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMddYYYY");
            LocalDateTime now = LocalDateTime.now();
            String date= dtf.format(now).toString();
            String fileName= "DEPOSITSTOREVIEW-"+date+".txt";
            String data= message.getCustomerId()+" , "+
                    message.getAccountId()+" , "+
                    message.getTransactionValue()+"\n";
            BufferedWriter bufferedWriter = null;
            FileWriter fileWriter = null;
            try {
                File file = new File(fileName);
                if (!file.exists())
                    file.createNewFile();
                fileWriter = new FileWriter(file.getAbsoluteFile(), true);
                bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write(data);
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (bufferedWriter != null)
                        bufferedWriter.close();
                    if (fileWriter != null)
                        fileWriter.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}
