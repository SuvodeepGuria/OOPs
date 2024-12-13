public class Circle {
    int radius;
    Circle(int r){
        this.radius=r;
    }
    void per(){
        System.out.println(Math.PI*radius*radius);
    }
    int getRadius(){
        return radius;
    }
    public static void main(String[] args) {
        Circle c1=new Circle(2);
        Circle c2=new Circle(3);
        Circle c3=new Circle(5);
        System.out.println(c1.getRadius());
        c1.per();
        System.out.println(c2.getRadius());
        c2.per();
        System.out.println(c3.getRadius());
        c3.per();
    }
}
