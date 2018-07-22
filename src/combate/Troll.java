package combate;

import java.util.concurrent.ThreadLocalRandom;

public class Troll extends Personaje {

  private final int FUERZAINICIAL = 30;
  private final double probabilidadDeErrarGolpe = 2.0 / 3.0;

  public Troll() {
    fuerza = FUERZAINICIAL;
  }

  @Override
  public void vivo_atacar(Personaje otro) {
    if (erraElGolpe()) return;

    otro.sufrirAtaque(fuerza);
  }

  @Override
  public void vivo_descansar() {
    // Se vuelve de piedra
    vida = 0;
  }

  @Override
  public void vivo_sufrirAtaque(int ataqueRecibido) {
    // No le hace daño
  }

  private boolean erraElGolpe() {
    ThreadLocalRandom random = ThreadLocalRandom.current();
    return random.nextDouble() < probabilidadDeErrarGolpe;
  }

}
