import java.util.*;
public class FiboRec{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        System.out.println(fibo(n));
    }
    public static long fibo(int n){
        if((n==0)||(n==1)){
            return 1;
        }
        else{
            return n*fibo(n-1);
        }
    }
}