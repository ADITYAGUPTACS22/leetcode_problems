// it is a brute force approach but it not run in all test cases

// public class SumOfSquareNumbers {
//     public static void main(String[] args) {
//         int c = 3;
//         result(c);
//     }

//     public static void result(int num){
//         int n=9;
//         for (int i = 0; i <=9; i++) {
//             for (int j = 0; j <=9; j++) {
//                 if(((i*i+j*j))==num){
//                     System.out.println(true);
//                     return;
//                 }
//             }

//         }
//         System.out.println(false);
//     }
// }

/**
 * SumOfSquareNumbers
 */
public class SumOfSquareNumbers {

    public static boolean result(int c) {
        if (c < 0) {
            return false;
        }

        long leftpointer = 0;
        long rightpointer = (int) Math.sqrt(c);

        while (leftpointer <= rightpointer) {
            long add = leftpointer * leftpointer + rightpointer * rightpointer;
            if (add == c) {
                return true;
            }
            else if(add<c){
                leftpointer++;
            }
            else{
                rightpointer--;
            }
            
        }
        return false;
    }

    public static void main(String[] args) {
        int c = 3;
        System.out.println(result(c));
    }
}