package combate;

public abstract class Personaje {
	
    private final int VIDAINICIAL = 100;
	protected int fuerza;
	protected int vida;
	
	public Personaje() {
	    vida = VIDAINICIAL;
	}
	
	public int salud() {
		return vida;
	}
	
	public boolean estaVivo() {
	    return vida > 0;
	}
	
	public void atacar(Personaje otro) {
	    if (!estaVivo())
	        return;
	    vivo_atacar(otro);
	}
	public abstract void vivo_atacar(Personaje otro);
	
	public void descansar() {
	    if (!estaVivo())
	        return;
	    vivo_descansar();
	}
	public abstract void vivo_descansar();
	
	public void sufrirAtaque(int ataqueRecibido) {
	    if (!estaVivo())
            return;
	    vivo_sufrirAtaque(ataqueRecibido);
	}
	public abstract void vivo_sufrirAtaque(int ataqueRecibido);
}
