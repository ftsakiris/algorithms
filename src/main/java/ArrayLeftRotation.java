import java.util.Scanner;

/**
 * A left rotation operation on an array of size n shifts each of the array's elements 1
 * unit to the left. For example, if 2 left rotations are performed on array [1, 2, 3, 4, 5],
 * then the array would become [3, 2, 5, 1, 2].
 */

public class ArrayLeftRotation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        solution(k, a);
    }

    public static int[] solution(int k, int[] a) {
        int res[] = new int[a.length];
        // get the module in order to increase performance
        int newK = k % a.length;
        for (int j = 0; j < a.length; j++) {
            int newIndex = j - newK;
            if (newIndex < 0) {
                newIndex = a.length + newIndex;
            }
            res[newIndex] = a[j];
        }
        return res;
    }
}