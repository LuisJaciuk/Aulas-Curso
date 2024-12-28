package curso;

public class opLogicas {

	public static void main(String[] args) {
		
		/*int mediaAluno = 70;
		String nome = "Luis";
		
		if (mediaAluno >= 70 && nome.equals("Luis")) {
			System.out.println("Esta Aprovado");
		} else {
			System.out.println("Reprovado");
		}
		*/	
		
		int nota1 = 40;
		int nota2 = 30;
		int nota3 = 40;
		int nota4 = 50;
		int media = 0;
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		if (media >= 70) {
			System.out.println("Aprovado. media: " + media);
		} else if (media >= 40 && media <= 69) {
			System.out.println("em recuperação. Media: " + media);
		} else {
			System.out.println("Reprovado. Media: " + media);
		}

		
		
		
	}
}
