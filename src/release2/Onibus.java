package release2;

public class Onibus extends Veiculo implements Imprimir{

	private int assentos;
	private String cor;
	
	public Onibus(String modelo, String placa, int ano, int assentos, String cor) {
		super(modelo, placa, ano);
		this.assentos = assentos;
		this.cor = cor;
	}

	public int getAssentos() {
		return assentos;
	}

	public void setAssentos(int assentos) {
		this.assentos = assentos;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	@Override
	public void exibirDados() {
		super.exibirDados();
	
        System.out.println("Numero de assentos: " + this.assentos + "\nCor do veículo: " + this.cor);
    }
	
}
