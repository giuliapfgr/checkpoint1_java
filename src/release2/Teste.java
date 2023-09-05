package release2;

import java.util.ArrayList;

public class Teste {

	public static void main(String[] args) {
		
	ArrayList<Veiculo> listaVeiculos = new ArrayList<>();
	
	Onibus onibus = new Onibus("Volkswagen", "567-DEF", 1999, 40, "Azul");
	Caminhao caminhao = new Caminhao("Mercedes Benz", "789-MNB", 2012, 3, true);
	
	listaVeiculos.add(onibus);
	listaVeiculos.add(caminhao);
		
	for (Veiculo veiculo : listaVeiculos) {
        veiculo.exibirDados();
        System.out.println("\n===============\n");
		}
	}
	
}
