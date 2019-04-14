package sample;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		// Stampインスタンスの準備
		StampFactory factory = StampFactory.getInstance();
		ArrayList<Stamp> stamps = new ArrayList<>();
		stamps.add(factory.getStamp('a'));
		stamps.add(factory.getStamp('b'));
		stamps.add(factory.getStamp('c'));
		stamps.add(factory.getStamp('f'));
		stamps.add(factory.getStamp('e'));
		stamps.add(factory.getStamp('a'));
		stamps.add(factory.getStamp('b'));
		stamps.add(factory.getStamp('c'));
		stamps.add(factory.getStamp('d'));
		stamps.add(factory.getStamp('f'));
		stamps.add(factory.getStamp('a'));
		for (Stamp s : stamps) {
			s.print();
		}
		System.out.println("-------------------------------");
		System.out.println("charname : useCount : newCount");
		// HashMapで管理されているStampインスタンスを全件出力
		factory.printAllPool();
	}
}