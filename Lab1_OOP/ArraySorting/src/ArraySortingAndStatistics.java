//Exercise 6.5: Sorting Arrays, Calculate sum, average.
import java.util.Arrays;

public class ArraySortingAndStatistics {
    public static void main(String[] args) {
        // Khởi tạo một mảng các số nguyên
        int[] numbers = {5, 12, 3, 18, 7, 15, 9};

        // Sắp xếp theo thứ tự tăng dần
        Arrays.sort(numbers);

        System.out.println("Sorted array: " + Arrays.toString(numbers));

        // tính tổng các phần tử trong mảng
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        // Tính trung bình cộng các phần tử trong mảng
        double average = (double) sum / numbers.length;

        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of array elements: " + average);
    }
}
