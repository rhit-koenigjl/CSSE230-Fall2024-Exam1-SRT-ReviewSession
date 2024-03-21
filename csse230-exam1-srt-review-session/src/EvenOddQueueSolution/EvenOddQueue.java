package EvenOddQueueSolution;
import java.util.ArrayList;

public class EvenOddQueue {
	// Add your necessary fields here:
	ArrayList<Integer> queue;
	
	// Implement the following methods:
	public EvenOddQueue() {
		this.queue = new ArrayList<Integer>();
	}
	
	public void enqueue(Integer value) {
		this.queue.add(0, value);
	}
	
	public Integer dequeue() {
		if (this.isEmpty()) {
			return null;
		}
		return this.queue.remove(this.queue.size() - 1);
	}
	
	private boolean isEmpty() {
		return this.queue.size() == 0;
	}

	public Integer dequeueEven() {
		for (int i = this.queue.size() - 1;i >= 0;i --) {
			int a = this.queue.get(i);
			if (a % 2 == 0) {
				this.queue.remove(i);
				return a;
			}
		}
		return null;
	}
	
	public Integer dequeueOdd() {
		for (int i = this.queue.size() - 1;i >= 0;i --) {
			int a = this.queue.get(i);
			if (a % 2 == 1) {
				this.queue.remove(i);
				return a;
			}
		}
		return null;
	}
	
	public Integer peek() {
		return this.queue.get(0);
	}
	
	public Integer peekEven() {
		for (int i = this.queue.size() - 1;i >= 0;i --) {
			int a = this.queue.get(i);
			if (a % 2 == 0) {
				return a;
			}
		}
		return null;		
	}
	
	public Integer peekOdd() {
		for (int i = this.queue.size() - 1;i >= 0;i --) {
			int a = this.queue.get(i);
			if (a % 2 == 1) {
				return a;
			}
		}
		return null;
	}

	public Integer size() {
		return this.queue.size();
	}
	
	public String toString() {
		return this.queue.toString();
	}
}
