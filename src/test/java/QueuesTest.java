import org.junit.Test;

public class QueuesTest {

    @Test
    public void test1() {

        Queues.MyQueue<Integer> myQueue = new Queues.MyQueue();

        myQueue.enqueue(42);
        myQueue.dequeue();
        myQueue.enqueue(14);
        System.out.println(myQueue.peek());
        myQueue.enqueue(28);
        System.out.println(myQueue.peek());
        myQueue.enqueue(68);
        myQueue.enqueue(78);
        myQueue.dequeue();
        myQueue.dequeue();
    }
}