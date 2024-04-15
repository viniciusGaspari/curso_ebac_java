/**
 * @authr viniciusGaspari (GitHub)
 * @Link https://github.com/viniciusGaspari
 * 
 */

package MainClass;

import java.util.Scanner;

import Empresa.Empresa;

public class MainClass {

	public static void main(String[] args) {
		
		Empresa empresa = new Empresa();
		
		Scanner key = new Scanner(System.in);

		
		System.out.println("Qual é o seu nome?");
		empresa.nome1(key.nextLine());
		System.out.println("\nQual é o seu salário?");
		empresa.salario1(key.nextDouble());
	
				
		key.close();	}
	
}
