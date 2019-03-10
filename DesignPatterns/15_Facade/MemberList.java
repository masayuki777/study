import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class MemberList {
	private MemberList() { // newでインスタンス生成させないためにprivate宣言
	}

	public static Properties getProperties(String fileName) { // ファイル名からPropertiesを得る
		fileName = "C:\\work\\Facade\\src\\" + fileName + ".txt";
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream(fileName));
		} catch (IOException e) {
			System.out.println(String.format("ファイルの読み込みに失敗しました。ファイル名:%s", fileName));
		}
		return properties;
	}
}
