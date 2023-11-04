//Q.Take an array as input from the user.search for a given number x and print the index at which it occurs.
import java.util.*;
public class question1 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int size=sc.nextInt();
        int numbers[]= new int[size];

        //input
        for(int i=0;i<size;i++)
        {
            numbers[i]=sc.nextInt();
        }
        int x =sc.nextInt();//jis value ko search krna h usko input liya
        for(int i=0;i<size;i++){
          if(numbers[i]==x){
              System.out.println(numbers[i]);
          } 
        }
    }

    
}
