package estudos;

import java.util.Objects;

public class Funcionario {
	protected String numeroRegistro;
	protected String nome;
	protected String cpf;
	
	public Funcionario(String numeroRegistro, String nome, String cpf) {
		this.numeroRegistro = numeroRegistro;
		this.nome = nome;
		this.cpf = cpf;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpf);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		return Objects.equals(cpf, other.cpf);
	}
	
	

}
