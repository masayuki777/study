import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

public class Main {
	public static void main(String[] args) {

		// 1.Facadeパターンを適用した場合
		ListFacade.makeMemberList("memberList", "outputFile1");

		// 2.Facadeパターンを未適用の場合
		try {
			String inputFileName = "memberList";
			String outputFileName = "outputFile2";

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
