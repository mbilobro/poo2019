public class Principal {
    public static void main (String[] args) {
        int i = 1;
        
        Panela p1 = new Panela();
        p1.setMarca("Polishop");
        p1.setModelo("Mega Blaster");
        p1.setTipo("De pressão");
        p1.setCor("Vermelha");
        p1.setAderencia(0.5f);
        p1.setTampada(true);
        p1.setNpanela(i);
        p1.cozinhar();
        p1.status();
        i = i + 1;
        
        Panela p2 = new Panela("MTA", "Plus", "Pipoqueira", "Cereja", 0.5f, false, i);
        p2.tampar();
        p2.cozinhar();
        p2.status();
        
        i = i + 1;
        
    }
    
}
