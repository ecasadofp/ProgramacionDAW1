package excepciones;

public class Cuenta {

	private int saldo;

	public Cuenta() {
		saldo = 0;
	}

	public Cuenta(int n) {
		saldo = n;
	}

	public void meterDinero(int n) {
		saldo += n;
	}

	public void sacarDinero(int n) throws NoHayDineroException {
		if (saldo > n)
			saldo -= n;
		else
			throw new NoHayDineroException(n - saldo);
	}

	public int getSaldo() {
		return saldo;
	}
	
}