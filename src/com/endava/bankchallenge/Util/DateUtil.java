package com.endava.bankchallenge.Util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtil {

    public static String getCurrentDate(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMddYYYY");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now).toString();
    }
}
