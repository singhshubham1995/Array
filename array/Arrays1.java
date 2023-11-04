import java.util.*;
public class Arrays1 {
    public static void main(String[] args) {
       // int marks[]={78,89,75};
       Scanner sc=new Scanner(System.in); //scanner class ka object bnaya
       int size=sc.nextInt();             //input liya
       int numbers[]=new int [size];     //declaring int type array
      //input
      for(int i=0;i<size;i++)
      {
        numbers[i]=sc.nextInt();
      }
       //output
       for(int i=0;i<size;i++)          
       {
        System.out.println(numbers[i]);
       }

    }
}
