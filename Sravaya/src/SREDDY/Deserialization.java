package SREDDY;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
public class Deserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException  {
		// TODO Auto-generated method stub
		String path = "D:\\ranjeet\\savedobject.ser";
		System.out.println("Retrive object from hard disk");
		try {
			FileInputStream fileInputStream = new FileInputStream(path);
			ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
			department1 d = (department1) inputStream.readObject();
			d.display();

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
	}

	}

}
