package function.arraysprograms;

import java.util.Scanner;

public class arr6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of elements in array :");
        int n = scan.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the " + n + " elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println("The array entered is as follows :");

        for (int i = 0; i < n; i++) {
            System.out.print(" " + arr[i]);
        }

    }

}
