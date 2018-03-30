import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		
		System.out.println("Here is your pattern:");
		for(int i=1; i<=9; i++){
			for(int j=1; j<=i; j++){
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		for(int i=9-1; i>=1; i--){
			for(int j=1; j<=i; j++){
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}

}