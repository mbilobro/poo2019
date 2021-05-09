 // @author mbilo
public class Principal {
    public static void main(String[] args) {
        
        Gato g = new Gato();
        g.andar();
        g.comer();
        g.falar();
        
        Cobra c = new Cobra();
        c.andar();
        c.comer();
        c.falar();
        
        Pinguim p = new Pinguim();
        p.andar();
        p.comer();
        p.falar();
        
        Cao cao = new Cao();
        cao.reagir("Oi meu bebezinho lindo");
        cao.reagir(true);
        cao.reagir(13);
        cao.reagir(10, 1);
        
    }
}
