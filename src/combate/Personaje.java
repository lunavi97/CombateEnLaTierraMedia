package combate;

public abstract class Personaje {
	
	int fuerza;
	int vida;
	
	public int salud() {
		return vida;
	}
	
	public abstract void atacar(Personaje otro);
	
	public abstract void descansar();
}
