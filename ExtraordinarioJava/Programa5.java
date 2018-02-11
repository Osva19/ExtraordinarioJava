import java.util.Scanner;
public class Programa5{
	public static void main(String[] args){
		int i,t;
		int[] a = new int[5];
		
		Scanner l = new Scanner(System.in);
		for(i=0;i<5;i++){
			System.out.printf("Introduce el numero "+(i+1)+": ");
			a[i]=l.nextInt();
		}
		i=0;
			while(i<4){				
				if(a[i]>a[i+1]){
					t=a[i+1];
					a[i+1]=a[i];
					a[i]=t;
					i=0;
				}
				else{
					i++;
				}
			}
		System.out.printf("El numero mayor es "+a[4]+"\nEl numero menor es "+a[0]+"\nY el promedio es "+((a[1]+a[2]+a[3]+a[4]+a[0])/5));

	}
}