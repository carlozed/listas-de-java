package e3;

public class Circulo implements FiguraGeometrica{
    double raio;
    double pi = 3.14;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public void calcularArea(){
        double area = pi * (raio * raio);
        System.out.println("A área do círculo: " + area);
    }
}
