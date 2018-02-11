import java.util.Scanner;
public class Programa4{
	public static void main(String[] args){
		Scanner l = new Scanner(System.in);
		System.out.print("Primer numero: ");
		int a = l.nextInt();
		System.out.print("Segundo numero: ");
		int b = l.nextInt();
		if(a==b) System.out.printf("Los numeros son iguales");
		if(a<b) System.out.printf(b+" es mayor que "+a);
		else System.out.printf(a+" es mayor que "+b);
	}
}