import java.util.Scanner;
class Average 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int maths=sc.nextInt();
		int science=sc.nextInt();
		int social=sc.nextInt();
		int tamil=sc.nextInt();
		int english=sc.nextInt();
		int a=maths+science+social+tamil+english;
		System.out.println("ADDITION:"+a);
		int average=a/5;
		System.out.println("AVERAGE:"+average);
		if(average<35){
			System.out.println("Additional class is required");
		}
	    else{
		    System.out.println("you are good to go");
}
		}
}