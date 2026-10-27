import java.util.*;
public class Main11 {
    public static void main(String[] args) {
        int[] arr1 = {5, 3, -1, 2, 1, 8};
        int[] arr2 = {6, 1, 0, 2, 9, 5, 6, 3, 7, 4};
        System.out.println("Test case 1:");
        findingmissingpositive(arr1);
        System.out.println("Test case 2:");
        findingmissingpositive(arr2);
    }
    public static void findingmissingpositive(int[] arr) {
        boolean[] check = new boolean[arr.length + 2];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0 && arr[i] < check.length) {
                check[arr[i]] = true;
            }
        }
        for (int i = 1; i < check.length; i++) {
            if (!check[i]) {
                System.out.println("First Missing positive number: " + i);
                return;
            }
        }
    }
}
