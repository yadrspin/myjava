import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MidQuad {
    public static void main(String[] args) throws IOException {
        ArrayList<Float> floatList = new ArrayList<>();
        try(BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите 10 чисел через пробел, после ввода нажмите Enter:)");
            for(int i = 0; i < 10; i++){
                floatList.add(Float.parseFloat(consoleReader.readLine()));
            }
        }
    }

    public float MidQuadSearch(ArrayList<Float> floatList){
        float result = 0;
        float midArith = 0;
        float dispers = 0;
        ArrayList<Float> dispList = new ArrayList<>();
        for (int i = 0; i < floatList.size(); i++) {
            midArith = midArith + floatList.get(i);
        }
        midArith = midArith / 10;
        for (int i = 0; i < floatList.size(); i++) {
            dispList.add(floatList.get(i) * 2);
        }
        for (int i = 0; i < dispList.size(); i++) {
            dispers = dispers + dispList.get(i);
        }
        result = dispers;
        return result;
    }
}
