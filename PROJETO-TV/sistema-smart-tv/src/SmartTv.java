public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 10;

    public void ligar(){
        ligada = true;
        System.out.println("A Smart TV está ligada!");
    }

    public void desligar(){
        ligada = false;
        System.out.println("A Smart TV está desligada!");
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando volume para: " + volume);
    }

    public void diminuirVolume(){
        volume --;
        System.out.println("Diminuindo volume para: " + volume);
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("Mudando canal para: " +canal);
    }

    public void subirCanal(){
        canal ++;
        System.out.println("Mudando canal para: " +canal);

    }

    public void descerCanal(){
        canal --;
        System.out.println("Mudando canal para: " +canal);
    }
}
