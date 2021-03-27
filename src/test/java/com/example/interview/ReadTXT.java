package com.example.interview;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

public class ReadTXT {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList();
        a.add("a");
        a.add("c");
        a.add("b");
//        readTxtFile(args[0]);
    }

    public static void readTxtFile(String filePath) {
        StringBuilder txtValue = new StringBuilder();
        try {
            InputStreamReader read = new InputStreamReader(new FileInputStream(filePath));//
            BufferedReader bufferedReader = new BufferedReader(read);
            String lineTxt;
            while ((lineTxt = bufferedReader.readLine()) != null) {
                System.out.println("readTxt:" + lineTxt);
                // lineTxt += " <br>";
                // txtValue.append(lineTxt);
            }
            read.close();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
