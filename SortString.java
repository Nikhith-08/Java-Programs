import java.util.*;

class SortString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of strings: ");
        int n = s.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            arr[i] = s.next();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("\nSorted array of strings are: ");
        for (int i = 0; i < n; i++) {
            System.out.println("String " + (i + 1) + ": " + arr[i]);
        }
    }
}
