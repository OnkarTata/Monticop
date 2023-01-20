package newProgram;

public class FindAlphabetic {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Print only char from given  string
		
				String city="P23u123n545e345klje34";
				int count=0;
				for (int i=0;i<city.length();i++) {
					char ch=city.charAt(i);
					
							if(Character.isAlphabetic(ch)) {
							count++;
							System.out.println(ch);
							}
				}
				System.out.println("no of alphabet is"+count);
		System.out.println("Coments from github teamlead");
	}
}
