import java.util.Scanner;

public class ThrowAndThrows {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        check(n);
    }
    static void check(int n) throws Exception{
    if(n<0){
        throw new Exception("The number should be A positive Integer");
    }else {
        System.out.println("The number is valid");
    }
}
}
