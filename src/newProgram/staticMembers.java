package newProgram;

public class staticMembers {
	static int m=1;
	public static void main(String[] args) {
		//System.out.println(m);
		staticMembers d= new staticMembers();
		System.out.println(d.m);
	}
	static {
		System.out.println("hii i am onkar");
	}
}
