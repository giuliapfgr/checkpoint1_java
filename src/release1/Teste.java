package release1;

import java.util.ArrayList;

public class Teste {
	
	public static void main(String[] args) {
	
	ArrayList<Veiculo> listaVeiculos = new ArrayList<>();

    Onibus onibus = new Onibus("Mercedes", "123-ABC", 2007, 40, "Verde");
    Caminhao caminhao = new Caminhao("Scannia", "456-ABC", 2002, 2, false);

    listaVeiculos.add(onibus);
    listaVeiculos.add(caminhao);

    for (Veiculo veiculo : listaVeiculos) {
        veiculo.exibirDados();
        System.out.println("\n===============\n");
    }
}

}
