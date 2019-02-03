
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String str = "ä,ö,ü,月,understand,水Ä,Ö,Ü ";
		System.out.println(str);
		//Charset utf8charset = Charset.forName("UTF-8");
		Charset iso88591charset = Charset.forName("ISO-8859-1");

		byte[] utf8bytes = str.getBytes(iso88591charset);
		System.out.println(utf8bytes);
		System.out.println(new String(utf8bytes, iso88591charset));

		final String FILENAME = "C:\\Users\\karinkato\\Desktop\\testing.txt";
		try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {

			String sCurrentLine;

			while ((sCurrentLine = br.readLine()) != null) {
				//System.out.println(sCurrentLine);
				String[] s = sCurrentLine.split(",");
				for (int i = 0; i < s.length; i++) {
					
					utf8bytes = s[i].getBytes(iso88591charset);
					//System.out.println(utf8bytes);
					System.out.print(new String(utf8bytes, iso88591charset)+"\t");
					
					//System.out.print(s[i] + "\t");
				}
				System.out.println();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		// String string = new String ( utf8bytes, utf8charset );
		//
		// System.out.println(string);
		//
		// // "When I do a getbytes(encoding) and "
		// byte[] iso88591bytes = string.getBytes(iso88591charset);
		//
		// for ( byte b : iso88591bytes )
		// System.out.printf("%02x ", b);
		//
		// System.out.println();
		//
		// // "then create a new string with the bytes in ISO-8859-1 encoding"
		// String string2 = new String ( iso88591bytes, iso88591charset );
		//
		// // "I get a two different chars"
		// System.out.println(string2);

	}

}
