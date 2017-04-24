package world;
import static org.junit.Assert.*;
import org.junit.Test;
import world.BalancingExpression;
public class BalancingExpressionTest {

	@Test
	public void test() {
		BalancingExpression be=new BalancingExpression();
		boolean result=be.balancing("{(a,b)}");
		assertEquals(true,result);
		
	}
	@Test
	public void test2() {
		BalancingExpression be=new BalancingExpression();
		boolean result=be.balancing("{(a},)))))b");
		assertEquals(false,result);
		
	}
	@Test
	public void test3() {
		BalancingExpression be=new BalancingExpression();
		boolean result=be.balancing("{((a,b))}");
		assertEquals(true,result);
		
	}

}

