package entities;

public class Conta {
	
	private String nomeTitular;
	private int numero;
	private double saldo;
	
	public Conta(String nomeTitular, int numero) {
		this.nomeTitular = nomeTitular;
		this.numero = numero;
	}

	public Conta(String nomeTitular, int numero, double saldoInicial) {
		this.nomeTitular = nomeTitular;
		this.numero = numero;
		efetuarDeposito(saldoInicial);
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void efetuarDeposito(double valor) {
		if(valor > 0)
			this.saldo += valor;
	}
	
	public void efetuarSaque(double valor) {
		if(valor > 0)
			this.saldo -= (valor + 5);
	}
	
	public String toString() {
		return "\nAccount data:\n"
				+ "Account " + getNumero()
				+ ", Holder: " + getNomeTitular()
				+ ", Balance: $ " + String.format("%.2f\n", getSaldo());
	}
	
	public String mostrarDados() {
		return "\nUpdated account data:\n"
				+ "Account " + getNumero()
				+ ", Holder: " + getNomeTitular()
				+ ", Balance: $ " + String.format("%.2f\n", getSaldo());
	}

}

