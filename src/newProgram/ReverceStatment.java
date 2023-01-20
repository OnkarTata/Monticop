package newProgram;

public class ReverceStatment {

	public static void main(String[] args) {

		String name = "India is my country";
		
		//String split method
		String[] words= name.split(" ");
	     String result =" ";
		for(int i=words.length-1; i>=0; i--) {
			
			result =result + words[i] + " ";
			
		} System.out.println(result);

		
		/*
String re="welcome in our group";
//when space detected put word in other string in rverse manner
String ss="";
int k=re.length();

for (int i=re.length()-1;i>=0;i--) {
	
	if(re.charAt(i)==32) {
		for(int j=i+1;j<k;j++) {
			ss=ss+re.charAt(j) ;
				}
		k=i;
		ss=ss+" ";
		
	}
	
}
for(int j=0;j<k;j++) {
	ss=ss+re.charAt(j) ;
	
		}

System.out.println(ss);
*/
	}

}
