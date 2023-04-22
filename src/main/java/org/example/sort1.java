package org.example;

public class sort1 {
    public static void main(String[] args) {
        int[] a = {10, 3, 8, 15, 6, 12, 2, 18, 17, 15, 14};
        int n = a.length;
        int s = 0;
        int e = n - 1;
        quicksort(a, s, e);
    }


    private static void quicksort(int[] a, int s, int e) {
        if (s >= e) {
            return;

        }
        int p = partion(a, s, e);
        quicksort(a, s, p - 1);
        quicksort(a, p + 1, e);


    }

    private static int partion(int[] a, int s, int e) {
        int p1 = 1;
        int p2 = a.length - 1;
        while (p1 <= p2) {
            if (a[0] >= a[p1]) {
                p1++;
            } else if (a[p2] > a[0]) {
                p2--;
            } else {
                swap(a, p1, p2);
                p1++;
                p2--;
            }

        }
        swap(a, p2, 0);
        return p2;
    }

    private static void swap(int[] a, int p1, int p2) {
        int temp = p1;
        p1 = p2;
        p2 = temp;
    }
}
