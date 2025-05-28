import java.util.*;
public class Arraysumavg{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=a[i];
        }
        int avg=sum/n;
        System.out.println("sum:"+sum);
        System.out.println("avg:"+avg);
        
    }
}