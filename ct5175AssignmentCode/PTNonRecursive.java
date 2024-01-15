package ct5175AssignmentCode;

import java.util.Scanner;

public class PTNonRecursive {

    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();
        System.out.print("\n");

        for (int i = 0; i < n; i++) {
        	for (int k = 0; k < n - i - 1; k++) {
                System.out.print("  ");
            }      	
        	        	
        	int num = 1;
            for (int j = 0; j <= i; j++) {
            	System.out.printf("%4d", num);
                num = num * (i - j) / (j + 1);
            }
            
            System.out.println();
        }

        input.close();
    }
}