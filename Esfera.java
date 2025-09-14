public class Esfera extends Figuras3D {
    
    private double radio;

    public Esfera (double area, double perimetro, double radio){
        super(radio, radio, area, perimetro);
        this.radio = radio;
    }

    public double getRadio(){
        return radio;
    }

    public void setRadio(double radio){
        this.radio = radio;
    }


    public double calculaAreaEsf(){
        return 4*Math.PI*Math.pow(radio, 2);
    }

 
    public double calcularPerimetroEsf(){
        return 2*Math.PI*radio;
    }

  @Override

public String toString(){

return String.format("Area:%.2f,\nPerimetro:%.2f",
                    calculaAreaEsf(),calcularPerimetroEsf());

}

}
