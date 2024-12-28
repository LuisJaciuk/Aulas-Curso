package curso;

import javax.swing.JOptionPane;

public class entradaDeDados {

	public static void main(String[] args) {
		
		String carros = JOptionPane.showInputDialog("informe a quantidade de carros: ");
		String pessoas = JOptionPane.showInputDialog("informe a quantidade de pessoas: ");
		
		int numeroCarros = Integer.parseInt(carros);
		int pessoaNumero = Integer.parseInt(pessoas); 
				
		int divisao = (numeroCarros / pessoaNumero);
		
		int resto = numeroCarros % pessoaNumero;
		
		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divisão?");
		if(resposta == 0) {
			JOptionPane.showMessageDialog(null, "Divisão para cada pessoas deu " + divisao);			
		}
		resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resto da divisão?");
		if (resposta == 0) {
			JOptionPane.showMessageDialog(null, "O resto é: " + resto);
		}
			
		}
		
		
		
	}
