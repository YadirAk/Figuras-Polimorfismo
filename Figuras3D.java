abstract public class Figuras3D extends Figuras{
    public double lado;

    public Figuras3D(double lado, double base, double area, double perimetro){
        super(area, perimetro);

        this.lado = lado;
}

    @Override
    public double getArea(){
        return area;
    }

    @Override
    public void setArea(double area){
        this.area = area;
    }

    @Override
    public double getPerimetro(){
        return perimetro;
    }

    @Override
    public void setPerimetro(double perimetro){
        this.perimetro = perimetro;
    }

    @Override
    public double obtenerArea(){
        return area;
    }

    @Override
    public double obetenerPerimetro(){
        return perimetro;
    }
    
   
 @Override
    public String toString() {
        return "Figura: " + obtenerArea() + obetenerPerimetro();
    }

}
