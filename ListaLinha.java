class ListaLinha{
  LinhaDeArquivo inicio;
	LinhaDeArquivo fim;

	public ListaLinha(){
		inicio = null;
		fim = null;
	}

	void adicionaLinha(int num, String cont, String nomeArq){
		if(inicio == null){//Lista vazia
			inicio = new LinhaDeArquivo(num,cont,nomeArq);
			fim = inicio;
			return;
		}
	
		fim.proximo() = new LinhaDeArquivo(num,cont);
		fim = fim.proximo();
		return;
	}

}
