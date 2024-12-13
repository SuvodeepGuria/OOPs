import java.util.ArrayList;
import java.util.Arrays;

public class TwoDiffException{
    public static void main(String[] args) {
        int[] arr=new int[9];
        Arrays.fill(arr,0);
        try{
            try{
                int ans=10/0;
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
            System.out.println(arr[10]);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}