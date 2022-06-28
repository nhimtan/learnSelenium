package serializeFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import danhBa.DanhBa;

public class SerializeFile {
	public static boolean saveFile(ArrayList<DanhBa>dSDanhBa, String path ){
		try {
			FileOutputStream fos = new FileOutputStream(path);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(dSDanhBa);
			oos.close();
			fos.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	public static ArrayList<DanhBa> readFile(String path){
		ArrayList<DanhBa> dsDanhBa = new ArrayList<DanhBa>();
		try {
			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object data = ois.readObject();
			dsDanhBa = (ArrayList<DanhBa>)data;
			ois.close();
			fis.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dsDanhBa;
	}

}
