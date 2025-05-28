import java.util.*;
public class Car{
    String makes;
    String model;
    int year;
    public void displaydetails(){
        System.out.println(makes);
        System.out.println(model);
        System.out.println(year);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        Car c=new Car();
        c.makes=sc.nextLine();
        c.model=sc.nextLine();
        c.year=sc.nextInt();
        c.displaydetails();
    }
}