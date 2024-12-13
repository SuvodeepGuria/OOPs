public class CallByValueAndReference {
    public static void main(String[] args) {
        System.out.println("Call By Value.");
        int n=10;
        System.out.println("Before Call n= "+n);
        CallByValue cv=new CallByValue(10);
        cv.display();
        System.out.println("After call n= "+n);
        System.out.println("Call by reference");
        CallByReference cr=new CallByReference("Manik",20);
        System.out.println("Before modify: name= "+cr.name+ " age= "+cr.age);
        cr.modify(cr);
        System.out.println("After modify: name= "+cr.name+ " age= "+cr.age);
    }
}

class CallByValue{
    int num;
    CallByValue(int num){
        this.num=num*2;
    }
    void display(){
        System.out.println("Number inside class: "+num);
    }
}

class CallByReference{
    String name;
    int age;
    public CallByReference(String name, int age) {
        this.name=name;
        this.age=age;
    }
    public void modify(CallByReference c){
        c.name="Suvo";
        c.age=30;
    }
}
