package EvenOddQueue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EvenOddQueueTest {
	@Test
	public void testEvenOddQueue_queueNumbers_returnInOrder() {
		EvenOddQueue e = new EvenOddQueue();
		e.enqueue(1);
		e.enqueue(2);
		e.enqueue(3);
		
		assertEquals(e.dequeue(), 1);
		assertEquals(e.dequeue(), 2);
		assertEquals(e.dequeue(), 3);
	}
	
	@Test
	public void testEvenOddQueue_queueOnlyOdds_returnOddsInOrder() {
		EvenOddQueue e = new EvenOddQueue();
		e.enqueue(1);
		e.enqueue(2);
		e.enqueue(3);
				
		assertEquals(e.dequeueOdd(), 1);
		assertEquals(e.dequeueOdd(), 3);
		assertEquals(e.dequeueOdd(), null);
		assertEquals(e.size(), 1);
	}
	
	@Test
	public void testEvenOddQueue_queueOnlyEvens_returnEvensInOrder() {
		EvenOddQueue e = new EvenOddQueue();
		e.enqueue(1);
		e.enqueue(2);
		e.enqueue(3);
		e.enqueue(4);
				
		assertEquals(e.dequeueEven(), 2);
		assertEquals(e.peekOdd(), 1);
		assertEquals(e.dequeueEven(), 4);
		assertEquals(e.dequeueEven(), null);
		assertEquals(e.size(), 2);
	}
}
