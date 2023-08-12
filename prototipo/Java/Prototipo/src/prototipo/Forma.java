package prototipo;

public abstract class Forma {
 
    public int x;
    public int y;
    public String color;
    
    public Forma(Forma forma){
        this.x = forma.x;
        this.y = forma.y;
        this.color = forma.color;
    }
    public Forma(){
        
    }
    
    public abstract Forma clonar();
}
