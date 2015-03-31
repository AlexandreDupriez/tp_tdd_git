package iut.tdd;

import junit.framework.Assert;

import org.junit.Test;

public class TestConvert {
	@Test
	public void test_num2text_zero () {
		
		Assert.assertEquals("0", Convert.num2text("zero"));
		Assert.assertEquals("1", Convert.num2text("un"));
		Assert.assertEquals("2", Convert.num2text("deux"));
		Assert.assertEquals("3", Convert.num2text("trois"));
		Assert.assertEquals("4", Convert.num2text("quatre"));
		Assert.assertEquals("5", Convert.num2text("cinq"));
		Assert.assertEquals("6", Convert.num2text("six"));
		Assert.assertEquals("7", Convert.num2text("sept"));
		Assert.assertEquals("8", Convert.num2text("huit"));
		Assert.assertEquals("9", Convert.num2text("neuf"));
		Assert.assertEquals("10", Convert.num2text("dix"));
		Assert.assertEquals("11", Convert.num2text("onze"));
		Assert.assertEquals("12", Convert.num2text("douze"));
		Assert.assertEquals("13", Convert.num2text("treize"));
		Assert.assertEquals("14", Convert.num2text("quatorze"));
		Assert.assertEquals("15", Convert.num2text("quinze"));
		Assert.assertEquals("16", Convert.num2text("seize"));
		
		
	}
	@Test
	public void test_text2num_zero () {
	
		Assert.assertEquals("zero", Convert.text2num("0"));
		Assert.assertEquals("un", Convert.text2num("1"));
		Assert.assertEquals("deux", Convert.text2num("2"));
		Assert.assertEquals("trois", Convert.text2num("3"));
		Assert.assertEquals("quatre", Convert.text2num("4"));
		Assert.assertEquals("cinq", Convert.text2num("5"));
		Assert.assertEquals("six", Convert.text2num("6"));
		Assert.assertEquals("sept", Convert.text2num("7"));
		Assert.assertEquals("huit", Convert.text2num("8"));
		Assert.assertEquals("neuf", Convert.text2num("9"));
		Assert.assertEquals("dix", Convert.text2num("10"));
		Assert.assertEquals("onze", Convert.text2num("11"));
		Assert.assertEquals("douze", Convert.text2num("12"));
		Assert.assertEquals("treize", Convert.text2num("13"));
		Assert.assertEquals("quatorze", Convert.text2num("14"));
		Assert.assertEquals("quinze", Convert.text2num("15"));
		Assert.assertEquals("seize", Convert.text2num("16"));
		
		
	}
}
