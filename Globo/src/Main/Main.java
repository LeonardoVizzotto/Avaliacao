package Main;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import Calculos.Util;

/**
 * @author leonardo
 *
 */
public class Main {

	public static void main(String[] args) {
		Map<Long, Integer> memoria = new HashMap<>();
		memoria.put(1L, 1);//Inicializa memoria com 1 pois esta é a condição de parada.
		for (Long i = 2L; i <= 1000000; i++) {
			calculaSequencia(i, memoria);
		}
		Long max = maiorValorMap(memoria);
		System.out.println("valor: " + max + ", tamanho: " + memoria.get(max));
	}

	
	/**
	 * @param memoria
	 * @return maior valor dentro de um objeto Map
	 */
	public static Long maiorValorMap(Map<Long, Integer> memoria) {
		Long max = Collections.max(memoria.entrySet(), Map.Entry.comparingByValue()).getKey();//TODO VERIFICAR NULL
		return max;
	}

	
	/**
	 * Aplica a formula descrita no teste até que o valor resultado seja 1
	 * e guarda o tamanho da sequencia em um objeto Map para ser usado como memoria para futuros calculos
	 * @param calculando
	 * @param memoria
	 */
	public static void calculaSequencia(Long calculando, Map<Long, Integer> memoria) {
		Long aux = calculando;
		int contador = 0;

		while (aux != 1) {
			contador++;
			aux = Util.aplicaFormula(aux);
			if (memoria.containsKey(aux)) {
				memoria.put(calculando, memoria.get(aux) + contador);
				aux = 1L;
			}
		}
	}

}