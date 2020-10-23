package com.javarush.task.task19.task1910;

import java.io.*;
import java.util.ArrayList;

/* 
Пунктуация
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        String inFileName, outFileNamae;
        try (BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in))) {
            inFileName = consoleReader.readLine();
            outFileNamae = consoleReader.readLine();
        }
        ArrayList<String> inStrList = new ArrayList<>();
        try(BufferedReader fileReader = new BufferedReader(new FileReader(inFileName))) {
            while (fileReader.ready()) {
                inStrList.add(fileReader.readLine());
            }
        }

        try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(outFileNamae))) {
            for (String s : inStrList) {
                fileWriter.write(s.replaceAll("\\p{P}", ""));
            }
        }
    }
}
