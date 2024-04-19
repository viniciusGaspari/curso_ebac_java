package TarefaCalculoMedia;

public class MainClass {
	
	public static void main(String[] args) {

		double s = somaOp(1);
		
		if (s >= 100) {
			System.out.println("é maior");
		} else {
			System.out.println("é menor");
		}
			
	}		
	public static double somaOp (double num) {
		
		int somaResult = (14 + 45) * 7;
		int divResult = somaResult / 3;
		
		System.out.println(num);
		double mathPowResult = Math.pow(divResult, num);
		System.out.println(mathPowResult);
		
		return mathPowResult;
		
	}
}
