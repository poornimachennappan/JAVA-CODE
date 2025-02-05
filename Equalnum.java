import java.util.Scanner;
class Equalnum 
{
	public static void main(String[] args) 
	{
		Scanner a=new Scanner(System.in);
		int num1=a.nextInt();
		int num2=a.nextInt();
		if(num1==num2){
			System.out.println("Number 1 and 2 is equal");
		}
		else{
			System.out.println("Number 1 and 2 is not equal");
		}
	}
}
