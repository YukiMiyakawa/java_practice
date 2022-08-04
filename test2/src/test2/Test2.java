package test2;

//import org.apache.commons.lang3.builder.EqualsBuilder;
import java.io.FileWriter;
import java.io.IOException;

public class Test2 {

	String name;
	String addess;

	public static void main(String...args) {
		//System.out.println("test");
		try(
			FileWriter fw = new FileWriter("/Users/miya/Desktop/practice/java/test.txt", true);
		){
			fw.write("ヒャッハー！");
			fw.flush();
		} catch (IOException e) {
			System.out.println("ファイル書き込みエラーです");
		}
	}

//	public boolean equals(Object o) {
//		return EqualsBuilder.reflectionEquals(this, o);
//	}

}
