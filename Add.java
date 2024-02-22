import java.util.Scanner;
class Add{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.print("Enter first number: ");
		int num1=s.nextInt();
		System.out.print("Enter second number: ");
		int num2=s.nextInt();
		int num3=num1+num2;
		System.out.println(num1+"+"+num2+"="+num3);
	}
}