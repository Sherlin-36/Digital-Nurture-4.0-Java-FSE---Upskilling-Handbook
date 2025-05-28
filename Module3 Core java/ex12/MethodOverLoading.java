import java.util.*;
public class MethodOverLoading{
    public static int add(int a,int b){
        return a+b;
    }
    public static double add(double a,double b){
        return a+b;
    }
    public static int add(int a,int b,int c){
        return a+b+c;
    }
 public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    System.out.println(add(a,b));
    System.out.println(add(a,b));
    System.out.println(add(a,b,c));
 }
}