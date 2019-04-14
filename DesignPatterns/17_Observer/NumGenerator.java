import java.util.ArrayList;
import java.util.List;

public abstract class NumGenerator {

	// ObserverのListを保持
	private List<Observer> observers = new ArrayList<>();

	// Observerを追加
	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	// Observerを削除
	public void deleteObserver(Observer observer) {
		observers.remove(observer);
	}

	// Observerへ通知
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(this);
		}
	}

	// 数を取得する
	public abstract int getNumber();

	// 数を生成する(状態の更新)
	public abstract void execute();
}
