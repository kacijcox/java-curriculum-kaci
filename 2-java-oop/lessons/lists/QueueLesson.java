package lists;
import java.util.LinkedList;
import java.util.Queue;

public class QueueLesson {

	public static void main(String[] args) {


		// queues are a fifo

		Queue<String> queue = new LinkedList<>();

		// we have a queue for adding customers waiting in a line

		// when we add a customer we want to ensure they are helped in the order they arrived

		queue.add("1. 444-333-4444");
		queue.add("2. 222-333-5555");
		queue.add("3. 111-333-2222");

		System.out.println(queue.remove());
		System.out.println(queue.remove());
		System.out.println("peeking: " + queue.peek());

		// .enqueue() add an element to the back of a queue
		enqueue(queue, "4. 777-888-9999");
		enqueue(queue, "5. 555-666-7777");


		System.out.println(queue.poll());

		// use .peek and isEmptyto check if there is a value in the que
		while (true)
			if(!queue.isEmpty()) {
				System.out.println(queue.remove());

			}
		else {
			break;
			}

	}

	private static void enqueue(Queue<String> queue, String s) {
	}
}
