package ABS;
import java.io.*;

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
    }
}
