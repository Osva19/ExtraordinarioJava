import java.util.Scanner;
public class Programa10{
	public static void main(String[] args){
		System.out.println("Numero de columnas de la matriz: ");
		Scanner l = new Scanner(System.in);
		int c = l.nextInt();
		System.out.println("Numero de filas de la matriz: ");
		int f = l.nextInt();
		char matriz [][] = new char [c][f];
		for(int i1=0;i1<f;i1++){
			for(int i2=0;i2<c;i2++){
				System.out.print("x ");
			}
			System.out.print("\n");
		}
	}
}