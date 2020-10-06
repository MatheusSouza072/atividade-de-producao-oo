package producao;

public class Quadrado extends Figura {
	int lado;

	public Quadrado(int x, int y) {

		this.tipoFigura = "Quadrado";
		this.cor = "Amarelo";
		this.lado = 4;
		setX(x);
		setY(y);
		
	}
}