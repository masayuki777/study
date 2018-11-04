package framework;

import java.util.*;

public class Client {
	private HashMap<String, Product> stringName = new HashMap<>();

	// 1. HashMapに登録
	public void register(String name, Product pro) {
		stringName.put(name, pro);
	}

	// 2. createCloneメソッドを使用
	public Product create(String proname) {
		Product p = (Product) stringName.get(proname);
		return p.createClone();
	}
}