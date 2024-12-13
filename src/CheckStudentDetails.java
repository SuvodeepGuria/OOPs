public class CheckStudentDetails {
    public static void main(String[] args) throws Exception {
        StudentDetails studentDetails=new StudentDetails(29,"Manik29");
        StudentDetails studentDetails1=new StudentDetails(10,"Suvodeep");
        studentDetails.checkName();
        studentDetails.checkAge();
        studentDetails1.checkAge();
        studentDetails1.checkName();
    }
}

class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}
class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}
class StudentDetails{
    int age;
    String Name;
    StudentDetails(int age,String name){
        this.age=age;
        this.Name=name;
    }
    void checkAge() throws Exception{
        if(age<15 || age>21){
            throw new AgeNotWithinRangeException("Age is not valid");
        }else{
            System.out.println("Valid age");
        }
    }
    void checkName() throws Exception{
        if(Name.matches("[a-zA-z0-9]+")){
            throw new NameNotValidException("Name is not valid");
        }else {
            System.out.println("Name registered successfully");
        }
    }
}