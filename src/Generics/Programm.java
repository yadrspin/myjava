package Generics;

public class Programm {
    public static void main(String[] args) {
        Account acc1 = new Account(11112, 5000);
        int acc1Id = (int)acc1.getId();
        System.out.println(acc1Id);
        Account acc2 = new Account("sid111112", 6000);
        System.out.println(acc2.getId());
    }
}
