import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MidQuad {
    public static void main(String[] args) throws IOException {
        ArrayList<Double> doubleList = new ArrayList<>();
        double quad = 0;
        doubleList.add((double) 600);
        doubleList.add((double) 470);
        doubleList.add((double) 170);
        doubleList.add((double) 430);
        doubleList.add((double) 300);
        quad = MidQuadSearch(doubleList);
        System.out.println("Среднее квадратическое массива = " + quad);
    }

    public static double MidQuadSearch(ArrayList<Double> doubleList){
        double midArith = 0;
        double dispers = 0;
        ArrayList<Double> dispList = new ArrayList<>();
        for (int i = 0; i < doubleList.size(); i++) {
            midArith = midArith + doubleList.get(i);
        }
        midArith = midArith / doubleList.size();
        for (int i = 0; i < doubleList.size(); i++) {
            dispList.add(Math.pow((doubleList.get(i) - midArith), 2));
        }
        for (int i = 0; i < dispList.size(); i++) {
            dispers = dispers + dispList.get(i);
        }
        dispers = dispers / dispList.size();
        return Math.sqrt(dispers);
    }
}
