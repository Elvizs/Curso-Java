//Gerente eh funcionario autenticavel, gerente herda da
//classe FuncionarioAutenticavel

public class Gerente extends Funcionario implements Autenticavel {
	
	private AutenticacaoUtil autenticador;
	
	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}

	public double getBonificacao() {
		System.out.println
		("Chamando o método bonificação do GERENTE");
	    return super.getSalario();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
		
	}

	@Override
	public boolean autentica(int senha) {
		return this.autentica(senha);
	}
	
}