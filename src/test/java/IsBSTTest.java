import org.junit.Assert;
import org.junit.Test;

public class IsBSTTest {
    @Test
    public void checkBST() throws Exception {
        IsBST.Node root =
                new IsBST.Node(4,
                        new IsBST.Node(2,
                                new IsBST.Node(1, null, null ),
                                new IsBST.Node(3, null, null)),
                        new IsBST.Node(6,
                                new IsBST.Node(5, null, null ),
                                new IsBST.Node(7, null, null))
                        );

        IsBST.Node root2 =
                new IsBST.Node(4,
                        new IsBST.Node(2,
                                new IsBST.Node(1, null, null ),
                                new IsBST.Node(3, null, null)),
                        new IsBST.Node(6,
                                new IsBST.Node(7, null, null ),
                                new IsBST.Node(5, null, null))
                );

        IsBST.Node root3 =
                new IsBST.Node(4,
                        new IsBST.Node(3,
                                new IsBST.Node(1, null, null ),
                                new IsBST.Node(2, null, null)),
                        new IsBST.Node(5,
                                new IsBST.Node(6, null, null ),
                                new IsBST.Node(7, null, null))
                );

        Assert.assertEquals(true, IsBST.checkBST(root));
        Assert.assertEquals(false, IsBST.checkBST(root2));
        Assert.assertEquals(false, IsBST.checkBST(root3));
    }

}