package ABS;
import java.io.*;

public class BufferedInputStreamExample {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = null;
        BufferedInputStream bufferedInputStream = null;

        try{
            inputStream = new FileInputStream("c:/myjava/src/ABS/example.txt");
            bufferedInputStream = new BufferedInputStream (inputStream);
            while (bufferedInputStream.available() > 0){
                char c = (char) bufferedInputStream.read();
                System.out.println("Readed char "+c);
            }
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            inputStream.close();
            bufferedInputStream.close();
        }
    }
}
