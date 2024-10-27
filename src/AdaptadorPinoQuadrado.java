import models.PinoRedondo;

class AdaptadorPinoQuadrado implements PinoRedondo {
    final private PinoQuadrado pinoQuadrado;

    public AdaptadorPinoQuadrado(PinoQuadrado pinoQuadrado) {
        this.pinoQuadrado = pinoQuadrado;
    }

    @Override
    public double getRaio() {
        return pinoQuadrado.getLargura() * Math.sqrt(2) / 2;
    }
}