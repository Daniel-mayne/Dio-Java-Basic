public class Metodo {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada ?: " + smartTv.ligada);
        System.out.println("Volume Atual: " + smartTv.canal);
        System.out.println("Canal Atual: " + smartTv.volume);


        smartTv.escolherCanal(10);
        

        smartTv.ligar();
        System.out.println("TV ligada ?: " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("TV ligada ?: " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Volumme Atual: " + smartTv.volume);

        smartTv.aumentarCanal();
        System.out.println("Canal Atual: " + smartTv.canal);

        smartTv.diminuirCanal();
        System.out.println("Canal Atual: " + smartTv.canal);

    }
}
