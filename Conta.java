package revisao;

public class Conta {
	protected int numero;
	protected String agencia;
	protected double saldo;
	protected boolean status;
	
	public Conta(int numero, String agencia, double saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
		this.status = true;
	}
	
	
	
	public void desativar() {
		this.status = false;
	}

}
