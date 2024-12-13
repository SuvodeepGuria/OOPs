import createPackage.Car;
public class ImportAndCreatePackage {
    public static void main(String[] args) {
        Car car=new Car();
        Car.Display();
    }
}

//javac createPackage/Car.java
//javac ImportAndCreatePackage.java
//java ImportAndCreatePackage.java