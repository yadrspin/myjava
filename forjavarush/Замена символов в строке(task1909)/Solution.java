package com.javarush.task.task19.task1909;

import java.io.*;
import java.util.ArrayList;

/* 
Замена знаков
*/

public class Solution {
    public static void main(String[] args) {
        String inFileName;
        String outFileName;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            inFileName = bufferedReader.readLine();
            outFileName = bufferedReader.readLine();
            bufferedReader.close();
            BufferedReader fileReader = new BufferedReader(new FileReader(inFileName));
            BufferedWriter fileWriter = new BufferedWriter(new FileWriter(outFileName));
            ArrayList<Character> data = new ArrayList<>();
            while(fileReader.ready()){
                data.add((char) fileReader.read());
            }
//            while(fileReader.ready()){
//                data.add((char) fileReader.read());
//            }
            for (Character c : data) {
                if(c == '.'){
                    fileWriter.write('!');
                }else{
                    fileWriter.write(c);
                }
            }
            fileReader.close();
            fileWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }


        }
    }

