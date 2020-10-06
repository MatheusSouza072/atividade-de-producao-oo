package producao;

/**
 * @author Matheus Souza Santana
 *
 */

public class Main extends Figura {

	public static void main(String[] args) {

		System.out.println("Autor: Matheus Souza Santana\nMatr�cula: 202031322");
		// incluir mensagem 1
		System.out.println("Figuras Geom�tricas");

		// incluir mensagem 2
		System.out.println("Desenhar Quadrado");
		Figura quadrado = new Quadrado(5, 6);

		quadrado.desenha(); // Invoca o metodo presente na classe figura, onde cont�m o tipo e a cor da figura
		quadrado.posicionamentoEspacial(); // Invoca o metodo presente na classe figura, que cont�m as cordenadas que foram
		// passadas como argumento na inst�ncia acima
 
		// incluir mensagem 3
		System.out.println("Desenhar Retangulo");
		Figura retangulo = new Retangulo(5, 6); 

		retangulo.desenha();
		retangulo.posicionamentoEspacial();  
		// incluir mensage 4
		System.out.println("Desenhar Tringulo:");
		Figura triangulo = new Triangulo(3, 2);

		triangulo.desenha();
		triangulo.posicionamentoEspacial();
		 

	}

}
