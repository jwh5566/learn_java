package learn_java_5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/** 
 * @author 作者 : jwh5566
 * @version 创建时间：2017年10月30日 下午4:26:45 
 * 类说明 
 */
public class TestFileStream1 {
	public static void main(String[] args) {
		File file1 = new File("C:\\Users\\Administrator\\Desktop\\1.jpg");
		File file2 = new File("C:\\Users\\Administrator\\Desktop\\2.jpg");
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream(file1);
			fos = new FileOutputStream(file2);
			byte[] b = new byte[20];
			
			int len;
			while((len = fis.read(b)) != -1) {
				fos.write(b, 0, len);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}
