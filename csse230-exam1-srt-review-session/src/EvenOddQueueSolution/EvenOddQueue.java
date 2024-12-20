package EvenOddQueueSolution;
import java.util.ArrayList;

public class EvenOddQueue {
	// Add your necessary fields here:
	ArrayList<Integer> queue;
	
	
	// Implement the following methods:
	public EvenOddQueue() {
		queue = new ArrayList<Integer>();
	}
	
	/**
	 * enqueues an element onto your queue
	 * @param value The value to enqueue
	 */
	public void enqueue(Integer value) {
		queue.add(0, value);
	}
	
	/**
	 * returns the first element that was enqueued but has yet to be dequeued, should be O(1)
	 * @return the dequeued element
	 */
	public Integer dequeue() {
		return queue.remove(queue.size() - 1);
	}
	
	/**
	 * This method is not strictly needed, but can be helpful in your other methods
	 * @return
	 */
	private boolean isEmpty() {
		return queue.size() == 0;
	}

	/**
	 * dequeues the first even element that was enqueued but has yet to be dequeued, should be O(N)
	 * @return the dequeued element or null if no evens exist.
	 */
	public Integer dequeueEven() {
		int i = queue.size() - 1;
		while (queue.get(i) % 2 != 0) {
			i --;
			if (i < 0) {
				return null;
			}
		}
		return queue.remove(i);
	}
	
	/**
	 * dequeues the first even element that was enqueued but has yet to be dequeued, should be O(N)
	 * @return the dequeued element or null if no evens exist.
	 */
	public Integer dequeueOdd() {
		int i = queue.size() - 1;
		while (queue.get(i) % 2 == 0) {
			i --;
			if (i < 0) {
				return null;
			}
		}
		return queue.remove(i);
	}
	
	
	/**
	 * gets the next element to be dequeued, should be done in O(1) time
	 * @return the front element of the queue, or null if none exist
	 */
	public Integer peek() {
		return queue.get(queue.size() - 1);
	}
	
	/**
	 * gets the first even element in the queue, should be done in O(N) time
	 * @return the first even element in the queue, or null if none exist
	 */
	public Integer peekEven() {
		int i = queue.size() - 1;
		while (queue.get(i) % 2 != 0) {
			i --;
			if (i < 0) {
				return null;
			}
		}
		return queue.get(i);
	}
	
	/**
	 * gets the first even element in the queue, should be done in O(N) time
	 * @return the first even element in the queue, or null if none exist
	 */
	public Integer peekOdd() {
		int i = queue.size() - 1;
		while (queue.get(i) % 2 == 0) {
			i --;
			if (i < 0) {
				return null;
			}
		}
		return queue.get(i);
	}

	/**
	 * gets the quantity of items currently in the queue
	 * @return the size of the queue
	 */
	public Integer size() {
		return queue.size(); // TODO implement this method
	}
}
