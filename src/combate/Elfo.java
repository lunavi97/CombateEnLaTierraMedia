package combate;

public class Elfo extends Personaje {

    private final int FUERZAINICIAL = 5;
    private int cantAtaquesRecibidos;

    public Elfo() {
        cantAtaquesRecibidos = 0;
        fuerza = FUERZAINICIAL;
    }

    @Override
    public void vivo_atacar(Personaje otro) {
        otro.sufrirAtaque(fuerza);
    }

    @Override
    public void vivo_descansar() {
        vida = VIDAINICIAL;
        fuerza = FUERZAINICIAL;
        cantAtaquesRecibidos = 0;
    }

    @Override
    public void vivo_sufrirAtaque(int ataqueRecibido) {
        final int golpe = ataqueRecibido;

        if (vida > golpe) {
            vida -= golpe;
            fuerza += Math.pow(2, ++cantAtaquesRecibidos);
        }
        else
            vida = 0;
    }


}
