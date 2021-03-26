package primeiroprograma;


import javax.swing.JOptionPane;

public class Abrevia {
	public static String s;
	final static String ESPACO = " ";	
	private static String retiraEspacos(String nomeAux) {
		int i = 0;
				
		
		while ((nomeAux.substring(i,i+1)).equals(ESPACO))
			i++;
			nomeAux = nomeAux.substring(i,nomeAux.length());
		
		
		if (nomeAux.length() != 1) { 
			i = nomeAux.length() - 1;
			while ((nomeAux.substring(i-1,i)).equals(ESPACO))
				i--;
				nomeAux = nomeAux.substring(0,i+1);
		}
		
		return nomeAux;
	}
	  
      	
	public static void main(String args[]) {
		boolean erro;
		
		do {
			erro = false;
			try {
				s = JOptionPane.showInputDialog(null,"Entre com o nome completo: ");
				s = Abrevia.retiraEspacos(s);
				}
			
			catch (Exception e) {
				erro = true;
				JOptionPane.showMessageDialog(null,"Nome inválido, redigite!!","Diálogo de Erro",JOptionPane.ERROR_MESSAGE);
			}
		} while (erro == true); // repete ate que nome digitado seja valido

		JOptionPane.showMessageDialog(null,"conteudo: " + s,"RESPOSTA",JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);
	}
	
}