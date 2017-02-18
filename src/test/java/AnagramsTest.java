import org.junit.Assert;
import org.junit.Test;

public class AnagramsTest {

    @Test
    public void numberNeeded() throws Exception {
        Assert.assertEquals(4, Anagrams.numberNeeded("cde", "abc"));
        Assert.assertEquals(5, Anagrams.numberNeeded("cdef", "abc"));
        Assert.assertEquals(4, Anagrams.numberNeeded("cdef", "abcf"));
        Assert.assertEquals(12, Anagrams.numberNeeded("aaaasaaa", "sdssss"));
    }

}