import java.util.*;
public class Cal{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the numbers:");
int a=sc.nextInt();
int b=sc.nextInt();
System.out.println("Enter your choice");
int choice=sc.nextInt();
switch(choice){
case 1:
System.out.println(a+b);
break;
case 2:
System.out.println(a-b);
break;
case 3:
System.out.println(a*b);
break;
case 4:
System.out.println(a/b);
break;
case 5:
System.out.println(a%b);
break;
default:
System.out.println("Enter a correct choise");
} 
}
}