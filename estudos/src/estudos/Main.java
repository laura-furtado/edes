package estudos;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		Clt c1 = new Clt("001", "Ana Souza", "123.456.789.91", 5000.8);
		Pj p1 = new Pj("002", "Ana Cláudia", "123.783.193-87", 4000.2);
		
		double pagamentoc1 = c1.calcularPagamento();
		System.out.println("Funcionário CLT: "+ c1.nome);
		System.out.println("Salário bruto: "+ c1.salario);
		System.out.printf("Pagamento líquido: R$ %.2f%n", pagamentoc1);
		
		System.out.println("\n-------------------------------------\n");
		double pagamentoP1 = p1.calcularPagamento();
		System.out.println();
		System.out.println("Funcionário PJ: "+ p1.nome);
		System.out.println("Valor hora: "+ p1.valorHora);
		System.out.printf("Pagamento líquido: R$" + pagamentoP1);
		
		HashSet<Funcionario> funcionarios = new HashSet<Funcionario>();
		
		funcionarios.add(c1);
		funcionarios.add(p1);
		funcionarios.add(c1);
		
		System.out.println("\n-------------------------------------\n");
		for(Funcionario f: funcionarios) {
			System.out.println(f.nome );
		}
		
		teclado.close();
	}
	

}
