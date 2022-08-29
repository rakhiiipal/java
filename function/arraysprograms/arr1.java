package function.arraysprograms;

public class arr1 {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5 };
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        int avg = sum / arr.length;
        System.out.println(avg);
    }

}
