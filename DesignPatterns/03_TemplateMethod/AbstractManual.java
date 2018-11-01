package templateMethod;

public abstract class AbstractManual {
	public abstract void start();

	public abstract void work();

	public abstract void end();

	public final void operation() {
		start();
		for (int i = 0; i < 3; i++) {
			work();
		}
		end();
	}
}
