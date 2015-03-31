package iut.tdd;

import junit.framework.Assert;

import org.junit.Test;

public class TestConvert {
	@Test
	public void test_num2text_zero() {
		Assert.assertEquals("0", Convert.num2text("zero"));
	}

	@Test
	public void test_num2text_un() {
		Assert.assertEquals("1", Convert.num2text("un"));
	}

	@Test
	public void test_num2text_deux() {
		Assert.assertEquals("2", Convert.num2text("deux"));
	}

	@Test
	public void test_num2text_trois() {
		Assert.assertEquals("3", Convert.num2text("trois"));
	}

	@Test
	public void test_num2text_quatre() {
		Assert.assertEquals("4", Convert.num2text("quatre"));
	}

	@Test
	public void test_num2text_cinq() {
		Assert.assertEquals("5", Convert.num2text("cinq"));
	}

	@Test
	public void test_num2text_six() {
		Assert.assertEquals("6", Convert.num2text("six"));
	}

	@Test
	public void test_num2text_sept() {
		Assert.assertEquals("7", Convert.num2text("sept"));
	}

	@Test
	public void test_num2text_huit() {
		Assert.assertEquals("8", Convert.num2text("huit"));
	}

	@Test
	public void test_num2text_neuf() {
		Assert.assertEquals("9", Convert.num2text("neuf"));
	}

	@Test
	public void test_num2text_dix() {
		Assert.assertEquals("10", Convert.num2text("dix"));
	}

	@Test
	public void test_num2text_onze() {
		Assert.assertEquals("11", Convert.num2text("onze"));
	}

	@Test
	public void test_num2text_douze() {
		Assert.assertEquals("12", Convert.num2text("douze"));
	}

	@Test
	public void test_num2text_treize() {
		Assert.assertEquals("13", Convert.num2text("treize"));
	}

	@Test
	public void test_num2text_quatorze() {
		Assert.assertEquals("14", Convert.num2text("quatorze"));
	}

	@Test
	public void test_num2text_quinze() {
		Assert.assertEquals("15", Convert.num2text("quinze"));
	}

	@Test
	public void test_num2text_vingt() {
		Assert.assertEquals("20", Convert.num2text("vingt"));
	}
	@Test
	public void test_num2text_trente() {
		Assert.assertEquals("30", Convert.num2text("trente"));
	}
	@Test
	public void test_num2text_quarante() {
		Assert.assertEquals("40", Convert.num2text("quarante"));
	}
	@Test
	public void test_num2text_cinquante() {
		Assert.assertEquals("50", Convert.num2text("cinquante"));
	}
	@Test
	public void test_num2text_souixante() {
		Assert.assertEquals("60", Convert.num2text("soixante"));
	}
	
	
	
	
	
	

	@Test
	public void test_text2num_zero() {
		Assert.assertEquals("zero", Convert.text2num("0"));
	}

	@Test
	public void test_text2num_un() {
		Assert.assertEquals("un", Convert.text2num("1"));
	}

	@Test
	public void test_text2num_deux() {
		Assert.assertEquals("deux", Convert.text2num("2"));
	}

	@Test
	public void test_text2num_trois() {
		Assert.assertEquals("trois", Convert.text2num("3"));
	}

	@Test
	public void test_text2num_quatre() {
		Assert.assertEquals("quatre", Convert.text2num("4"));
	}

	@Test
	public void test_text2num_cinq() {
		Assert.assertEquals("cinq", Convert.text2num("5"));
	}

	@Test
	public void test_text2num_six() {
		Assert.assertEquals("six", Convert.text2num("6"));
	}

	@Test
	public void test_text2num_sept() {
		Assert.assertEquals("sept", Convert.text2num("7"));
	}

	@Test
	public void test_text2num_huit() {
		Assert.assertEquals("huit", Convert.text2num("8"));
	}

	@Test
	public void test_text2num_neuf() {
		Assert.assertEquals("neuf", Convert.text2num("9"));
	}

	@Test
	public void test_text2num_dix() {
		Assert.assertEquals("dix", Convert.text2num("10"));
	}

	@Test
	public void test_text2num_onze() {
		Assert.assertEquals("onze", Convert.text2num("11"));
	}

	@Test
	public void test_text2num_douze() {
		Assert.assertEquals("douze", Convert.text2num("12"));
	}

	@Test
	public void test_text2num_treize() {
		Assert.assertEquals("treize", Convert.text2num("13"));
	}

	@Test
	public void test_text2num_quatorze() {
		Assert.assertEquals("quatorze", Convert.text2num("14"));
	}

	@Test
	public void test_text2num_quinze() {
		Assert.assertEquals("quinze", Convert.text2num("15"));
	}

	@Test
	public void test_text2num_vingt() {
		Assert.assertEquals("vingt", Convert.text2num("20"));

	}
	
	@Test
	public void test_text2num_trente() {
		Assert.assertEquals("trente", Convert.text2num("30"));

	}
	@Test
	public void test_text2num_quarante() {
		Assert.assertEquals("quarante", Convert.text2num("40"));

	}
	@Test
	public void test_text2num_cinquante() {
		Assert.assertEquals("cinquante", Convert.text2num("50"));

	}
	@Test
	public void test_text2num_soixante() {
		Assert.assertEquals("soixante", Convert.text2num("60"));

	}
}
