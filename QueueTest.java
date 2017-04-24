package world;
import static org.junit.Assert.*;

import org.junit.Test;

import world.Queue;


public class QueueTest {

	@Test
	public void test() {
		Queue q=new Queue(10);
		q.enQueue('i');
		boolean result=q.isEmpty();
		assertEquals(false,result);
		
	}
	@Test
	public void deQueueTest() {
		Queue q=new Queue(10);
		q.enQueue('i');
		q.enQueue('f');
		Object result=q.deQueue();
		assertEquals('i',result);
		
	}
	
	@Test
	public void DisplayTest() {
		Queue q=new Queue(10);
		q.enQueue('i');
		q.enQueue('f');
		String result=q.display();
		assertEquals("[i,f,]",result);
		
	}

}



