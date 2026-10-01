package e3;

public class Main {
    public static void main(String[] args) {
	FiguraGeometrica c = new Circulo(5.0);
	FiguraGeometrica r = new Retangulo(2, 4);

	CalculadoraArea.imprimirArea(c);
	CalculadoraArea.imprimirArea(r);
    }

}
