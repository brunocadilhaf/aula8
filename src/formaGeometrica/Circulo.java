package formaGeometrica;

public class Circulo extends FormaGeometrica {
    @Override
    public double calcularArea(double l1, double l2) {
        return l1*l2*l2;
    }
}
