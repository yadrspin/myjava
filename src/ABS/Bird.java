package ABS;

public abstract class Bird {
    private String species;
    private int age;

    public abstract void fly();
    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }
}

