package LoopContador;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		System.out.println("Digite o número da tabuada");
		
		
		try (Scanner scan = new Scanner(System.in);) {
			 contadorTab(scan.nextInt());
			 
		} catch (Exception e) {
			System.out.println("Só funciona com números inteiros");
			
		} finally {
			System.out.println("\nTabuada finalizada");
		}
		
	}
	
	public static int contadorTab(int num) {
		
		for (int i = 0; i <= 10; i++) {
			
			int total = num * i;
		
			System.out.printf("\nTabuado do %d x %d é %d", num, i, total);
		}
		
		return num;
	}
	
}
