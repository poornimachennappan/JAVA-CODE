import java.util.Scanner;
class PatternNew 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
		int a=sc.nextInt();
		
		for(int i=0;i<a;i++){
			for(int j=0;j<a-i-1;j++){
				System.out.print(" ");
			}
			for(int k=0;k<2*i+1;k++){
				System.out.print("*");
			}
			System.out.println();
		}
        for(int i=a-1;i>=0;i--){
			for(int j=1;j<=a-i-1;j++){
				System.out.print(" ");
			}
			for(int k=2*i+1;k>0;k--){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
