package EvenOddQueueSolution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EvenOddQueueTest {
	@Test
	public void testEvenOddQueue_queueNumbers_returnInOrder() {
		EvenOddQueue e = new EvenOddQueue();
		e.enqueue(1);
		e.enqueue(2);
		e.enqueue(3);
		
		assertEquals(1, e.dequeue());
		assertEquals(2, e.dequeue());
		assertEquals(3, e.dequeue());
	}
	
	@Test
	public void testEvenOddQueue_queueOnlyOdds_returnOddsInOrder() {
		EvenOddQueue e = new EvenOddQueue();
		e.enqueue(1);
		e.enqueue(2);
		e.enqueue(3);
				
		assertEquals(1, e.dequeueOdd());
		assertEquals(3, e.dequeueOdd());
		assertEquals(null, e.dequeueOdd());
		assertEquals(1, e.size());
	}
	
	@Test
	public void testEvenOddQueue_queueOnlyEvens_returnEvensInOrder() {
		EvenOddQueue e = new EvenOddQueue();
		e.enqueue(1);
		e.enqueue(2);
		e.enqueue(3);
		e.enqueue(4);
				
		assertEquals(2, e.dequeueEven());
		assertEquals(1, e.peekOdd());
		assertEquals(4, e.dequeueEven());
		assertEquals(null, e.dequeueEven());
		assertEquals(null, e.size());
	}
}
