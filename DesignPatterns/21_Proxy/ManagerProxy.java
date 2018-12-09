public class ManagerProxy implements Management {
	private String projectName;
	private Manager real;

	public ManagerProxy() {
		this.projectName = "無題の案件";
	}

	public ManagerProxy(String projectName) {
		this.projectName = projectName;
	}

	@Override
	public synchronized void setReviewProjectName(String projectName) {
		// 1.本人役が生成・設定されていれば本人役にプロジェクト名を設定する。
		if (real != null) {
			real.setReviewProjectName(projectName);
		}
		// 1.本人役が生成・設定されていなければ代理人役にプロジェクト名を設定する。
		this.projectName = projectName;
	}

	@Override
	public String getReviewProjectName() {
		return projectName;
	}

	@Override
	public void printReviewResult() {
		realize();
		real.printReviewResult();
	}

	private synchronized void realize() {// 2.本人役が生成・設定されていない場合に本人役を生成・設定する
		if (real == null) {
			real = new Manager(projectName);
		}
	}
}
