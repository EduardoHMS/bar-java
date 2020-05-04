package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		char sexo;
		int cerveja, refri, espeto;
		double consumo, couvert, ingresso, total;
		
		
		System.out.println("Sexo: ");
		sexo = sc.next().charAt(0);
		System.out.println("Quantidade de cervejas: ");
		cerveja = sc.nextInt();
		System.out.println("Quantidade de refrigerantes: ");
		refri = sc.nextInt();
		System.out.println("Quantidade de espetinhos: ");
		espeto = sc.nextInt();
		
		
		
		
		if(Character.toLowerCase(sexo) == 'f') {
			ingresso = 8.0;
		}else {
			ingresso = 10.0;
		}
		
		consumo = cerveja * 5.0 + refri * 3.0 + espeto * 7.0;
		
		if(consumo > 30) {
			couvert = 0.0;
		}else {
			couvert = 4.0;
		}
		
		total = ingresso + consumo + couvert;
		
		
		
		System.out.println();
		System.out.println("RELATÓRIO:");
		System.out.printf("Consumo = R$ %.2f%n", consumo);
		if(couvert == 4.0) {
			System.out.println("Couvert = R$ 4.00");
		}else {
			System.out.println("Isento de Couvert");
		}
		System.out.printf("Ingresso = R$ %.2f%n", ingresso);
		System.out.println();
		System.out.printf("Valor a pagar = R$ %.2f%n", total);
		
		sc.close();
	}

}
