import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;

public class RansomNoteTest {
    @Test
    public void solution() throws Exception {

        Assert.assertEquals("Yes", RansomNote.solution(
                new LinkedList<>(Arrays.asList("give", "me", "one", "grand", "today", "night")),
                new String[]{"give", "one", "grand", "today"}));
    }

}