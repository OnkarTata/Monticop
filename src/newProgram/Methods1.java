package newProgram;

public class Methods1 {

// print character from given string-
//method=Character.isAlphabetic(ch)....ch is char variable
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Print only char from given  string
		
				String city="zaq12wsxcde34rfvbgt56yhnmju78iklo9,.;'/[]oh";
				int count=0;
				for (int i=0;i<city.length();i++) {
					char ch=city.charAt(i);
					
							if(Character.isAlphabetic(ch)) {
							count++;
							System.out.println(ch);
							}
				}
				System.out.println("no of alphabet is"+count);
	}

}
