package combate;

import org.junit.Assert;
import org.junit.Test;

public class HumanoTests {

    @Test
    public void humanoAtaca() {
        Personaje humano = new Humano();
        Personaje enano = new Enano();

        Assert.assertEquals(100, enano.salud());

        humano.atacar(enano);
        Assert.assertEquals(90, enano.salud());
        humano.atacar(enano);
        Assert.assertEquals(81, enano.salud());
        humano.atacar(enano);
        Assert.assertEquals(73, enano.salud());
        humano.atacar(enano);
        Assert.assertEquals(66, enano.salud());
    }

    @Test
    public void humanoPelea() {
        Personaje humano = new Humano();
        Personaje orco = new Orco();

        Assert.assertEquals(100, orco.salud());

        humano.atacar(orco);
        Assert.assertEquals(98, orco.salud());

        Assert.assertEquals(100, humano.salud());
        for (int i = 0; i < 4; i++) {
            orco.atacar(humano);
        }
        Assert.assertEquals(40, humano.salud());

        humano.atacar(orco);
        Assert.assertEquals(97, orco.salud());
        humano.atacar(orco);
        Assert.assertEquals(96, orco.salud());
        humano.atacar(orco);
        Assert.assertEquals(96, orco.salud());
    }

    @Test
    public void humanoDescansa() {
        Personaje humano = new Humano();
        Personaje elfo = new Elfo();

        Assert.assertEquals(100, humano.salud());
        elfo.atacar(humano);
        Assert.assertEquals(95, humano.salud());

        Assert.assertEquals(100, elfo.salud());
        humano.atacar(elfo);
        Assert.assertEquals(91, elfo.salud());
        humano.atacar(elfo);
        Assert.assertEquals(83, elfo.salud());

        humano.descansar();
        humano.atacar(elfo);
        Assert.assertEquals(73, elfo.salud());
    }

}
