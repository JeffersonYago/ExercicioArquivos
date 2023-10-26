package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
public class ArquivosController {

	public ArquivosController() {
		super();
	}
		public void ReadDir(String path) throws IOException {
			File dir = new File(path);
			if (dir.exists() && dir.isDirectory()) {
				File[] files = dir.listFiles();
				for(File f: files) {
					if(!f.isFile()) {
						f.getName();
						String diretorio = f.toString();
						if (diretorio.contains("TEMP")) {
							System.out.println("o diretório 'TEMP' existe");
							System.out.println("-------------------------------------------");
						}
						
					}
					
				}
			}
			else {
				throw new IOException("Diretório 'TEMP' não existe");
			}
			
		}
		
		
		public void readFile(String path, String nome) throws IOException{
			File arq = new File(path,nome);
			if(arq.exists() && arq.isFile()) {
				FileInputStream fluxo = new FileInputStream(arq);
				InputStreamReader leitor = new InputStreamReader(fluxo);
				BufferedReader buffer  = new BufferedReader(leitor);
				String linha = buffer.readLine();
				while (linha != null) {
					String[] Splitter = linha.split(",");
					if(linha.contains("fruits"))
					System.out.println(Splitter[0]+"-->"+ Splitter[1]+"-->"+Splitter[3]);
					linha = buffer.readLine();
				}
				buffer.close();
				leitor.close();
				fluxo.close();
				
			}else {
				throw new IOException("Arquivo Inválido");
			}
		}
}

