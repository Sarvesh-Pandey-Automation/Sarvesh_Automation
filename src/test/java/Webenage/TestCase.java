package Webenage;

import org.testng.annotations.Test;

import Webengage.Initialize.BaseTest;

public class TestCase extends BaseTest {

	@Test
	public void test() throws InterruptedException {

		page.getPageNavigate().navigatToOnsitePage();
		page.getOnsitePage().createCampaign();
		page.getOnsitePage().addCampaignTitle("UpdatedFW");
		page.getOnsitePage().selectAudience();
		page.getOnsitePage().saveContinue();
		page.getOnsitePage().applyTemplateFilter();
		page.getOnsitePage().searchSelectTemplate("Personalisation_Test");

	}
	
	

}
