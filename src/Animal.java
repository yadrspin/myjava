public class Animal {
    public void Voice(){
        System.out.println("Голос!");
    }
}

class Cat extends  Animal{

    public Cat() {
    }

    @Override
    public void Voice (){
        System.out.println("Mew!");
        System.out.println("Мяу!");
    }
}

