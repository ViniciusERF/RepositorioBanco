package pacote;

public class ClasseConta {
	
	short atributoNumeroConta; // 0
	float atributoSaldoConta; // 0.0
	String atributoTipoConta; // null
	
	ClassePessoa atributoPessoa;
	
	void metodoDepositar(float parametroValorEnviado){
		
		this.atributoSaldoConta += parametroValorEnviado;
	}
	
	void metodoSacar(float parametroValorSaque){
		if(this.atributoSaldoConta < parametroValorSaque){
			System.out.println("Limite insuficiente!");
		}else{
			this.atributoSaldoConta = this.atributoSaldoConta - parametroValorSaque;
		}	
	}
	
	void metodoTransferir(float parametroValorTransferido, ClasseConta origem, ClasseConta destino){
		origem.atributoSaldoConta -= parametroValorTransferido;
		destino.atributoSaldoConta += parametroValorTransferido;
	}
	
}
