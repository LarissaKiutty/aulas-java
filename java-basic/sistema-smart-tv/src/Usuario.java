public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume(); //19
        smartTv.diminuirVolume(); //18
        smartTv.aumentarVolume(); //19

        System.out.println("A TV está " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.mudarCanal(17);
        System.out.println("Canal alterado: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume); // É para estar 19

        smartTv.ligar();
        System.out.println("(pressionei botão de ligar) Status atual: " + smartTv.ligada);
        smartTv.desligar();
        System.out.println("(pressionei botão de desligar) Status atual: " + smartTv.ligada);
    }
}
