package ABS;
import java.io.*;
import java.util.ArrayList;

public class DataOutStreamExample {
    public static void main(String[] args) throws Exception {
        DataOutputStream out = new DataOutputStream(new FileOutputStream("c:/myjava/src/ABS/ExampOut.txt"));
        //out.writeBoolean(true);
        //out.writeDouble(1.22222222222222);
        out.writeUTF("String1");

        FileOutputStream outStream = new FileOutputStream("c:/myjava/src/ABS/ExampOut.txt");
        BufferedOutputStream bufOutStream = new BufferedOutputStream(outStream);
        String s = "I love java";
        byte[] buff = s.getBytes();
        bufOutStream.write(buff, 0, buff.length);
        bufOutStream.close();

        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        while (true) {
            String buf = reader.readLine();
            if (buf.equals("exit")) {
                list.add(buf+"\n");
                break;
            } else {
                list.add(buf+"\n");
            }
        }
        BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
        for (int i = 0; i < list.size(); i++){
            writer.write(list.get(i));
        }
        writer.close();
    }
}
