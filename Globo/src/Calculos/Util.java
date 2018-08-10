package Calculos;

/**
 * @author leonardo
 *
 */
public class Util {

	
	/**
	 * @param valor
	 * @return resultado da formula n -> n/2(se n for par), n -> 3n + 1(se n for ímpar)
	 */
	public static Long aplicaFormula(Long valor) {
		if (valor == 1)
			return 1L;
		try {
			if (isPar(valor))
				return valor / 2;
		} catch (ValorInvalidoException e) {
			e.printStackTrace();
		}
		return 3 * valor + 1;
	}

	/**
	 * @param valor
	 * @return True se o valor for par e False caso contrário
	 * @throws ValorInvalidoException
	 */
	public static boolean isPar(Long valor) throws ValorInvalidoException {
		if (valor == null || valor < 0)
			throw new ValorInvalidoException(valor);
		return valor % 2 == 0;
	}
}
