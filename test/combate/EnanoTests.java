package combate;

import org.junit.Assert;
import org.junit.Test;

public class EnanoTests {

    @Test
    public void enanoAtacaAOrco() {
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
    public void enanoDescansaDeAtaqueDeOrco() {
        Personaje enano = new Enano();
        Personaje orco = new Orco();

        Assert.assertEquals(100, enano.salud());
        for(int i=0; i<6; i++) {
            orco.atacar(enano);
        }
        Assert.assertEquals(10, enano.salud());

        enano.descansar();
        Assert.assertEquals(35, enano.salud());
        enano.descansar();
        Assert.assertEquals(60, enano.salud());
        enano.descansar();
        Assert.assertEquals(85, enano.salud());
        enano.descansar();
        Assert.assertEquals(100, enano.salud());
    }

    @Test
    public void enanoAtacaAElfo() {
        Personaje enano = new Enano();
        Personaje elfo = new Elfo();

        Assert.assertEquals(100, elfo.salud());
        enano.atacar(elfo);
        Assert.assertEquals(90, elfo.salud());
        enano.atacar(elfo);
        Assert.assertEquals(78, elfo.salud());
        enano.atacar(elfo);
        Assert.assertEquals(64, elfo.salud());
    }

    @Test
    public void enanoDescansaDeAtaqueDeElfo() {
        Personaje enano = new Enano();
        Personaje elfo = new Elfo();

        Assert.assertEquals(100, enano.salud());
        for (int i = 0; i < 6; i++) {
            elfo.atacar(enano);
        }
        Assert.assertEquals(70, enano.salud());

        enano.descansar();
        Assert.assertEquals(95, enano.salud());
        enano.descansar();
        Assert.assertEquals(100, enano.salud());
        enano.descansar();
        Assert.assertEquals(100, enano.salud());
    }

}
