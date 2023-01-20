package newProgram;

public class primeNO {
	public static void main(String[] args) {
		int n =100;
		int count=0;
		for(int a=2;a<=n;a++) 
		{
			for(int i=1;i<=a;i++) 
			{
				if(a%i==0) 
				{
					count++;//1/2
				}
			}
			if(count<=2) {
			System.out.println(a+"this number is prime");
			}
			count=0;
		}
	}
}