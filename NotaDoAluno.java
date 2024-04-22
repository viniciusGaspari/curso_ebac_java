package NotaDoAluno;

import java.util.Scanner;

public class NotaDoAluno {

	public static void main(String[] args) {
		
		try(Scanner scan = new Scanner(System.in)) {
			
			int notaMath;
			int notaPt;
			int notaGeo;
			int notaCienc;
			
			System.out.println("O aluno tirou quanto de matématica?");
				notaMath = scan.nextInt();
			
			System.out.println("\nO aluno tirou quanto de português?");
				notaPt = scan.nextInt();
			
			System.out.println("\nO aluno tirou quanto de geografia?");
				notaGeo = scan.nextInt();
				
			System.out.println("\nO aluno tirou quanto de ciências?");
				notaCienc = scan.nextInt();
			
			int mediaSoma = ((notaMath + notaPt) + (notaGeo + notaCienc));
			int mediaTotal = mediaSoma / 4;
			 
 			System.out.println("\nMedia total do aluno é " + mediaTotal);
 			
 			if (mediaTotal >= 7 && mediaTotal <= 10) {
 				System.out.println("\nAPROVADO!");
 			} else if (mediaTotal > 5 && mediaTotal < 7) {
 				System.out.println("\nRECUPERAÇÃO!");
 			} else if (mediaTotal <= 5) {
 				System.out.println("\nREPOVADO!");
 			}
 			
		} catch (Exception e) {
			
			System.out.println("\nSomente número inteiro");
			
		} finally {
			
			System.out.println("\nOperação Finalizada");
	
		}
	}
}
