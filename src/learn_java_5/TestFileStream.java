package learn_java_5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 作者 : jwh5566
 * @version 创建时间：2017年10月30日 下午4:01:48 类说明
 */
public class TestFileStream {
	public static void main(String[] args) {
		File file = new File("hello.txt");
		FileOutputStream fs = null;
		try {
			fs = new FileOutputStream(file);
			fs.write(new String("my name is jwh55766").getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fs.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
