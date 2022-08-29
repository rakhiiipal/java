package function.arraysprograms;

import java.util.Scanner;

public class arr5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("The elements of the array are as follows :");

        for (int i = 0; i < 5; i++)

        {
            arr[i] = sc.nextInt();

        }
        System.out.println("Array is Full !");

    }

}
