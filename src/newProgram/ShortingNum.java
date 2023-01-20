package newProgram;

import java.util.Arrays;

public class ShortingNum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] sss= {10,40,90,80,77};
for(int i=sss.length-1 ;i>=0;i--) {
	System.out.print(sss[i]);//i=4
	System.out.print("  ");
}

System.out.println("\n sorting no.");

System.out.println("descending order");

Arrays.sort(sss);
//descending
 for(int i=sss.length-1 ;i>=0;i--) {
	System.out.print(sss[i]);//i=4
	System.out.print("   ");
}
System.out.println("\n by defalt sorting");
 for(int i:sss) {
	 System.out.print(i);
	 System.out.print("  ");
 }
 
 int [] arr=new int[6];
 arr[0]=34;
 arr[1]=45;
 arr[2]=94;
 arr[3]=55;
 arr[4]=84;
 arr[5]=05;
  System.out.println("\n");
 for(int i:arr) {
	 System.out.print(i);
	 System.out.print("  ");
 }
 //for each loop

 
 System.out.println("\n ascending order");
 //ascending
 Arrays.sort(arr);
 for(int i:arr) {
	 System.out.print(i);
	 System.out.print("  ");
 }

 /*for(int i=0;i<arr.length;i++) {
	 System.out.print(arr[i]);//i=4
		System.out.print("   ");

 }*/
	
	}
}
