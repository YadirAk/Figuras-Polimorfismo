public class Area_Perimetro {
    public static void main(String[] args) {
        
    Cuadrado cuadrado = new Cuadrado(10, 20, 50); 
    Triangulo triangulo = new Triangulo(20, 10, 20, 20, 20);
    Circulo circulo = new Circulo(20, 10, 8);

    Esfera esfera = new Esfera(5, 5,5);
    Piramide piramide = new Piramide(55,20,55,20);
    Cubo cubo = new Cubo(5, 5,5);


        // crea un arreglo Empleado de cuatro elementos

        System.out.println(" Areas y Perimetros \n");
        System.out.printf("%s%n%s",cubo,"Cubo\n",cubo.calcularAreaCub(),cubo.calcularPerimetroCub());
        System.out.printf("%s%n%s", esfera, "Esfera\n", esfera.calculaAreaEsf(),esfera.calcularPerimetroEsf());
        System.out.printf("%s%n%s", cuadrado, "Cuadrado\n", cuadrado. calcularAreaCua(), cuadrado.calcularPerimetroCua());
        System.out.printf("%s%n%s", circulo, "Circulo\n", circulo. calcularAreaCir(), circulo.calcularPerimetroCir());
        System.out.printf("%s%n%s", triangulo, "Triangulo\n", triangulo. calcularAreaTri(), triangulo.calcularPerimetroTri());
        System.out.printf("%s%n%s", piramide, "Piramide\n", piramide. calcularAreaPir(), piramide.calcularPerimetrPir());

    //superclase
    Figuras [] figuras = new Figuras[6];

    // inicializa el arreglo con objetos Empleado //
     //subclase
    figuras [0] = cubo;
    figuras [1] = esfera;
    figuras [2] = cuadrado;
    figuras [3] = circulo;
    figuras [4] = triangulo;
    figuras [5] = piramide;
    }
}
