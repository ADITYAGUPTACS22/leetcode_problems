
public class Count_Triplets_That_Can_Form_Two_Arrays_of_Equal_XOR {
    public static int countTriplets(int[] arr, int count) {
        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            for (int k = i + 1; k < arr.length; k++) {
                val = val ^ arr[k];
                if (val == 0) {
                    count += (k - i);
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int count = 0;
        int[] arr = { 1,1,1,1,1};
        System.out.println(countTriplets(arr,count));
    }
}
