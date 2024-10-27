public class App {
    public static void main(String[] args) throws Exception {
         
           BuracoRedondo buraco = new BuracoRedondo(5);
           PinoRedondoConcreto pinoRedondo = new PinoRedondoConcreto(5);
           System.out.println("Pino redondo encaixa? " + buraco.encaixa(pinoRedondo));
   
           PinoQuadrado pinoQuadrado = new PinoQuadrado(5);
           AdaptadorPinoQuadrado adaptador = new AdaptadorPinoQuadrado(pinoQuadrado);
           System.out.println("Pino quadrado encaixa com adaptador? " + buraco.encaixa(adaptador));
    }
}
