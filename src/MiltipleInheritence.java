public class MiltipleInheritence {
    public static void main(String[] args) {
        Bat bat=new Bat();
        bat.eat();
        bat.fly();
    }
}

interface Bird{
    void fly();
}
interface Animal{
    void eat();
}
class Bat implements Animal,Bird{

    @Override
    public void eat() {
        System.out.println("Bat can eat..");
    }

    @Override
    public void fly() {
        System.out.println("Bat can fly..");
    }
}
