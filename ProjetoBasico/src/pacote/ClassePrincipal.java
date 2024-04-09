package pacote;

public class ClassePrincipal {

	public static void main(String[] args) {
		
		ClasseConta objeto_conta_um; /// Criou a variável
		objeto_conta_um = new ClasseConta(); // Instanciou o objeto
		
		ClasseConta objeto_conta_dois = new ClasseConta(); //Criou a variável
		
		System.out.println(objeto_conta_um.atributoNumeroConta);
		System.out.println(objeto_conta_um.atributoSaldoConta);
		System.out.println(objeto_conta_um.atributoTipoConta);
		
		System.out.println(objeto_conta_dois.atributoNumeroConta);
		System.out.println(objeto_conta_dois.atributoSaldoConta);
		System.out.println(objeto_conta_dois.atributoTipoConta);
		
		objeto_conta_um.atributoPessoa = new ClassePessoa(); //Instanciou o objeto.
		
		objeto_conta_um.atributoPessoa.atributoNomePessoa = "Fulano";
		objeto_conta_um.atributoPessoa.atributoDocumentoPessoa = 333;
		
		objeto_conta_dois.atributoPessoa = new ClassePessoa(); //Instanciou o objeto.
		
		objeto_conta_dois.atributoPessoa.atributoNomePessoa = "Ciclano";
		objeto_conta_dois.atributoPessoa.atributoDocumentoPessoa = 553;
		
		
		objeto_conta_um.metodoDepositar(500.00F);
		System.out.println(objeto_conta_um.atributoSaldoConta);
		
		objeto_conta_um.metodoSacar(500.00F);
		System.out.println(objeto_conta_um.atributoSaldoConta);
		
		objeto_conta_um.metodoTransferir(500.00F, objeto_conta_um, objeto_conta_dois);
		
		System.out.println(objeto_conta_um.atributoSaldoConta);
		System.out.println(objeto_conta_dois.atributoSaldoConta);

	}

}
