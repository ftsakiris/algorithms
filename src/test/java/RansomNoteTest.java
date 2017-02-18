import org.junit.Assert;
import org.junit.Test;

import java.util.Hashtable;
import java.util.Map;

public class RansomNoteTest {

    @Test
    public void solution() throws Exception {

        Map<String, Integer> magazine = new Hashtable<>();
        magazine.put("give", 1);
        magazine.put("me", 1);
        magazine.put("one", 1);
        magazine.put("grand", 1);
        magazine.put("today", 1);
        magazine.put("night", 1);

        Map<String, Integer> ransomNote = new Hashtable<>();
        ransomNote.put("give", 1);
        ransomNote.put("one", 1);
        ransomNote.put("grand", 1);
        ransomNote.put("today", 1);

        Assert.assertEquals("Yes", RansomNote.solution(magazine, ransomNote));
    }

}