import java.util.*;
public class Optpr{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int result=((a+b)*(b-c)*c*c)^b;
        System.out.println(result);
    }
}