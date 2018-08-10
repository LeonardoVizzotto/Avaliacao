package Tests;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Calculos.Util;
import Calculos.ValorInvalidoException;

class UtilTest {

	@Test
	void isPar_ValorNulo() {
		Assertions.assertThrows(ValorInvalidoException.class, () -> Util.isPar(null));
	}

	@Test
	void isPar_ValorNegativo() {
		Assertions.assertThrows(ValorInvalidoException.class, () -> Util.isPar(-1L));
	}

	@Test
	void isPar_GrandeValorNegativo() {
		Assertions.assertThrows(ValorInvalidoException.class, () -> Util.isPar(-1000000L));
	}

	@Test
	void isPar_Zero() {
		isParTesteTrue(0L);
	}

	@Test
	void isPar_UmMilhao() {
		isParTesteTrue(1000000L);
	}

	@Test
	void isPar_Um() {
		isParTesteFalse(1L);
	}

	@Test
	void isPar_Dois() {
		isParTesteTrue(2L);
	}

	@Test
	void isPar_UmMilhao_E_Um() {
		isParTesteFalse(1000001L);
	}

	@Test
	void aplicaFormula_Um() {
		aplicaFormulaTeste(1L, 1L);
	}

	@Test
	void aplicaFormula_Dois() {
		aplicaFormulaTeste(1L, 2L);
	}

	@Test
	void aplicaFormula_Tres() {
		aplicaFormulaTeste(10L, 3L);
	}

	@Test
	void aplicaFormula_Quatro() {
		aplicaFormulaTeste(2L, 4L);
	}

	@Test
	void aplicaFormula_UmMilhao() {
		aplicaFormulaTeste(500000L, 1000000L);
	}

	@Test
	void aplicaFormula_TrezentosMil() {
		aplicaFormulaTeste(900004L, 300001L);
	}
	
	@Test
	void aplicaFormula_MaximoEncontrado() {
		aplicaFormulaTeste(525L, 837799L);
	}

	private void isParTesteTrue(Long valor) {
		try {
			Boolean resultado = Util.isPar(valor);
			Assert.assertTrue(resultado);
		} catch (ValorInvalidoException e) {
			e.printStackTrace();
		}
	}

	private void isParTesteFalse(Long valor) {
		try {
			Boolean resultado = Util.isPar(valor);
			Assert.assertFalse(resultado);
		} catch (ValorInvalidoException e) {
			e.printStackTrace();
		}
	}

	private void aplicaFormulaTeste(Long expected, Long valor) {
		Long resultado = Util.aplicaFormula(valor);
		Assert.assertEquals(expected, resultado);
	}
}
