
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

public class Encoding {

	private static final String INPUT_FILENAME = "data/input/testing.txt";//C:\\Users\\karinkato\\Desktop\\testing.txt";
	private static final String OUTPUT_FILENAME = "data/output/encode_out_testing.txt";

	public static void main(String[] args) throws IOException {
		Charset iso88591charset = Charset.forName("ISO-8859-1");
		byte[] utf8bytes = null;

		try (BufferedReader br = new BufferedReader(new FileReader(INPUT_FILENAME));
				BufferedWriter bw = new BufferedWriter
					    (new OutputStreamWriter(new FileOutputStream(OUTPUT_FILENAME), iso88591charset));) {

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
