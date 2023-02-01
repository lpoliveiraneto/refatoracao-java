
public class Conta {
	private double saldo;

	public Conta(double saldo) {
		this.saldo = saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}

	/*Trecho para tirar a repitação da classe banco*/

	public void sacar(double valor){
		this.saldo = this.saldo - valor;
	}

	public void depositar(double valor){
		this.saldo = this.saldo + valor;
	}
}
