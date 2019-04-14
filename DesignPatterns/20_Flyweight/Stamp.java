package sample;

public class Stamp {
	// 文字
	private char charname;
	// 利用回数
	private int useCount = 0;
	// 生成回数
	private int newCount = 0;

	public int getUseCount() {
		return useCount;
	}

	public void setUseCount(int useCount) {
		this.useCount = useCount;
	}

	public int getNewCount() {
		return newCount;
	}

	public void setNewCount(int newCount) {
		this.newCount = newCount;
	}

	// コンストラクタ
	public Stamp(char charname) {
		this.charname = charname;
	}

	// 文字を表示する
	public void print() {
		System.out.println("charname:" + this.charname);
	}
}
