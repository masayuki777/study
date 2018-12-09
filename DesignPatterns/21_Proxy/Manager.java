import java.util.Random;

public class Manager implements Management {
	private String projectName;

	public Manager() {
		this.projectName = "無題の案件";
		heavyJob("Managementのインスタンスを生成し、Rv中");
	}

	public Manager(String projectName) {
		this.projectName = projectName;
		heavyJob("Managementのインスタンス(" + projectName + ")を生成し、Rv中");
	}

	@Override
	public void setReviewProjectName(String projectName) {
		this.projectName = projectName;
	}

	@Override
	public String getReviewProjectName() {
		return projectName;
	}

	private void heavyJob(String msg) { // 1.生成時に必要(という設定)な重い処理
		System.out.print(msg);
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.print("・");
		}
		System.out.println("Rv完了。");
	}

	@Override
	public void printReviewResult() { // 2.乱数によってreviewの結果を振り分けて出力する処理
		System.out.println("----------Rv結果----------");
		Random rnd = new Random();
		int ran = rnd.nextInt(10);
		if (ran < 5) {
			System.out.println(projectName + "は却下されました。\n");
		} else if (ran > 5) {
			System.out.println(projectName + "は承認されました。\n");
		}
	}

}
