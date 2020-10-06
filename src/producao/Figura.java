package producao;

public class Figura {
	String cor;
	String tipoFigura;
	private int x;
	private int y;

	
	// Getters and Setters, modificadores de acesso usar quando se quer encapsular uma variável.
	// No caso estou querendo acessar os atributos x, y que estão presentes nas figuras geométricas 
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	void posicionamentoEspacial() {
		System.out.println("Posicionamento  = (" + x + "," + y + ")");
	}


	public void desenha() {
		System.out.println("Tipo da Figura: " + this.tipoFigura + "\nCor da figura: " + this.cor);
	}

	
	public Figura() {
	}
}