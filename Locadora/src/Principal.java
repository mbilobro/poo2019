 // @author MatheusBilo
public class Principal {
    
    public static void main(String[] args) {
        Carros c1 = new Carros();
        c1.setTipo("Carro");
        c1.setCor("Vermelho");
        c1.setPlaca("AMD-1026");
        c1.setCategoria("A");
        c1.setDiasLocação(7);
        c1.atribuirPreco();
        c1.imprimir();
        
        Motos m1 = new Motos();
        m1.setTipo("Moto");
        m1.setCor("Azul");
        m1.setPlaca("BEZ-1560");
        m1.setCilindradas(600);
        m1.setDiasLocação(9);
        m1.atribuirPreco();
        m1.imprimir();

        
        Caminhões cam1 = new Caminhões();
        cam1.setTipo("Caminhões");
        cam1.setCor("Preto");
        cam1.setPlaca("XES-3695");
        cam1.setEixos(8);
        cam1.setDiasLocação(8);
        cam1.atribuirPreco();
        cam1.imprimir();

        
        Utilitários u1 = new Utilitários();
        u1.setTipo("Utilitários");
        u1.setCor("Cinza");
        u1.setPlaca("KJL-5687");
        u1.setPassageiros(8);
        u1.setDiasLocação(10);
        u1.atribuirPreco();
        u1.imprimir();
    }
    
}
