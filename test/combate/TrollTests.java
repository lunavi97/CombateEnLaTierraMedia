package combate;

import org.junit.Assert;
import org.junit.Test;

public class TrollTests {

  @Test
  public void goblinAtaca() {
    Personaje troll = new Troll();
    Personaje enano = new Enano();

    troll.atacar(enano);
    int vidaEnano = enano.salud();
    Assert.assertTrue("La vida del enano es: " + vidaEnano,
        vidaEnano == 70 || vidaEnano == 100);
  }

  @Test
  public void trollEsAtacado() {
    Personaje troll = new Troll();
    Personaje elfo = new Elfo();

    Assert.assertEquals(100, troll.salud());
    for (int i = 0; i < 100; i++) {
      elfo.atacar(troll);
    }
    Assert.assertEquals(100, troll.salud());
  }

  @Test
  public void trollDescansa() {
    Personaje troll = new Troll();
    Personaje humano = new Humano();

    Assert.assertEquals(100, humano.salud());
    troll.atacar(humano);
    int vidaHumano = humano.salud();
    Assert.assertTrue("La vida del humano es: " + vidaHumano,
        vidaHumano == 70 || vidaHumano == 100);

    troll.descansar();
    for (int i = 0; i < 100; i++) {
      troll.atacar(humano);
    }
    Assert.assertEquals(vidaHumano, humano.salud());
  }

}
