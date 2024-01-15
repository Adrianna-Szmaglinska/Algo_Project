package ct5175AssignmentCode;

import java.util.Scanner;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter numbers, hit space to add new number and enter to finish your array input: ");
        String[] userNums = in.nextLine().split(" ");
        int[] arr = new int[userNums.length];

        for (int i = 0; i < userNums.length; i++) {
            arr[i] = Integer.parseInt(userNums[i]);
        }

        selectionSort(arr);

        // Output the sorted array
        System.out.print("Array Sorted using Selection Sort: \n");
        for (int num : arr) {
            System.out.print(num + " ");
        
        }
        
        in.close();
    }
}

