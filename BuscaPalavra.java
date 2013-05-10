import java.io.File;
import java.util.Scanner;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

class BuscaPalavra{
  Scanner reader;
	HashMap indice;
	File arquivo;
	
	public BuscaPalavra(File arq){
		if(arq.exists()){
			try{
				arquivo = arq;
				reader = new Scanner(arquivo);
			}catch(IOException e){
				System.out.println("Erro ao abrir o arquivo");
			}
		
			indice = new HashMap();
			
		}else{
			System.out.println("Arquivo não existe!");
		}
	}
	
	
	public int numeroDeOcorrencias(String palavra){//Busca sequencial.
		int num = 0;
		try{
			reader = new Scanner(arquivo);
		}catch(IOException e){
			e.printStackTrace();
		}
		while(reader.hasNext()){
			if(palavra.equals(reader.next()))
				num++;
		}
		indice.put(palavra,num);
			
		return num;
	}
	
	public int buscaIndice(String palavra){
		if(indice.get(palavra)!=null)
			return (int)indice.get(palavra);
			
		return numeroDeOcorrencias(palavra);		
	}

}
