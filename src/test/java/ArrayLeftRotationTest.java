import org.junit.Test;

public class ArrayLeftRotationTest {
    @Test
    public void solution() throws Exception {
        int[] res = ArrayLeftRotation.solution(54, new int[]{1, 2, 3, 4, 5});
        for (int re : res) {
            System.out.print(re + " ");
        }
    }

}