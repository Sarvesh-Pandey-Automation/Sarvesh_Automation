package Webengage.stepDefinitions;
import org.openqa.selenium.By;

import Webengage.Initialize.BaseTest;
import Webengage.Initialize.PageObjectManager;
import Webengage.hooks.hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;



public class StepDefinationimp extends BaseTest {
	
	  
	  
	@Given ("I Navigate to {string} page via {string}")
	
	public void I_Navigate_to_Onsitepage_via_Web_Personalisation(String value1 , String value2) throws InterruptedException
	{
		
//		page.getPageNavigate().navigatToOnsitePage3(value1,value2);		
		page.getPageNavigate().navigatToOnsitePage3(value1,value2);	
	}
	
	
	
@Given ("I Navigate to Onsite page via Web Personalisation")
	
	public void I_Navigate_to_Onsite_page_via_Web_Personalisation(String value1 , String value2)
	{
		
		page.getPageNavigate().navigatToOnsitePage2(value1,value2);		
	}
	
	
	
@Then ("I clicked on create notification button")
	
	public void I_clicked_on_create_notification_button()
	{
	page.getOnsitePage().createCampaign();
				
	}

	
@Then ("^I added the new campaign tile name as (.+)$")

public void I_added_the_new_campaign_tile_name (String title) throws InterruptedException
{
	page.getOnsitePage().addCampaignTitle(title);
			
}	

@Then ("I selected the audience type as show to Unknown user")

public void I_selected_the_audience_type_as_show_to_Unknown_user() throws InterruptedException
{
	page.getOnsitePage().selectAudience();
			
}	

@Then ("I clicked on save&continue button")

public void I_clicked_on_save_continue_button () throws InterruptedException

{
	page.getOnsitePage().saveContinue();
			
}




@Then ("I applied template type filter {string}")

public void I_applied_template_type_filter(String type) throws InterruptedException

{
	page.getOnsitePage().applyTemplateFilter1(type);
//	page.getOnsitePage().applyTemplateFilter1(type);
			
}



@Then ("I Searched and Selected the template with name {string}")

public void I_Searched_and_Selected_the_template_with_name(String templateName) throws InterruptedException

{
	page.getOnsitePage().searchSelectTemplate(templateName);
	
			
}

@Then ("I clicked on launchCamapign button")

public void I_clicked_on_launchCamapign_button () throws InterruptedException

{
	page.getOnsitePage().LaunchCampaign();
	
	
			
}



@Then ("I clicked on {string} template button")

public void I_clicked_on__template_button (String button) throws InterruptedException

{
	page.getOnsitePage().Create_Template();
	
	
			
}


@Then ("I selected layout type as  {string}")

public void I_selected_layout_type(String layout) throws InterruptedException

{
	page.getOnsitePage().Select_Layout();
	
	
			
}


@Then ("I selected the content block")

public void I_selected_the_content_block() throws InterruptedException

{
	page.getOnsitePage().performDragAndDropWithWaits( 
			
		    By.xpath("//iframe[contains(@id,'bee-plugin-frame')]")
		    
		  
		
			);
	
	
			
}


@Then ("I filled the content")

public void I_filled_the_content () throws InterruptedException

{
	page.getOnsitePage().Fill_Content_bee();
	
			
}




@Then ("I clicked on {string} button")

public void I_clicked_on_save_continue_button (String value) throws InterruptedException

{
	page.getOnsitePage().ActionButton(value);
			
}

 

@Then ("I clicked on Message {string} button")

public void I_clicked_on_navigation_button (String value) throws InterruptedException

{
	page.getOnsitePage().ActionButton(value);
	page.getOnsitePage().SetNaviagtion();
	
	
			
}



}
	
	


