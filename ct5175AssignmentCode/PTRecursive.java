package ct5175AssignmentCode;

import java.util.Scanner;

public class PTRecursive {
    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();
        System.out.print("\n");

        for (int i = 0; i < n; i++) {
        	for (int k = 0; k < n - i - 1; k++) {
                System.out.print("  ");
        	}
        	
        	 printPascalRow(i);
            System.out.println();
        }
        
        input.close();
    }

    private static void printPascalRow(int row) {
        for (int j = 0; j <= row; j++) {
            System.out.printf("%4d", pascalValue(row, j));
        }
    }

    private static int pascalValue(int row, int col) {
        if (col == 0 || col == row) {
            return 1;
        } else {
            return pascalValue(row - 1, col - 1) + pascalValue(row - 1, col);
        }
    }
}
