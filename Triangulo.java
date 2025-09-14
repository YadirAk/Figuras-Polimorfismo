public class Triangulo extends Figuras2D{
    private double base;
    private double altura;
    private double lado;

    public Triangulo (double area, double perimetro, double base, double altura, double lado){
        super(lado, base, area, perimetro);
        this.base = base;
        this.altura = altura;
        this.lado = lado;
        }

    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }

     
    public double calcularAreaTri(){
        return (base * altura) / 2;
        }

    
    public double calcularPerimetroTri(){
        return lado * 3 ;
    }
    
    
   @Override

public String toString(){

return String.format("Area:%.2f,\nPerimetro:%.2f",
                    calcularAreaTri(),calcularPerimetroTri());

}
}

