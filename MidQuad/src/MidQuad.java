import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MidQuad {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> intList = new ArrayList<>();
        try(BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите 10 чисел через пробел, после ввода нажмите Enter:)");
            for(int i = 0; i < 10; i++){
                intList.add(Integer.parseInt(consoleReader.readLine()));
            }
        }
    }

    public int MidQuadSearch(ArrayList<Integer> list){
        int result = 0;


        return result;
    }
}
