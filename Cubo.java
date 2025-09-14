public class Cubo extends Figuras3D{
    //private double lado;

    public Cubo(double area, double perimetro, double lado){
        
        super(lado, lado, area, perimetro);
    }

    public double getLado(){
        return lado;
    }

    public void setLado(double lado){
        this.lado = lado;
    }

    public double calcularAreaCub(){
        return 6*lado*lado;
    }

    public double calcularPerimetroCub(){
        return 12*lado;
    }

    @Override

public String toString(){

return String.format("Area:%.2f,\nPerimetro:%.2f",
                    calcularAreaCub(),calcularPerimetroCub());

}

}
