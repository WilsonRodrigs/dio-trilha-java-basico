public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println( "A tv está ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal );
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println( "Novo status --> A tv está ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        
        smartTv.subirCanal();
        smartTv.descerCanal();
        smartTv.mudarCanal(13);
         System.out.println("Canal atual: " + smartTv.canal );
        
         smartTv.desligar();
    }
}
