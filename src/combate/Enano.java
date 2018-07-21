package combate;

public class Enano extends Personaje {

    private final int FUERZAINICIAL = 10;
    
    public Enano() {
        fuerza = FUERZAINICIAL;
    }
    
    @Override
    public void vivo_atacar(Personaje otro) {
        otro.sufrirAtaque(fuerza);
        fuerza += 2;
    }

    @Override
    public void vivo_descansar() {
        if (vida < VIDAINICIAL * 0.75)
            vida += VIDAINICIAL * 0.25;
        else
            vida = VIDAINICIAL;
    }

    @Override
    public void vivo_sufrirAtaque(int ataqueRecibido) {
        vida -= ataqueRecibido;
    }
	
}
