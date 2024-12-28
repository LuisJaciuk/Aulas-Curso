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
				if(media >= 90) {
					System.out.println("Aprovadissimo, arrasou! media: " + media);
				}else {
					System.out.println("Aprovado direto");
				}
			} else {
				System.out.println("Aluno em recuperação");
			}
		} else {
			System.out.println("Reprovado direto");
		}
	}
}
