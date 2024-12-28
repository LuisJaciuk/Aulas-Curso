package curso;

public class opLogicas {

	public static void main(String[] args) {

		/*
		 * int mediaAluno = 70; String nome = "Luis";
		 * 
		 * if (mediaAluno >= 70 && nome.equals("Luis")) {
		 * System.out.println("Esta Aprovado"); } else {
		 * System.out.println("Reprovado"); }
		 */
		/*
		int nota1 = 30;
		int nota2 = 50;
		int nota3 = 40;
		int nota4 = 90;
		int media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		// condição logica com IF e ELSE
		if (media >= 70) {
			System.out.println("Aprovado. media: " + media);
		} else if (media >= 40 && media <= 69) {
			System.out.println("em recuperação. Media: " + media);
		} else {
			System.out.println("Reprovado. Media: " + media);
		}

		// Operadores ternários são para micro validações

		String saidaResultado;

		saidaResultado = media >= 70 ? "Aluno Aprovado"
				: (media >= 40 && media <= 69) ? "Aluno em recuperação" : "Aluno Reprovado";

		System.out.println(saidaResultado);

		// operações logicas aninhadas: são operações dentro de operações

		if (media >= 50) {
			if (media >= 70) {
				if (media >= 90) {
					System.out.println("Aprovadissimo, arrasou! media: " + media);
				} else {
					System.out.println("Aprovado direto");
				}
			} else {
				System.out.println("Aluno em recuperação");
			}
		} else {
			System.out.println("Reprovado direto");
		}

		// SWITCH CASE: operações exatas.
		int dia = 4;
		switch (dia) {
		case 1:
			System.out.println("domingo");
			break;
		case 2:
			System.out.println("segunda-feira");
			break;
		case 3:
			System.out.println("terça-feira");
			break;
		default:
			System.out.println("Outro dia: " + dia);
			break;
		}

		// operadores relacionais
		int valor = 10;
		int valor2 = 20;

		if (valor == valor2) {
			System.out.println("os valores são iguais");
		} else {
			System.out.println("os valores são diferentes");
		}

		if (valor != valor2) {
			System.out.println("os valores são diferentes");
		} else {
			System.out.println("os valores são iguais");
		}

		if (valor > valor2) {
			System.out.println(valor + " é maior que " + valor2);
		} else if (valor == valor2) {
			System.out.println(valor + " é igual a " + valor2);
		} else {
			System.out.println(valor + " é menor que " + valor2);
		}
		/*
		// Estrutura de repetição WHILE
		
		/*
		int numero = 0;

		while (numero <= 3) { // Verifica e depois executa o codigo
			System.out.println("O numero é igual a: " + numero);
			numero++;
		}
		int numero2 = 0;

		do {// primeiro executa e depois verifica
			System.out.println("O numero é igual a: " + numero2);
			numero2++;

		} while (numero2 <= 3);
		*/

		//estrutura de repetição FOR
		/*
		for(int numero = 0; numero <= 10; numero++) {
			System.out.println("Numero: " + numero);
		}
		for(int numero2 = 10; numero2 >= 0; numero2--) {
			System.out.println("Numero: " + numero2);
		}
		*/
		
	
		/*
		for(int numero = 0; numero <= 10; numero++) {
			System.out.println("Numero: " + numero);
			if(numero == 5) {
				System.out.println("encontrei o numero " + numero);
				System.out.println("Parando de executar...");
				break;
			}
		}
		*/
		//estrutura de repetição FOR com continue
		/*
		for(int numero = 0; numero <= 10; numero++) {
			System.out.println("Numero: " + numero);
			if(numero == 5 || numero == 6 || numero == 9) {
				System.out.println("encontrei o numero " + numero);
				System.out.println("vou continuar a contagem...");
			continue;
			}
			System.out.println("teste");
		}
		*/
		
		//Módulo: resto da divisão %
		
		double carros = 9;
		double pessoas = 2;
		
		double resto = carros % pessoas;
		
		System.out.println("sobraram exatamente " + resto + " Carros"); //MOD
		
		
		
	}
}
