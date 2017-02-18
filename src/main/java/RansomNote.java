import java.util.LinkedList;
import java.util.Scanner;

/**
 *A kidnapper wrote a ransom note but is worried it will be traced back to him.
 * He found a magazine and wants to know if he can cut out whole words from it and use
 * them to create an untraceable replica of his ransom note. The words in his note are
 * case-sensitive and he must use whole words available in the magazine, meaning he cannot
 * use substrings or concatenation to create the words he needs.
 * replicate his ransom note exactly using whole words from the magazine;
 * otherwise, print No.
 *
 * Input Format
 * The first line contains two space-separated integers describing the respective values of m
 * (the number of words in the magazine) and n (the number of words in the ransom note).
 * The second line contains m space-separated strings denoting the words present in the magazine.
 * The third line contains n space-separated strings denoting the words present in the ransom note.
 */

public class RansomNote {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        String magazine[] = new String[m];
        for(int magazine_i=0; magazine_i < m; magazine_i++){
            magazine[magazine_i] = in.next();
        }
        String ransom[] = new String[n];
        for(int ransom_i=0; ransom_i < n; ransom_i++){
            ransom[ransom_i] = in.next();
        }
        System.out.println(solution(magazine, ransom));
    }

    public static String solution(String magazine[], String ransom[]) {
        final String YES = "Yes";
        final String NO = "No";

        LinkedList<String> magazineList = new LinkedList();
        for (String s : magazine) {
            magazineList.add(s);
        }
        String res = NO;
        for (String s : ransom) {
            if (magazineList.contains(s)) {
                magazineList.remove(s);
                res = YES;
            } else {
                return NO;
            }
        }
        return res;
    }
}