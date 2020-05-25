package Helping;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class help1 {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<Integer>();
        int count=1;
        int x= 0;
        while(true){
            String s = br.readLine();
            if (s==null || s.equals("")){
                break;}
            list.add(Integer.parseInt(s));

        }
        for(int a= 1; a<10;a++){
            if(list.get(a).equals(list.get(a-1))){
                count++; }
            if(!list.get(a).equals(list.get(a-1))){
                if(x < count)
                    x= count;
                count=1;
            }
        }
        System.out.println(x);

    }
}
