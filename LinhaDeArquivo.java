class LinhaDeArquivo{
  int numero;
	String conteudo;
	LinhaDeArquivo prox;
	
	public LinhaDeArquivo(int num, String cont){
		this.numero = num;
		this.conteudo = cont;
	}

	void setLinha(int num, String cont){
		this.numero = num;
		this.conteudo = cont;
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
