import java.io.*;
import java.io.IOException;

/*

	Example class for http://file-leak-detector.kohsuke.org/ project

*/

public class ExampleOpenFileDescriptor {

	public static void main (String[] args) throws InterruptedException, IOException {
		new ExampleOpenFileDescriptor().run();
	}


	public void run() throws InterruptedException, IOException {
		File file = new File("/tmp/example");

		if ( file.createNewFile()){
			System.out.println("File created");
		} else {
			System.out.println("File alredy exists");
		}

		FileReader fileReader = new FileReader(file); // <-- Only from this line we'll have an open descriptor

		Thread.sleep(60 * 1000);
	}
}
