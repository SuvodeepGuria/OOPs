import java.util.ArrayList;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        mergeSort(arr, 0, n - 1);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void mergeSort(int[] arr, int l, int h) {
        if (l >= h) {
            return;
        }
        int mid = (h + l) / 2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, h);
        merge(arr, l, mid, h);
    }

    public static void merge(int[] a, int l, int mid, int h) {
        ArrayList<Integer> ans = new ArrayList<>();
        int left = l;
        int right = mid + 1;

        while (left <= mid && right <= h) {
            if (a[left] <= a[right]) {
                ans.add(a[left]);
                left++;
            } else {
                ans.add(a[right]);
                right++;
            }
        }
        while (left <= mid) {
            ans.add(a[left]);
            left++;
        }
        while (right <= h) {
            ans.add(a[right]);
            right++;
        }

        for (int i = 0; i < ans.size(); i++) {
            a[l + i] = ans.get(i);
        }
    }
}