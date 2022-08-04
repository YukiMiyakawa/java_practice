package test2;

import java.io.FileWriter;

public class Write {
	FileWriter fw = new FileWriter("¥¥Users¥¥miya¥¥Desktop¥¥practice¥¥java¥¥test.dat", true);
	fw.write('A');
	fw.flush();
	fw.close();
}
