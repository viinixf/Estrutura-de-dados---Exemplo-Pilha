public class Fluxo {

	public static void main(String[] args) {
		System.out.println("Inicio do main");
		metodo01();
		System.out.println("Fim do método main");
	}

	private static void metodo01() {
		System.out.println("Inicio do método 01");
		metodo02();
		System.out.println("Fim do método 01");
	}

	private static void metodo02() {
		System.out.println("Inicio do método 02");
		metodo03();
		System.out.println("Fim do método 02");
	}

	private static void metodo03() {
		System.out.println("Inicio do método 03");
		System.out.println("-------saidas-------");
		System.out.println("fim  do método 03");
	}

}
