package release2;

public class Caminhao extends Veiculo implements Imprimir{
	
	private int eixos;
	private boolean carreta;
	
	public Caminhao(String modelo, String placa, int ano, int eixos, boolean carreta) {
		super(modelo, placa, ano);
		this.eixos = eixos;
		this.carreta = carreta;
	}

	public int getEixos() {
		return eixos;
	}

	public void setEixos(int eixos) {
		this.eixos = eixos;
	}

	public boolean isCarreta() {
		return carreta;
	}

	public void setCarreta(boolean carreta) {
		this.carreta = carreta;
	}
	
	@Override
    public void exibirDados() {
		super.exibirDados();
		
        System.out.println("Quantidade de eixos: " + this.eixos + "\nCarreta: " + this.carreta);
    }

}
