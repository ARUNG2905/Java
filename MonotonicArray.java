
import java.util.Scanner;

// wajp to find the array is monotonic Array or not
public class MonotonicArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("index value");
        int n = sc.nextInt();
        int[] ar= new int[n];
        for (int i = 0; i < ar.length; i++) {
            ar[i]=sc.nextInt();
        }
        boolean f=false;
        boolean f1=false;
        for (int i = 1; i < ar.length; i++) {
            
                if(ar[i]>ar[i-1]){
                    f=true;
                   
                }
               else if(ar[i]<ar[i-1]){
                f1=true;
               }
                }
                if(f==false||f1==false){
                    System.out.println("it is monotonic array");
                }
                else{
                    System.out.println("it is not monotonic array");
                }
            
        }
    }

