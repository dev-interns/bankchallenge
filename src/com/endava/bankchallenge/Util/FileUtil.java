package com.endava.bankchallenge.Util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtil {


    public static File createFile(String fileName) throws IOException{
        File file = new File(fileName);
            if (!file.exists()) {
                file.createNewFile();
            }
        return file;
    }

    public static void writeFile(File file, String data){
        try( BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file.getAbsoluteFile(), true)) ) {
            bufferedWriter.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
