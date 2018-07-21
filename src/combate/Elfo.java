package combate;

public class Elfo extends Personaje {

    private final int FUERZAINICIAL = 5;

    public Elfo() {
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
    }

    @Override
    public void vivo_sufrirAtaque(int ataqueRecibido) {
        if (vida > ataqueRecibido) {
            vida -= ataqueRecibido;
            fuerza += FUERZAINICIAL;
        }
        else
            vida = 0;
    }


}
