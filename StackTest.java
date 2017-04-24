package world;
import static org.junit.Assert.*;
import org.junit.Test;
import world.Stack;

public class StackTest {
	
	@Test
	public void isEmptyTest() {
		Stack s=new Stack(10);
		s.push('i');
		boolean result=s.isEmpty();
		assertEquals(false,result);
		
	}
	@Test
	public void popTest() {
		Stack s=new Stack(10);
s.push('i');
		s.push('f');
		Object result=s.pop();
		assertEquals('f',result);
		
	}
	@Test
	public void DisplayTest() {
		Stack s=new Stack(10);
		s.push('i');
		s.push('f');
		String result=s.display();
		assertEquals("[f,i,]",result);
		
	}


		
	}




