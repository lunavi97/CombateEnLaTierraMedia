package combate;

import org.junit.Assert;
import org.junit.Test;

public class ElfoTests {

    @Test
    public void elfoAtaca() {
        Personaje elfo = new Elfo();
        Personaje enano = new Enano();
        Personaje orco = new Orco();

        Assert.assertEquals(100, enano.salud());
        elfo.atacar(enano);
        Assert.assertEquals(95, enano.salud());
        elfo.atacar(enano);
        Assert.assertEquals(90, enano.salud());
        elfo.atacar(enano);
        Assert.assertEquals(85, enano.salud());

        Assert.assertEquals(100, orco.salud());
        elfo.atacar(orco);
        Assert.assertEquals(99, orco.salud());
        elfo.atacar(orco);
        Assert.assertEquals(98, orco.salud());
        elfo.atacar(orco);
        Assert.assertEquals(97, orco.salud());
    }

    @Test
    public void elfoPelea() {
        Personaje elfo = new Elfo();
        Personaje orco = new Orco();
        Personaje enano = new Enano();

        Assert.assertEquals(100, orco.salud());
        Assert.assertEquals(100, enano.salud());

        elfo.atacar(orco);
        Assert.assertEquals(99, orco.salud());
        elfo.atacar(orco);
        Assert.assertEquals(98, orco.salud());

        orco.atacar(elfo);
        Assert.assertEquals(85, elfo.salud());

        elfo.atacar(orco);
        Assert.assertEquals(97, orco.salud());

        orco.atacar(elfo);
        Assert.assertEquals(70, elfo.salud());

        elfo.atacar(orco);
        Assert.assertEquals(95, orco.salud());

        elfo.atacar(enano);
        Assert.assertEquals(89, enano.salud());
        elfo.atacar(enano);
        Assert.assertEquals(78, enano.salud());

        enano.atacar(elfo);
        Assert.assertEquals(60, elfo.salud());

        elfo.atacar(enano);
        Assert.assertEquals(59, enano.salud());
    }

    @Test
    public void orcoDescansaDeAtaque() {
        Personaje elfo = new Elfo();
        Personaje enano = new Enano();

        Assert.assertEquals(100, elfo.salud());
        for(int i = 0; i < 3; i++) {
            enano.atacar(elfo);
        }
        Assert.assertEquals(64, elfo.salud());

        Assert.assertEquals(100, enano.salud());

        elfo.atacar(enano);
        Assert.assertEquals(81, enano.salud());

        elfo.descansar();
        Assert.assertEquals(100, elfo.salud());

        elfo.atacar(enano);
        Assert.assertEquals(76, enano.salud());
    }

}
