public class Trouble {

	private int number; // トラブル番号
	private String content; // トラブル内容
	private int level; // トラブルレベル

	public Trouble(int number, String content, int level) { // コンストラクタ トラブルの生成
		this.number = number;
		this.content = content;
		this.level = level;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int revel) {
		this.level = revel;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getNumber() {
		return number;
	}

	public String toString() { // トラブルの文字列表現
		return "[#" + number + " " + content + "(" + level + ")" + "]";
	}

}