//Classe que guarda dados de produtos e serviços oferecidos no estacionamento
//Exemplos de produtos e serviços: estacionar veiculo; lavar veiculo; trocar oleo

public class Produto {

	private int peso;
	private double altura;
	
	public Produto() {
		
	}
	
	public Produto(int peso, double altura) {
		this.peso=peso;
		this.altura=altura;
	}
	
	public int getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	
}
