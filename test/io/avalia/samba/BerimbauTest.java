package io.avalia.samba;

import org.junit.Test;

import junit.framework.Assert;

public class BerimbauTest {

	@Test
	public void theBerimbauShouldMakeDigDenDem() {
		IInstrument berimbau = new Berimbau();
		String sound = berimbau.play();
		Assert.assertEquals("digDenDem", sound);
	}

	@Test
	public void theBerimbauShouldBeRed() {
		IInstrument berimbau = new Berimbau();
		String color = berimbau.getColor();
		Assert.assertEquals("Red", color);
	}
	
	@Test
	public void itShouldBePossibleToPlayBerimbau() {
		IInstrument berimbau = new Berimbau();
		String sound = berimbau.play();
		Assert.assertNotNull(sound);
	}
	
	@Test
	public void theBerimbauShouldBeLouderThanAFlute() {
		IInstrument berimbau = new Berimbau();
		IInstrument flute = new Flute();
		int berimbauVolume = berimbau.getSoundVolume();
		int fluteVolume = flute.getSoundVolume();
		Assert.assertTrue(berimbauVolume > fluteVolume);
	}
	
}
