
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class Test2 {

	private static final String INPUT_FILENAME = "C:\\Users\\karinkato\\Desktop\\testing.txt";
	private static final String OUTPUT_FILENAME = "C:\\Users\\karinkato\\Desktop\\out_testing.txt";

	public static void main(String[] args) throws IOException {
		Charset iso88591charset = Charset.forName("ISO-8859-1");
		byte[] utf8bytes = null;

		try (BufferedReader br = new BufferedReader(new FileReader(INPUT_FILENAME));
				BufferedWriter bw = new BufferedWriter(new FileWriter(OUTPUT_FILENAME));) {

			String sCurrentLine;

			while ((sCurrentLine = br.readLine()) != null) {
				utf8bytes = sCurrentLine.getBytes(iso88591charset);
				bw.write(new String(utf8bytes, iso88591charset));
				bw.newLine();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
