import java.util.*;
public class StringRev{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder sb=new StringBuilder(s);
        System.out.println(sb.reverse().toString());
        
    }
}