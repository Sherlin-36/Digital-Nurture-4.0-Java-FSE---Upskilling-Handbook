import java.util.*;
 class Animal{
    public void makeSound(){
        System.out.println("Sound");
    }
}
 class Dog extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Bark");
    }
}
public class Inheritance{
    public static void main(String[] args){
        Animal a=new Animal();
        Dog d= new Dog();
        a.makeSound();
        d.makeSound();
    }
    }
