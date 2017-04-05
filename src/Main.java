import java.io.IOException;

public class Main {

	public static void main(String[] args) {
//		Luchador l1 = new Luchador(300,1500);
//		Luchador l2 = new Luchador(330,1690);
//		System.out.println(l1.domina(l2));
		try {
			Torneo t1 = new Torneo("01.in");
			t1.generarResultados();
			t1.imprimirResultados();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
