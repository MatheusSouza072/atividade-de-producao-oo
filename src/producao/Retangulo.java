package producao;

public class Retangulo extends Figura {
	int altura;
	int comprimento;

	public Retangulo(int x, int y) {
		this.tipoFigura = "Retangulo";
		this.cor = "Roxo";
		this.altura = 6;
		this.comprimento = 8;
		setX(x);
		setY(y);

	}
}