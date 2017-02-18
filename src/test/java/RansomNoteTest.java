import org.junit.Assert;
import org.junit.Test;

public class RansomNoteTest {
    @Test
    public void solution() throws Exception {
        Assert.assertEquals("Yes", RansomNote.solution(
                new String[]{"give", "me", "one", "grand", "today", "night"},
                new String[]{"give", "one", "grand", "today"}));
    }

}