import java.util.Scanner;
class Primepa{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int count=0;
        for (int i = 2; i < n/2; i++){
            if(n%i==0){
                count++;
                break;
            }
        }

          if(count==0) { System.err.println("prime number");
            int r=0;
            int t=n;
            while(n!=0){
          int d=n%10;
            r=r*10+d;
            n=n/10;
        }
        System.out.println("the reverse of the given number is "+r);
         if(r==t){
            System.err.println("the number is palindrome");
        }
        else{
            System.err.println("the number is not a palindrome");
        }
          
          }
          else{
            System.err.println("not a prime number");}
            }
        }
