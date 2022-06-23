package Questao1;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Questao1 {

	public static void main(String[] args) {
		int opc, contPreco=0, contAno=0, ano1 = 0;
		double valor1, mediaVal = 0, mediaAno = 0;
		
		
		ArrayList<String> carro = new ArrayList();
		
		do {
			
			String menu= JOptionPane.showInputDialog("<1> Cadastrar Carro\n<2> Listagem Geral\n<3> Mostrar Resultados\n<4>SAIR");
			opc = Integer.parseInt(menu);
			switch(opc) {
			case 1:
				 String marca = JOptionPane.showInputDialog("Digite a marca do carro: ");
	             String modelo = JOptionPane.showInputDialog("Digite o modelo do carro: ");
	             String ano = JOptionPane.showInputDialog("Digite o ano do carro: ");
	             ano1 = Integer.parseInt(ano);
	             contAno = contAno += ano1;
	             String valor = JOptionPane.showInputDialog("Digite o valor do carro: ");
	             JOptionPane.showMessageDialog(null, "Inserido com Sucesso");
	             carro.add(marca+"; "+modelo+"; "+ano+"; "+valor);
	             valor1 = Double.parseDouble(valor); 
	             if(valor1>=50000) {
	            	 contPreco++;
	             }
	             
				 break;
			case 2:
				int x = carro.size();
		 	    for (int i=0; i<x; i++) {
		 	    	JOptionPane.showMessageDialog(null, carro.get(i));
		 	    }
				break;
			
			case 3:
				int n1 = carro.size();
				mediaVal = contAno/n1;
				JOptionPane.showMessageDialog(null, "Há " +contPreco+" carro com o valor acima de 50 mil reais");
				JOptionPane.showMessageDialog(null, "O valor da média referente a todos os anos é de: "+mediaVal);
				break;
			case 4:
				break;
				default:
					JOptionPane.showMessageDialog(null, "Insira uma opção válida! Ao digitar 4 o programa irá encerrar");
						
		}
		
		
	}while(opc!=4);

 }
}	
