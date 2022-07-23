import java.util.*;
public class diff{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int d=0;
        if(a>b){
            d=a-b;
        }
        else{
            d=b-a;
        }
        System.out.println("Difference = "+d);
    }
}