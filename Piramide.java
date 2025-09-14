public class Piramide extends Figuras3D {
   private double  apotema;
    public Piramide(double lado, double apotema,double area,double perimetro) {
       super(lado, area, area, perimetro);
    }

    
    public double calcularAreaPir() {
        double areaBase = lado* lado;
        double areaLateral = 2 * lado * apotema;
        return areaBase + areaLateral;
    }

    
    public double calcularPerimetrPir() {
        return 4 * lado;
    }

    @Override
    public String toString() {
        return String.format("Area: %.2f,\nPerimetro: %.2f",
                calcularAreaPir(),calcularPerimetrPir());


    }

}
