package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        String fileName1, fileName2;
        try(BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in))){
            fileName1 = consoleReader.readLine();
            fileName2 = consoleReader.readLine();
        }
        ArrayList<String> file1List = new ArrayList<>();
        ArrayList<String> file2List = new ArrayList<>();
        try(BufferedReader fileReader1 = new BufferedReader(new FileReader(fileName1))){
            while(fileReader1.ready()){
                file1List.add(fileReader1.readLine());
            }
        }
        try(BufferedReader fileReader2 = new BufferedReader(new FileReader(fileName2))){
            while(fileReader2.ready()){
                file2List.add(fileReader2.readLine());
            }
        }
        int index1 = 0;
        int index2 = 0;

        while(index1 < file1List.size() && index2 < file2List.size()){
            if(file1List.get(index1).equals(file2List.get(index2))){
                lines.add(new LineItem(Type.SAME, file1List.get(index1)));
                index1++;
                index2++;
            }else if((index1 + 1) < file1List.size() && file1List.get(index1 +1).equals(file2List.get(index2))){
                lines.add(new LineItem(Type.REMOVED, file1List.get(index1)));
                index1++;
            }else if((index2 +1) < file2List.size() && file1List.get(index1).equals(file2List.get(index2 + 1))){
                lines.add(new LineItem(Type.ADDED, file2List.get(index2)));
                index2++;
            }
        }
        if(index1 == file1List.size() && index2 < file2List.size()){
            while(index2 != file2List.size()){
                lines.add(new LineItem(Type.ADDED, file2List.get(index2)));
                index2++;
            }
        }
        if(index2 == file2List.size() && index1 < file1List.size()){
            while(index1 != file1List.size()){
                lines.add(new LineItem(Type.REMOVED, file1List.get(index1)));
                index1++;
            }
        }

//        System.out.println("Result:");
//        for(int i = 0; i < lines.size(); i++){
//            System.out.println(lines.get(i).type + " " + lines.get(i).line);
//        }
    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
