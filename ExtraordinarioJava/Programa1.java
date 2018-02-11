import java.util.Scanner;
public class Programa1{
	public static void main(String[] args){
		Scanner l = new Scanner(System.in);
		System.out.printf("Lado 1: ");
		double a=l.nextInt();
		System.out.printf("Lado 1: ");
		double b=l.nextInt();
		System.out.printf("Lado 1: ");
		double c=l.nextInt();
		double s=a+b+c;
		s=s/2;
		double area;
		area = (s)*(s-a)*(s-b)*(s-c);
		area = Math.sqrt(area);
		System.out.print("El area del triangulo es: "+area);

	}
}