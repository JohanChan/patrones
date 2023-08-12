package prototipo;

public class Circulo extends Forma {

    public int radio;

    public Circulo() {

    }

    public Circulo(Circulo circulo) {
        super(circulo);
        this.radio = circulo.radio;

    }

    @Override
    public Forma clonar() {
        return new Circulo(this);
    }

    
    @Override
    public String toString(){
        return "Posicion x: "+this.x+" Posicion y: "+this.y+" Radio"+this.radio;
    }
}
