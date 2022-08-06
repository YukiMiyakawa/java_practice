package test2;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class Net {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		URL url = new URL("https://www.youtube.com/watch?v=GHc_22tQ7Kk");
		InputStream is = url.openStream();
		InputStreamReader isr = new InputStreamReader(is);
		int i = isr.read();
		while (i != -1) {
			System.out.print((char)i);
			i = isr.read();
		}
		isr.close();
	}

}
