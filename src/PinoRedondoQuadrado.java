import models.PinoRedondo;

class PinoRedondoConcreto implements PinoRedondo {
    final private double raio;

    public PinoRedondoConcreto(double raio) {
        this.raio = raio;
    }

    @Override
    public double getRaio() {
        return raio;
    }
}
