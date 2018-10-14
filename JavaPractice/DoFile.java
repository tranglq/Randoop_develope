import java.io.File;
import java.io.FileWriter;
//import java.io.IOExeption;
import java.util.Scanner;

class DoFile{
	public static void main(String []argv){
		String string = new String();
		WriteFileString(string);
	}

	public static void WriteFileString(String string){
		Scanner scanner = new Scanner(System.in);
		try{
			File file = new File("fileSample.txt");
			FileWriter fw = new FileWriter(file);
			string = scanner.nextLine();
			fw.write(string);
			fw.close();
	
		}catch(Exception e)
		{
			System.out.println("Loi ghi file" +e);
		}
	}
}