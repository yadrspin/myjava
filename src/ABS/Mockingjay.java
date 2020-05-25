package ABS;

public class Mockingjay extends Bird{
    @Override
    public void fly() {
        System.out.println("Лети птичка!");
    }

    public static void main(String[] args) {
        Mockingjay someBird = new Mockingjay();
        someBird.setAge(20);
        System.out.println(someBird.getAge());
    }
}
