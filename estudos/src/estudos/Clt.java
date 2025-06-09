package estudos;

public class Clt extends Funcionario implements OperacoesDeCalculo{

	public double salario;
	
	public Clt(String numeroRegistro, String nome, String cpf, double salario) {
		super(numeroRegistro, nome, cpf);
		this.salario = salario;
	}



	@Override
	public double calcularPagamento() {
		double inss = salario * 0.11;
		double irrf = salario* 0.07;
		double descontosExtras = 300.0;
		double pagamento = salario- inss- irrf - descontosExtras;
	
		return pagamento;
	}

}
