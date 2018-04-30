package combate;

import org.junit.Assert;
import org.junit.Test;

public class EnanoTests {

	@Test
	public void enanoAtaca() {
		Personaje enano = new Enano();
		Personaje orco = new Orco();

		Assert.assertEquals(100, orco.salud());
		enano.atacar(orco);
		Assert.assertEquals(95, orco.salud());
		enano.atacar(orco);
		Assert.assertEquals(88, orco.salud());
		enano.atacar(orco);
		Assert.assertEquals(79, orco.salud());
	}

	@Test
	public void enanoDescansa() {
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

}
