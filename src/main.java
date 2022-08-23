
public class main {

	/*
	 	Criar uma aplica��o em Java que tenha uma fun��o recursiva que,
		recebendo um n�mero inteiro, converta para bin�rio. Entrada
		limitada a 2000.
		� O C�digo deve apresentar, em formato de coment�rio, como foi definida a
		condi��o de parada;
		� O C�digo deve apresentar, em formato de coment�rio, como foi definida a
		rela��o de chamada dos passos;
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
