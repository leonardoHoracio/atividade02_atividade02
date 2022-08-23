
public class main {

	/*
	 	Criar uma aplicação em Java que tenha uma função recursiva que,
		recebendo um número inteiro, converta para binário. Entrada
		limitada a 2000.
		• O Código deve apresentar, em formato de comentário, como foi definida a
		condição de parada;
		• O Código deve apresentar, em formato de comentário, como foi definida a
		relação de chamada dos passos;
	 */
	public static void main(String[] args) {

		int n = 45;
		int tamanho = 10;

		String resultado = String.format("%0" + tamanho + "d", Integer.valueOf(funcaoRecursiva(n)));
		System.out.println(resultado);
	}

	public static String funcaoRecursiva(int n) {
		if (n == 0) {
			return "";
		}
		return funcaoRecursiva(n / 2) + (n % 2);
	}

}
