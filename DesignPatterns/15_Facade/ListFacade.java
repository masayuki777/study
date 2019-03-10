import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

public class ListFacade {
	private ListFacade() { // newでインスタンス生成させないためにprivate宣言
	}

	public static void makeMemberList(String inputFileName, String outputFileName) {
		try {
			Properties memberProperties = MemberList.getProperties(inputFileName);
			outputFileName = "C:\\work\\Facade\\src\\" + outputFileName + ".txt";
			TxtWriter writer = new TxtWriter(new FileWriter(outputFileName));
			Map<String, String> propertiesMap = writer.toMap(memberProperties);
			writer.writeHeader();
			writer.writeContents(propertiesMap);
			writer.writeFooter();
			writer.close();
			System.out.println(String.format("ファイルを出力しました。ファイル名:%s", outputFileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
