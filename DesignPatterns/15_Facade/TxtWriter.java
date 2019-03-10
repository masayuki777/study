import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

public class TxtWriter {
	private Writer writer;

	public TxtWriter(Writer writer) { // コンストラクタ
		this.writer = writer;
	}

	// プロパティを受け取り値(キー)が25を超えるものをMapに格納
	public Map<String, String> toMap(Properties properties) {
		Map<String, String> propertiesMap = new HashMap<>();
		for (Entry<Object, Object> e : properties.entrySet()) {
			if (Integer.parseInt((String) e.getValue()) > 25) {
				propertiesMap.put(e.getKey().toString(), e.getValue().toString());
			}
		}
		return propertiesMap;
	}

	// ヘッダーを出力
	public void writeHeader() throws IOException {
		writer.write("***************Header***************");
		writer.write(System.lineSeparator());
	}

	// 内容を出力
	public void writeContents(Map<String, String> propertiesMap) throws IOException {
		writer.write("年齢が25歳を超えるメンバーは以下です。");
		writer.write(System.lineSeparator());
		for (Entry<String, String> e : propertiesMap.entrySet()) {
			writer.write("　・名前：" + e.getKey() + "　年齢：" + e.getValue());
			writer.write(System.lineSeparator());
		}
	}

	// フッターを出力
	public void writeFooter() throws IOException {
		writer.write("***************Footer***************");
	}

	// 閉じる
	public void close() throws IOException {
		writer.close();
	}

}
