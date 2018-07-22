package combate;

import java.util.concurrent.ThreadLocalRandom;

public class Goblin extends Personaje {

  private final int FUERZAINICIAL = 3;
  private final int probabilidadDeSerGolpeado = 1/10;

  public Goblin() {
    fuerza = FUERZAINICIAL;
  }

  @Override
  public void vivo_atacar(Personaje otro) {
    otro.sufrirAtaque(fuerza);
  }

  @Override
  public void vivo_descansar() {
    vida = VIDAINICIAL;
  }

  @Override
  public void vivo_sufrirAtaque(int ataqueRecibido) {
    if (!esGolpeado()) return;

    final int golpe = ataqueRecibido;

    if (vida > golpe)
      vida -= golpe;

    else vida = 0;
  }

  private boolean esGolpeado() {
    ThreadLocalRandom random = ThreadLocalRandom.current();
    return random.nextInt(probabilidadDeSerGolpeado) == 0;
  }

}
