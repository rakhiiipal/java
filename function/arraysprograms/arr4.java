package function.arraysprograms;

public class arr4 {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5, 6 };
        int largest = 0;
        for (int num : arr) {
            if (largest < num) {
                largest = num;
            }

        }
        System.out.println("The largest number in the array is : " + largest);

    }

}
