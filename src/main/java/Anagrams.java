import java.util.*;

/**
 * We consider two strings to be anagrams of each other if the first string's letters
 * can be rearranged to form the second string. In other words, both strings must contain the same exact
 * letters in the same exact frequency For example, bacdc and dcbac are anagrams, but bacdc and dcbad are not.
 *
 * Given two strings,  and , that may or may not be of the same length, determine the minimum number of
 * character deletions required to make a and b anagrams. Any characters can be deleted from either of the strings.
 */

public class Anagrams {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }

    public static int numberNeeded(String first, String second) {
        Map<Character, Integer> firstMap = initMap(first);
        Map<Character, Integer> secondMap = initMap(second);
        Integer count = 0;
        count = countValue(firstMap, secondMap, count);
        count = countValue(secondMap, firstMap, count);
        return count;
    }

    private static Integer countValue(Map<Character, Integer> firstMap, Map<Character, Integer> secondMap, Integer count) {
        for (Character character : firstMap.keySet()) {
            Integer value = secondMap.get(character);
            Integer value2 = firstMap.get(character);
            if (value != null) {
                if (value < value2) {
                    count += value2 - value;
                }
            } else {
                count += value2;
            }
        }
        return count;
    }

    private static Map<Character, Integer> initMap(String text) {
        Map<Character, Integer> map = new Hashtable<>();
        for (char c : text.toCharArray()) {
            Integer value = map.get(c);
            if (value != null) {
                value ++;
            } else {
                value = 1;
            }
            map.put(c, value);
        }
        return map;
    }
}