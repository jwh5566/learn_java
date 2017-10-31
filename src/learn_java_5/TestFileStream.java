package learn_java_5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author ���� : jwh5566
 * @version ����ʱ�䣺2017��10��30�� ����4:01:48 ��˵��
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
