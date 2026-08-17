import java.util.Scanner;
public class LinearSearch {
    static int search(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.print("Enter element to search: ");
        int target = sc.nextInt();
        int index = search(numbers, target);
        if (index != -1) {
            System.out.println(
                    "Element found at index: " + index
            );
        } else {
            System.out.println("Element not found.");
        }
        sc.close();
    }
}