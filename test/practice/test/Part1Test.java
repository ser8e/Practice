package practice.test;

import static org.junit.Assert.*;

import java.util.concurrent.atomic.AtomicReference;

import org.junit.Test;

import practice.tasks.Part1;

public class Part1Test {

	@Test
	public void testSwap50a() {
		AtomicReference<String> a = new AtomicReference<String>("a");
		AtomicReference<String> b = new AtomicReference<String>("b");
		AtomicReference<String> c = new AtomicReference<String>("c");
		Part1.Swap50a(a, b, c);
		assertEquals("b", a.get());
		assertEquals("c", b.get());
		assertEquals("a", c.get());
	}
	
	@Test
	public void testSwap50b() {
		AtomicReference<String> a = new AtomicReference<String>("a");
		AtomicReference<String> b = new AtomicReference<String>("b");
		AtomicReference<String> c = new AtomicReference<String>("c");
		Part1.Swap50b(a, b, c);
		assertEquals("c", a.get());
		assertEquals("a", b.get());
		assertEquals("b", c.get());
	}
}
