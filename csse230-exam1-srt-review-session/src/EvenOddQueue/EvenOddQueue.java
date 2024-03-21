package EvenOddQueue;
import java.util.ArrayList;

public class EvenOddQueue {
	// Add your necessary fields here:
	
	// Implement the following methods:
	public EvenOddQueue() {
		// TODO implement this method
	}
	
	/**
	 * enqueues an element onto your queue
	 * @param value The value to enqueue
	 */
	public void enqueue(Integer value) {
		// TODO implement this method
	}
	
	/**
	 * returns the first element that was enqueued but has yet to be dequeued, should be O(1)
	 * @return the dequeued element
	 */
	public Integer dequeue() {
		return null; // TODO implement this method
	}
	
	/**
	 * This method is not strictly needed, but can be helpful in your other methods
	 * @return
	 */
	private boolean isEmpty() {
		return false; // TODO implement this method
	}

	/**
	 * dequeues the first even element that was enqueued but has yet to be dequeued, should be O(N)
	 * @return the dequeued element or null if no evens exist.
	 */
	public Integer dequeueEven() {
		return null; // TODO implement this method
	}
	
	/**
	 * dequeues the first even element that was enqueued but has yet to be dequeued, should be O(N)
	 * @return the dequeued element or null if no evens exist.
	 */
	public Integer dequeueOdd() {
		return null; // TODO implement this method
	}
	
	
	/**
	 * gets the next element to be dequeued, should be done in O(1) time
	 * @return the front element of the queue, or null if none exist
	 */
	public Integer peek() {
		return null; // TODO implement this method
	}
	
	/**
	 * gets the first even element in the queue, should be done in O(N) time
	 * @return the first even element in the queue, or null if none exist
	 */
	public Integer peekEven() {
		return null; // TODO implement this method		
	}
	
	/**
	 * gets the first even element in the queue, should be done in O(N) time
	 * @return the first even element in the queue, or null if none exist
	 */
	public Integer peekOdd() {
		return null; // TODO implement this method
	}

	/**
	 * gets the quantity of items currently in the queue
	 * @return the size of the queue
	 */
	public Integer size() {
		return null; // TODO implement this method
	}
}
