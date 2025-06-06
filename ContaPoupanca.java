package revisao;

public class ContaPoupanca extends Conta implements OperacoesBasicas {

	public ContaPoupanca(int numero, String agencia, double saldo) {
		super(numero, agencia, saldo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mostrarSaldo() {
		// TODO Auto-generated method stub
		System.out.println("O saldo do usuário é: "+ saldo);
	}

	@Override
	public void sacar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void depositar() {
		// TODO Auto-generated method stub
		
	}

}
