package combate;

import org.junit.Assert;
import org.junit.Test;

public class GoblinTests {

  @Test
  public void goblinAtaca() {
    Personaje goblin = new Goblin();
    Personaje enano = new Enano();
    Personaje orco = new Orco();

    Assert.assertEquals(100, enano.salud());
    goblin.atacar(enano);
    Assert.assertEquals(97, enano.salud());
    goblin.atacar(enano);
    Assert.assertEquals(94, enano.salud());
    goblin.atacar(enano);
    Assert.assertEquals(91, enano.salud());

    Assert.assertEquals(100, orco.salud());
    goblin.atacar(orco);
    Assert.assertEquals(100, orco.salud());
    goblin.atacar(orco);
    Assert.assertEquals(100, orco.salud());
    goblin.atacar(orco);
    Assert.assertEquals(100, orco.salud());
  }

  @Test
  public void goblinEsAtacado() {
    Personaje goblin = new Goblin();
    Personaje elfo = new Elfo();

    for (int i = 0; i < 6; i++) {
      elfo.atacar(goblin);
    }

    int vidaGoblin = goblin.salud();

    Assert.assertTrue("La vida del goblin es: " + vidaGoblin,
        vidaGoblin >= 70 && vidaGoblin <= 100);
  }

  @Test
  public void goblinDescansa() {
    Personaje goblin = new Goblin();
    Personaje enano = new Enano();

    Assert.assertEquals(100, goblin.salud());
    for(int i = 0; i < 6; i++) {
      enano.atacar(goblin);
    }

    int vidaGoblin = goblin.salud();

    Assert.assertTrue("La vida del goblin es: " + vidaGoblin,
        vidaGoblin >= 10 && vidaGoblin <= 100);

    goblin.descansar();
    vidaGoblin = goblin.salud();
    Assert.assertEquals(100, vidaGoblin);
  }

}
