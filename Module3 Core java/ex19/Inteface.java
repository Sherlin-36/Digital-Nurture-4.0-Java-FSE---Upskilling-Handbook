import java.util.*;
interface Playable{
    void play();
}
class Guiter implements Playable{
    public void play(){
        System.out.println("playing in Guiter");
    }
}
class Piano implements Playable{
  public void play(){
        System.out.println("playing in Piano");
    }
}
public class Inteface{
    public static void main(String[] args){
    Guiter g=new Guiter();
    Piano p=new Piano();
    g.play();
    p.play();
    }
}
