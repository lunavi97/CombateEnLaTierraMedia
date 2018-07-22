package combate;

import org.junit.Assert;
import org.junit.Test;

public class OrcoTests {

  @Test
  public void orcoAtacaAEnano() {
    Personaje enano = new Enano();
    Personaje orco = new Orco();

    Assert.assertEquals(100, orco.salud());
    enano.atacar(orco);
    Assert.assertEquals(98, orco.salud());
    enano.atacar(orco);
    Assert.assertEquals(95, orco.salud());
    enano.atacar(orco);
    Assert.assertEquals(92, orco.salud());
  }

  @Test
  public void orcoDescansaDeAtaque() {
    Personaje orco = new Orco();
    Personaje enano = new Enano();

    Assert.assertEquals(100, orco.salud());
    for(int i = 0; i < 6; i++) {
      enano.atacar(orco);
    }
    Assert.assertEquals(79, orco.salud());

    orco.descansar();
    Assert.assertEquals(79, orco.salud());
    orco.descansar();
    Assert.assertEquals(79, orco.salud());
  }

  @Test
  public void orcoAtacaAElfo() {
    Personaje orco = new Orco();
    Personaje elfo = new Elfo();

    Assert.assertEquals(100, elfo.salud());
    orco.atacar(elfo);
    Assert.assertEquals(85, elfo.salud());
    orco.atacar(elfo);
    Assert.assertEquals(70, elfo.salud());
    orco.atacar(elfo);
    Assert.assertEquals(55, elfo.salud());
  }

}
