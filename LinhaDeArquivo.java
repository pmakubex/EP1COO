class LinhaDeArquivo{
  	int numero;
	String conteudo;
	String nomeArq;
	LinhaDeArquivo prox;
	
	public LinhaDeArquivo(int num, String cont, String nome){
		this.numero = num;
		this.conteudo = cont;
		this.nomeArq = nome;
	}

	void setLinha(int num, String cont, String nome){
		this.numero = num;
		this.conteudo = cont;
		this.nomeArq = nome;
	}

	boolean temProximo(){
		if(proximo!=null)
			return true;

		return false;
	}

	LinhaDeArquivo proximo(){
		return prox;
	}
	
}
