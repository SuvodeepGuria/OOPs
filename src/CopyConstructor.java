public class CopyConstructor {
    public static void main(String[] args) {
        Student student=new Student("Manik",20);
        student.display();
        Student student1=new Student(student);
        student1.display();
    }
}

class Student{
    String name;
    int rollNo;
    Student(String name,int rollNo){
        this.name=name;
        this.rollNo=rollNo;
    }

    Student(Student s1){
        this.name=s1.name;
        this.rollNo=s1.rollNo;
        System.out.println("Copy constructor is called");
    }
    void display(){
        System.out.println("Name: "+name+" Roll No: "+rollNo);
    }
}