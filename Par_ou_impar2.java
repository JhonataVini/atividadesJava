import java.util.Scanner;

public class Par_ou_impar {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	int num, resto;
	int par1, par2;
		System.out.println("Digite um numero : ");
		num = teclado.nextInt();
		
		resto = num % 2;
			
		if(resto == 0) {
		par1 = num -2;
		par2 = num + 2;
		}
		
		else { 
		
		par1 = num  - 1;
		par2 = num + 1;
		}
		
		
		System.out.println(" numero anterior " + par1 +" , "+ num  + " numero posterior " + par2 );

	}

}
