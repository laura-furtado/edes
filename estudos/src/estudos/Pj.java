package estudos;

public class Pj extends Funcionario implements OperacoesDeCalculo{

	public double valorHora;
	
	
	public Pj(String numeroRegistro, String nome, String cpf, double valorHora) {
		super(numeroRegistro, nome, cpf);
		this.valorHora = valorHora;
	}


	@Override
	public double calcularPagamento() {
		double faturamento = valorHora*40;
		double custos = 400;
		double pagamento = faturamento - custos;
		return pagamento;
	}

}
