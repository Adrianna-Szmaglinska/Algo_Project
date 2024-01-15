package ct5175AssignmentCode;

import java.util.Scanner;

public class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(arr, low, high);

            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i+1] and arr[high] (pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter numbers, hit space to add new number and enter to finish your array input: ");
        String[] userNums = in.nextLine().split(" ");
        int[] arr = new int[userNums.length];

        for (int i = 0; i < userNums.length; i++) {
            arr[i] = Integer.parseInt(userNums[i]);
        }

        quickSort(arr, 0, arr.length - 1);

        // Output the sorted array
        System.out.print("Array Sorted using Quick Sort: \n");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        
        in.close();
    }
}