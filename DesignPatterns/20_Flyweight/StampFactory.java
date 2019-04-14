package sample;

import java.util.HashMap;
import java.util.Map.Entry;

public class StampFactory {
	// 既に生成したStampインスタンスを管理
	private HashMap<String, Stamp> pool = new HashMap<>();
	// Singletonパターン
	private static StampFactory singleton = new StampFactory();

	// コンストラクタ
	private StampFactory() {
	}

	// シングルトンインスタンスを取得
	public static StampFactory getInstance() {
		return singleton;
	}

	// Stampのインスタンス生成(共有)
	public synchronized Stamp getStamp(char charname) {
		// キー(文字)に紐づく値(Stampインスタンス)を取得する
		Stamp bc = pool.get("" + charname);
		// キー(文字)に紐づく値(Stampインスタンス)が取得できなかった場合
		if (bc == null) {
			// ここでStampのインスタンスを生成
			bc = new Stamp(charname);
			// newした回数をカウント
			bc.setNewCount(bc.getNewCount() + 1);
			// HashMapに格納
			pool.put("" + charname, bc);
		}
		// newの有無にかかわらず利用した回数をカウント
		bc.setUseCount(bc.getUseCount() + 1);
		return bc;
	}

	// HashMapが管理しているStampインスタンスを全件出力
	public void printAllPool() {
		for (Entry<String, Stamp> entry : pool.entrySet()) {
			System.out.println(
					entry.getKey() + " : " + entry.getValue().getUseCount() + " : " + entry.getValue().getNewCount());
		}
	}
}
