public class exercise1 {
    public static void main(String[] args) {
        int[] arr1 = {10, 23, 4, 5, 60};
        int maxnum = arr1[0];
        for (int n = 0; n < arr1.length; n++) {
            if (maxnum < arr1[n]) {
                maxnum = arr1[n];
            }
        }
        System.out.println ("maximum number is " + maxnum);
    }
}

/**
 * Big O = O(2) + O(3n) + O(1)
 *       = O(3n)
 *       = O(n)
 *
 *
 */