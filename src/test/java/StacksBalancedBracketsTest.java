import org.junit.Assert;
import org.junit.Test;

public class StacksBalancedBracketsTest {
    @Test
    public void isBalanced() throws Exception {
        Assert.assertEquals(true, StacksBalancedBrackets.isBalanced("{()}"));
        Assert.assertEquals(true, StacksBalancedBrackets.isBalanced("{[()]}"));
        Assert.assertEquals(false, StacksBalancedBrackets.isBalanced("{[(])}"));
        Assert.assertEquals(true, StacksBalancedBrackets.isBalanced("{{[[(())]]}}"));
        Assert.assertEquals(true, StacksBalancedBrackets.isBalanced("()(())()"));
        Assert.assertEquals(true, StacksBalancedBrackets.isBalanced("(f)(())()"));
    }
}