package combate;

public class Orco extends Personaje {

    private final int FUERZAINICIAL = 15;

    public Orco() {
        fuerza = FUERZAINICIAL;
    }

    @Override
    public void vivo_atacar(Personaje otro) {
        otro.sufrirAtaque(fuerza);
    }

    @Override
    public void vivo_descansar() {
        // No le sirve de nada
    }

    @Override
    public void vivo_sufrirAtaque(int ataqueRecibido) {
        final int golpe = ataqueRecibido / 4;
        
        if (vida > golpe)
            vida -= golpe;
        else
            vida = 0;
    }


}
