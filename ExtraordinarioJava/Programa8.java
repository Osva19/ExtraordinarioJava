import java.util.Scanner;
import java.io.*;
public class Programa8{
	public static void main(String[] args)throws IOException{
		Scanner l = new Scanner(System.in) ;
		File a1 = new File("C:/Users/axel/Documents/boleta.txt");
		BufferedWriter b1 = new BufferedWriter(new FileWriter(a1));
		System.out.printf("Nombre del alumno: ");
		String nom;
		nom = l.nextLine();
		String mat [] = new String [5];
		for(int i=0;i<5;i++){
			System.out.printf("Materia "+(i+1));
			mat[i]=l.next();
		}
		int p1 [] = new int [5];
		int p2 [] = new int [5];
		double prom [] = new double [5];
		for(int i=0;i<5;i++){
			System.out.printf("Parcial 1 (0-100): ");
			p1[i] = l.nextInt();
			if(p1[i]>=0&&p1[i]<=100){
				System.out.printf("Parcial 2 (0-100): ");
				p2[i] = l.nextInt();
				if (p2[i]>=0&&p2[i]<=100){
					prom[i]=p1[i]+p2[i];
					prom[i]=prom[i]/2;
				}
				else System.out.printf("Formato invalido");
			}
			else System.out.printf("Formato invalido");
		}
		b1.write("==================================================\r\n");
			b1.write("==============="+nom+"===================\r\n");
			b1.write("==================================================\r\n");
		for(int i=0;i<5;i++){
			b1.write(mat[i]+"   "+p1[i]+"   "+p2[i]+"   "+prom[i]+"\r\n");
			b1.write("==================================================\r\n");

		}
		b1.close();
	}
}