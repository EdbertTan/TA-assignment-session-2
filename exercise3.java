public class exercise3 {
    public static void main(String[] args) {
        int var1 = 0;
        int[] arr1 = {100, 521, -76, -12, 174};
        for (int n = 0; n < arr1.length; n++){
            if (arr1[n] != 0 && arr1[n] != -1){
                var1 = 0;
            }
            else {
                var1=1;
                break;
            }
        }
        if (var1==0){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}

/**
 * Big O = O(2) + O(4n) + O(1)
 *     O = O(4n)
 *     O = O(n)
 */
