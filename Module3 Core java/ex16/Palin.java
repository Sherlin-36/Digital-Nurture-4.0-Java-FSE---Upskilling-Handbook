import java.util.*;
public class Palin{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder sb=new StringBuilder(s);
        String s2=sb.reverse().toString();
        if(s.equals(s2)){
            System.out.println(s+" is a Palindrome"); 
        }
        else{
            System.out.println(s+" is not a Palindrome");
        }
    }
}
