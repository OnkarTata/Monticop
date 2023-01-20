package newProgram;

public class palindoreNu {
public static void main(String[] args) {
	int num=12321;
	int rev=0;
	while(num>0)
	{
		int last=num%10;
		rev=rev*10+last;
		
	}
	if(num==rev)
	{
		System.out.println("Pilondore");
	}
	else
	{
		System.out.println("Not Pilondore");
	}
}
}
