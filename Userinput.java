import java.util.Scanner;
	class Userinput{
public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	System.out.println("enter a integer");
	int value=sc.nextInt();

		System.out.println("the value is: "+value);
	double x=sc.nextDouble();
		System.out.println("the value is: "+x);
	long y=sc.nextLong();
		System.out.println("the value is: "+y);
	short z=sc.nextShort();
		System.out.println("the value is: "+z);

	boolean a=sc.nextBoolean();
		System.out.println("the value is: "+a);




}
}