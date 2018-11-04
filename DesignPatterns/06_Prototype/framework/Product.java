package framework;

import java.lang.Cloneable;

// 1. java.lang.Cloneableを継承
public interface Product extends Cloneable {
	public abstract void display(String s);

	// 2. createCloneメソッドを宣言
	public abstract Product createClone();
}