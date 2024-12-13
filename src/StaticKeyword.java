public class StaticKeyword {
    public static void main(String[] args) {
        Demo demo=new Demo("Manik");
        demo.Display();
        Demo demo1=new Demo("Suvodeep");
        demo1.Display();
    }
}
class Demo{
    static int count=0;
    int c=0;
    String name;
    Demo(String name){
        this.name=name;
        count++;
        c++;
    }
    void Display(){
        System.out.println("Name: "+name);
        System.out.println(count);
        System.out.println(c);
    }
}
