import java.io.*;
public class Programa9{
	public static void main(String[] args)throws IOException{
		File a1 = new File("C:/Users/axel/Documents/boleta.txt");
		FileReader f1 = new FileReader(a1);
		BufferedReader b1 = new BufferedReader(f1);
		String s;
		while((s=b1.readLine())!=null){
			System.out.println(s);
		}
	}
}