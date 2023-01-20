package newProgram;

public class DuplicateNum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int [] a= {1,12,1,56,90,90,68,5756,12,22};
		int dup= a[1];
		for(int i=0;i<=a.length-1;i++) {
			dup=a[i];
			for(int j=0;j<=a.length-1;j++) {
				if(i==j) {
					break;
				}
				else if(dup==a[j]) {
				System.out.println(dup);
				} 
			}
	
		}

	}

}
