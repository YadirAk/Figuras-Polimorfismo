abstract public class Figuras2D extends Figuras{
  

    public Figuras2D(double lado, double base, double area, double perimetro){
        super(area, perimetro);

      
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
        return "Figura: " + obtenerArea() ;
    }


}
