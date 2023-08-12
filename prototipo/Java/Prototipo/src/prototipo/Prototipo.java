package prototipo;

public class Prototipo {

    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        circulo.x = 10;
        circulo.y = 10;
        circulo.color = "Rojo";
        circulo.radio = 15;

        Circulo copia = (Circulo) circulo.clonar();
        System.out.println(copia.toString());

        Rectangulo rectangulo = new Rectangulo();
        rectangulo.x = 15;
        rectangulo.y = 20;
        rectangulo.color = "Azul";
        rectangulo.ancho = 15;
        rectangulo.largo = 25;
        
        Rectangulo copiarect = (Rectangulo) rectangulo.clonar();
        copiarect.ancho = 30;
        System.out.println(copiarect.toString());
        System.out.println(rectangulo.toString());

    }

}
