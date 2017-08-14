import java.util.Scanner;

/*public class Solution {
	
	
	public static  int[] decimalToBinaryX(int x){
		
		int [] a = new int [31];
		
		for(int i = 0; i < 31; i++){
			
			if (x%2 == 1){
				a[i] = 1;
			}else{
				a[i] = 0;
			}
			
			x = x/2;
			
		}
		return a;
		
	}
	
	public static int[] decimalToBinaryY(int y){
		
		int [] b = new int [31];
		
		for(int i = 0; i < 31; i++){
			
			if(y%2 ==1){
				b[i] = 1;
			}else{
				b[i] = 0;
				
			}
			
			y = y/2;
			
		}
		return b;
	}
	
	public static int arrayDifference(int[] a, int[] b){
		
		int n = 0;
		
		for(int j = 0; j < 31; j++){
			if (a[j] != b[j]){
				n++;
			}
		}
		
		return n;
	}
	
	
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please input x.");
		int x = input.nextInt();
		System.out.println("Please input y.");
		int y = input.nextInt();
		
		int [] a = decimalToBinaryX(x);
		int [] b = decimalToBinaryY(y);
		
		int n = arrayDifference(a, b);
		
		
		System.out.println(n);
		
		
		
	}

}
*/

public class Solution {
	/*
	public static int hammingDistance(int x, int y){
		int [] a = new int [31];
		int [] b = new int [31];
		
		for(int i = 0; i < 31; i++){
			
			if (x%2 == 1){
				a[i] = 1;
			}else if(y%2 == 1){
				b[i] = 1;
			}else{
				a[i] = 0;
				b[i] = 0;
			}
			
			x = x/2;
			y = y/2;
			
		}
		
		int n = 0;
		
		for(int j = 0; j < 31; j++){
			if (a[j] != b[j]){
				n++;
			}
		}
		
		return n;
	}
	*/
	
	public static int hammingDistance(int x, int y){
		
		int n = 0;
		do{
			if(x%2 ==1 && y%2 != 1){
				n++;
			}else if(x%2 != 1 && y%2 ==1 ){
				n++;
			}
			x = x/2;
			y = y/2;
		}while(x != 0 || y != 0);
		
		return n;
	}
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please input x.");
		int x = input.nextInt();
		System.out.println("Please input y.");
		int y = input.nextInt();
		
		
		int n = hammingDistance(x,y);
		
		
		System.out.println(n);
	}
	
}
