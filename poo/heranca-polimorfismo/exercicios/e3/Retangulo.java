package e3;

public class Retangulo implements FiguraGeometrica{
	double base, altura;

	public Retangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	@Override
	public void calcularArea(){
	    double area = base * altura;
		System.out.println("A área do retângulo: " + area);
	}
}
