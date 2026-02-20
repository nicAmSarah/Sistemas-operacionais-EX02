package view;

import javax.swing.JOptionPane;

import cotroller.Frases;

public class Main {
	
	public static void main(String[] args){
				
		String frase = JOptionPane.showInputDialog(null, "Digite uma frase com ; separando elas");
		
        Frases controller = new Frases();
        
        int qntFrases = controller.quantPalavras(frase);
        
        JOptionPane.showConfirmDialog(null, "Quantidade de palavras na frase " + qntFrases);
        

	}
	
}
