package practice.tasks;

import java.util.concurrent.atomic.AtomicReference;

public class Part1 {
	public static void Swap50a(AtomicReference<String> a, AtomicReference<String> b, AtomicReference<String> c) {
		AtomicReference<String> t = new AtomicReference<String>(a.get());
		a.set(b.get());
		b.set(c.get());
		c.set(t.get());
	}

	public static void Swap50b(AtomicReference<String> a, AtomicReference<String> b, AtomicReference<String> c) {
		AtomicReference<String> t = new AtomicReference<String>(a.get());
		a.set(c.get());
		c.set(b.get());
		b.set(t.get());
	}
}
