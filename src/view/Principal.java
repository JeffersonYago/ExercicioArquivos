package view;
import javax.swing.JOptionPane;

import controller.ArquivosController;

public class Principal {

	public static void main(String[] args) throws Exception{

		ArquivosController ar = new ArquivosController();
		
		String dir = "C:\\TEMP";
		String nome = "generic_food.csv";
		String diretorio = "C://";
		int opc = 0;
		while(opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("1 - checar se diretório existe\n2 - ler arquivo\n9 - sair"));
			switch(opc) {
			case 1: 
					ar.ReadDir(diretorio);
					break;
			case 2: ar.readFile(dir,nome);
					break;
			case 9: System.exit(0);
					
					
				}
		}
	}
}
