package controle;

public class Controle implements Interface {

    private int volume;
    private boolean ligada;
    private boolean pausar;
    private boolean menu;

    public boolean getMenu() {
        return menu;
    }

    public void setMenu(boolean menu) {
        this.menu = menu;
    }

    public boolean getPausar() {
        return pausar;
    }

    public void setPausar(boolean pausar) {
        this.pausar = pausar;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public Controle() {
        this.volume = 0;
        this.ligada = false;
        this.menu = false;
        this.pausar = false;
    }

    @Override
    public void ligar() {
        if (!getLigada()) {
            setLigada(true);
            System.out.println("----------LG----------");
            System.out.println("        Ligando...    ");
        }
    }

    @Override
    public void desligar() {
        if (getLigada()) {
            System.out.println("----------LG----------");
            System.out.println("      Desligando...   ");
            setLigada(false);
            
        }
    }

    @Override
    public void abrir_menu() {
        if (getLigada() && !getMenu()) {
            setMenu(true);
            System.out.println("---------MENU---------");
            System.out.println("|       Canais       |");
            System.out.println("|    Configurações   |");
            System.out.println("|    Sincronização   |");
            System.out.println("|       Ajustes      |");
            System.out.println("----------------------");
        }
    }

    @Override
    public void fechar_menu() {
        if (getLigada() && getMenu()) {
            setMenu(false);
            System.out.println("Menu fechado");
        }
    }

    @Override
    public void mais_volume() {
        if (getLigada() && getVolume() < 100) {
            setVolume(getVolume() + 5);
            System.out.println("Volume: " + getVolume());
        } else {
            System.out.println("Volume no máximo");
        }
    }

    @Override
    public void menos_volume() {
        if (getLigada() && getVolume() > 0) {
            setVolume(getVolume() - 5);
        } else {
            System.out.println("Mudo");
        }
    }

    @Override
    public void ligar_mudo() {
        if (getLigada()) {
            setVolume(0);
            System.out.println("Mudo");
        }
    }

    @Override
    public void desligar_mudo() {
        if (getLigada()) {
            setVolume(5);
            System.out.println("Volume: 5");
        }
    }

    @Override
    public void play() {
        if (getLigada() && getPausar()) {
            setPausar(false);
            System.out.println("Play");
        }
    }

    @Override
    public void pause() {
        if (getLigada() && !getPausar()) {
            setPausar(true);
            System.out.println("Pausado");
        }
    }
}
