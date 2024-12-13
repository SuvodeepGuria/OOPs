public class SuperClass {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.display();
    }
}

class Animals{
    Animals(){
        System.out.println("Animals Constructor is called");
    }
    void display(){
        System.out.println("Every animal has life.");
    }
}
class Dog extends Animals{
    Dog(){
        super();
        System.out.println("Dog constructor is called");
    }
    @Override
    void display(){
        System.out.println("Dog is a animal.");
    }
}