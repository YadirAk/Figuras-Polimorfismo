public class Figuras {

    protected double area;
    protected  double perimetro;

    public Figuras(double area, double perimetro){
        this.area = area;
        this.perimetro = perimetro;
    }

    public double getArea(){
        return area;
    }

    public void setArea(double area){
        this.area = area;
    }

    public double getPerimetro(){
        return perimetro;
    }

    public void setPerimetro(double perimetro){
        this.perimetro = perimetro;
    }

    public double obtenerArea(){
        return area;
    }

    public double obetenerPerimetro(){
        return perimetro;
    }
    
 @Override
    public String toString() {
        return "Figura: " + obtenerArea() + obetenerPerimetro();
    }
}
