package producao;

public class Triangulo extends Figura {
	int alturaC1;
	int alturaC2;
	int comprimento;
	String nome = "Matheus Souza Santana";
	long matricula;

	public Triangulo(int x, int y) {

		this.matricula = 202031322;
		this.cor = "Branco";
		this.tipoFigura = "Triangulo";
		this.alturaC1 = 4;
		this.alturaC2 = 4;
		this.comprimento = 3;

		setX(x);
		setY(y);
	}
}
