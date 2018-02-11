import java.io.*;
import java.util.Scanner;
public class Programa7{
	public static void main(String[] args) throws IOException{
		Scanner l = new Scanner(System.in);
		File a1 = new File("C:/Users/axel/Documents/numeros.txt");
		BufferedWriter b1 = new BufferedWriter(new FileWriter(a1));
		int array [] = new int [200];
		int con=2;
		for(int i=0;i<200;i++){
			array[i]=con;
			con=con+2;
			b1.write(array[i]+(" "));
		}
		b1.close();
	}
}
