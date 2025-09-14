public class Circulo extends Figuras{
  
    private double radio;
    private final double pi = 3.1416;

    public Circulo(double area, double perimetro, double radio) {
        super(area, perimetro);
        this.radio = radio;
        }

    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double getPi() {
        return pi;
    }    
    
    public double calcularAreaCir(){
        return (pi * (radio * radio));

    }
    
    
    public double calcularPerimetroCir(){
        return (2 * pi * radio);
    }


    @Override

public String toString(){

return String.format("Area:%.2f,\nPerimetro:%.2f",
                    calcularAreaCir(),calcularPerimetroCir());

}
}
