import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;


public class Wiederholung_NIO {
public static void main(String[] args) {
	System.getProperties().list(System.out);
	Properties p = System.getProperties(), p2= new Properties(), p3= new Properties();


		try {
			p2.load(new BufferedInputStream(new FileInputStream("test2.properties")));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	try {
		p2.store(new BufferedOutputStream(new FileOutputStream("test2.properties")), "update");
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	

}
}

