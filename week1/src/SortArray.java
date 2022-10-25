import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] a = {1789, 2035, 1899, 1456, 2013};
        int sum = 0;

        System.out.println("Before sort: ");
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d ", a[i]);
            sum += a[i];
        }
        System.out.println();

        Arrays.sort(a);
        System.out.println("After sort: ");
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d ", a[i]);
        }
        System.out.println();

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + (double)sum/a.length);
    }
}
