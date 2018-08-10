package Tests;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import Main.Main;

class MainTest {

	private Map<Long, Integer> memoria = new HashMap<>();

	@Test
	void maiorValorMapTeste() {
		montaMapTeste();
		Long valor = Main.maiorValorMap(memoria);
		Long expected = -1L;
		Assert.assertEquals(expected, valor);
	}

	public void montaMapTeste() {
		memoria.put(1L, 1);
		memoria.put(3L, 2);
		memoria.put(0L, 3);
		memoria.put(2L, -2);
		memoria.put(-1L, 500);
	}

}
