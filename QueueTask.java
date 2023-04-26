import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueTask {

	public static void main(String[] args) {
		PriorityQueue<String> q1 = new PriorityQueue<>();
		q1.add("GooglePixel");
		q1.add("Apple");
		q1.add("Samsung");
		q1.add("Nokia");
		q1.add("Xiomi");
		System.out.println("Head element:"+q1.peek());
		System.out.println("Head element which will be removed: "+q1.poll());
		q1.remove();
		Iterator <String> itr = q1.iterator();
		System.out.println("Final Queue after removing 2 elements: ");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}

}
