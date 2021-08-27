import java.util.Scanner;

public class Triangulos {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		
		double l1, l2, l3;
		
		System.out.print("Valor do PRIMEIRO lado: ");
		l1 = leitor.nextDouble();
		System.out.print("Valor do SEGUNDO lado: ");
		l2 = leitor.nextDouble();
		System.out.print("Valor do TERCEIRO lado: ");
		l3 = leitor.nextDouble();
	
		leitor.close();
		
		System.out.println("");
		System.out.println("*************************************");
		
		if (l1 < l2 + l3 && l2 < l1 + l3 && l3 < l2 + l1) {
			
			if (l1 == l2 && l1 == l3) {
				System.out.println("Seu triângulo é EQUILÁTERO!");
				
			}else if (l1 != l2 && l1 != l3) {
				System.out.println("Seu triângulo é ESCALENO!");
				
			} else {
				System.out.println("Seu triângulo é  ISÓCELES");
			}
			
		}else {
			System.out.println("Sua figura não é um triângulo!");
		}
	
	}

}
