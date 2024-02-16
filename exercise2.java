public class exercise2 {
    public static void main(String[] args) {
        int x = 0;
        int y = 1;
        System.out.println (x);
        for (int a = 1; a < 10; a++) {
            int z = x + y;
            y = z-y;
            x = z;
            System.out.println (x);
        }
    }
}

/**
 * Big O = O(3) + O(6n)
 *     O = O(6n)
 *     O = O(n)
 */