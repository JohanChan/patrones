package prototipo;

public class Rectangulo extends Forma {

    public int ancho;
    public int largo;

    public Rectangulo(){
        
    }
    public Rectangulo(Rectangulo rectangulo) {
        super(rectangulo);
        this.ancho = rectangulo.ancho;
        this.largo = rectangulo.largo;
    }

    @Override
    public Forma clonar() {
        return new Rectangulo(this);
    }

    @Override
    public String toString() {
        return "Posicion x: " + this.x + " Posicion y: " + this.y + " Ancho " + this.ancho+" Largo "+this.largo;
    }
}
