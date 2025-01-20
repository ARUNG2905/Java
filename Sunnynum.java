import java.util.Scanner;
class Sunnynum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("enter the number");
        int n=sc.nextInt();
        boolean flag =false;
        int s=n+1;
        for(int i=1;i<=s/2;i++){
            
            if(i*i==s){
                flag=true;
            System.err.println( n+" its a sunny num");
            break;
            }
        }
        if(flag == false)
        System.err.println(s+" it is not a sunny num");


    }
}