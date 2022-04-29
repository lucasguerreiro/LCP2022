package java01;

import java.util.Scanner;

public class ExercicioX {
	
	static float prova_recuperacao() {
		Scanner scan = new Scanner(System.in);
		float nova_nota = scan.nextFloat();
		System.out.println("Nova nota " + nova_nota);
		scan.close();
		return nova_nota;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		float NF = scan.nextFloat();
		if (NF < 5) {
			try {
				float nova_nota = prova_recuperacao();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("Aprovado");
		}

	}

}
