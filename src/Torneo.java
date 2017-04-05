import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Torneo {
	private ArrayList<Luchador> listaLuchadores = new ArrayList<Luchador>();
	private int [] vecDominador;
	private String path;
	public Torneo(String path) throws FileNotFoundException{
		Scanner sc = new Scanner(new File(path));
		vecDominador = new int[sc.nextInt()];
		this.path = path;
		//No hace falta poner los valores del vector en 0 porque San Java lo hace por uno
		for(int i=0;i<vecDominador.length;i++){
			listaLuchadores.add(new Luchador(sc.nextInt(),sc.nextInt()));
		}
		sc.close();
	}
	public void mostrarLuchadores(){
		Iterator<Luchador> it = listaLuchadores.iterator();
		while(it.hasNext()){
			System.out.println(it.next().toString());
		}
	}
	public void generarResultados(){
		byte aux;
//		Iterator<Luchador> it = listaLuchadores.iterator();
//		it.forEachRemaining(l -> {
//			
//			
//		});
		for(int i=0;i<vecDominador.length;i++){
			for(int j=i+1;j<vecDominador.length;j++){
				aux = listaLuchadores.get(i).domina(listaLuchadores.get(j));
				if(aux == 1)
					vecDominador[i]++;
				else if(aux == 2)
					vecDominador[j]++;
			}
		}
		
	}
	public void mostrarResultados(){
		for(int i=0;i<vecDominador.length;i++)
			System.out.println(vecDominador[i]);
	}
	public void imprimirResultados() throws IOException {
		PrintWriter pr = new PrintWriter(new FileWriter(path.substring(0, path.lastIndexOf('.'))+".out"));
		for(int i =0;i<vecDominador.length;i++)
			pr.println(vecDominador[i]);
			
		pr.close();
	}

}
