public abstract class Responsible {

	private String name; // このトラブル解決者の名前
	private Responsible next; // たらい回しの先

	public Responsible(String name) { // コンストラクタ トラブル解決者の生成
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public Responsible setNext(Responsible next) { // たらい回しの先を設定
		this.next = next;
		return next;
	}

	public void support(Trouble trouble) { // トラブル解決の手順
		if (resolve(trouble)) {// トラブルが解決できた場合
			done(trouble);
		} else if (next != null) {// トラブルが解決できなかったが次のたらい回しの先が設定されている場合
			next.support(trouble);
		} else {// トラブルが解決できず、次のたらい回しの先も設定されていない場合
			fail(trouble);
		}
	}

	protected abstract boolean resolve(Trouble trouble); // 解決用メソッド

	protected void done(Trouble trouble) { // 解決
		System.out.println(trouble + " は  " + getName() + "が解決しました。");
	}

	protected void fail(Trouble trouble) { // 未解決
		System.out.println("【警告】 " + trouble + " は誰も解決できませんでした。");
	}

}