import java.util.*;
public class arrIsSortedOrNot {
    public static void main(String[] args) {
        int[] arr = {11,45,36,7,73221};
        for (int i = 0; i <= arr.length-1; i++) {
            if (arr[i]<arr[i+1]) {
                System.out.print("Array is not sorted.");
                break;
            }
        }
    }
}