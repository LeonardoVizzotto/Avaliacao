package Calculos;

public class ValorInvalidoException extends Exception {

	private static final long serialVersionUID = 1L;

	public ValorInvalidoException(Long valor) {
		super(valor + " Não é um valor valido");
	}
}