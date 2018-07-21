package combate;

public class Humano extends Personaje {

    private final int FUERZAINICIAL = 10;

    public Humano() {
        fuerza = FUERZAINICIAL;
    }

    @Override
    public void vivo_atacar(Personaje otro) {
        otro.sufrirAtaque(fuerza--);
    }

    @Override
    public void vivo_descansar() {
        fuerza = FUERZAINICIAL;
    }

    @Override
    public void vivo_sufrirAtaque(int ataqueRecibido) {
        final int golpe = ataqueRecibido;

        if (vida > golpe) {
            vida -= golpe;
            fuerza--;
        }
        else
            vida = 0;
    }

}
