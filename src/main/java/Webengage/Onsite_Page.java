package Webengage;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Onsite_Page extends Reausable_Methods{

	WebDriver driver;

	public Onsite_Page(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='editable-text w-95']//h5")
	WebElement campaignTitle;
	
	By CampaignTitle =By.xpath("//div[@class='editable-text w-95']//h5");
	
	//div[@class='editable-text w-95']
	@FindBy(xpath = "//div[@class='editable-text w-95']")
	WebElement campaignTitleNew;

	@FindBy(xpath = "//input[@name='title']")
	WebElement campaignTitleInput;

	@FindBy(xpath = "//label[contains(., 'Don’t show to known users')]")
	WebElement dontShowKnownUser;

	@FindBy(xpath = "//input[@value='hide_from_known']")
	WebElement showToUnknown;

	@FindBy(xpath = "//button[span[text()='Save & Continue']]")
	WebElement saveAndContinue;
	
	By saveButton =By.xpath("//button[span[text()='Save & Continue']]");

	@FindBy(xpath = "//*[@class='ant-radio-input' and @value='GLOBAL']")
	WebElement genericWithAnd;

	@FindBy(xpath = "//*[@value='ALL']")
	WebElement templateFilter;
	
	By globalBy = By.xpath("//*[@value='GLOBAL']");
			

	@FindBy(xpath = "//*[@value='EMAIL_CAPTURE']")
	WebElement templateTypeFilter;

	@FindBy(xpath = "//h5[text()='Personalisation_Test']")
	
	WebElement hoverTemplate;

	
	public static String GENERIC_VALUE= "//*[@value='%s']";
	public static String GENERIC_TEMPLATE_NAME= "//h5[text()='%s']";
	
	
	
	
	@FindBy(xpath = "//button[span[text()='Use Template']]")
	WebElement useTemplate;

	By usetemplate = By.xpath(".//button[span[text()='Use Template']]");
	
	@FindBy(xpath = "//button[span[text()='Launch Campaign']]")
	WebElement launchCampaign;
	
	By launchButton = By.xpath("//button[span[text()='Launch Campaign']]");
			
	By loader= By.cssSelector(".ant-btn-loading-icon");
	@FindBy(xpath = "//input[@type='password']")
	WebElement shopifyPassword;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement shopifyLogin;

	@FindBy(xpath = "//input[@id='c7532837-ce11-4a77-bd80-5c0b4fdb0c5e']")
	WebElement fillEmail;

	@FindBy(xpath = "//div[span[text()='Subscribe Now!']]")
	WebElement subscribeNow;

	@FindBy(id = "module_b07275b3-270e-469f-b123-a3783e513a86")
	WebElement subscribeId;

	@FindBy(xpath = "//input[@id='module_b07275b3-270e-469f-b123-a3783e513a86']")
	WebElement submit;

	@FindBy(xpath = "//button[@id='_we_wk_close']")
	WebElement weClose;

	@FindBy(xpath = "//button[span[text()='Create']]")
	WebElement newTemplate;

	@FindBy(xpath = "//*[span[text()='Box']]")
	WebElement newBoxTemplate;

	@FindBy(xpath = "//span[@class='Heading']/div")
	WebElement beeTitleBlock;

	@FindBy(xpath = "//div[@data-qa='column-outer']")
	WebElement beeSourceRow;

	@FindBy(xpath = "//span[@class='tinyMce-placeholder']")
	WebElement beeContent;

	@FindBy(xpath = "//span[@class='Button']/div/div")
	WebElement beeButtonBlock;

	@FindBy(xpath = "//button[span[text()='Save & Close']]")
	WebElement saveClose;

	@FindBy(xpath = "//button[@id='content']")
	WebElement beeContentTab;

	@FindBy(xpath = "//div[@data-dnd-name='row 1']")
	WebElement beeSourceRow2;

	@FindBy(xpath = "//input[@placeholder='Search...']")
	WebElement notificationSearch;

	@FindBy(css = ".we-listing-table__report__button")
	WebElement actions;

	@FindBy(xpath = "//*[text()='Delete']")
	WebElement actionsDelete;

	@FindBy(xpath = "//div[contains(@class, 'ant-popover') and not(contains(@class, 'ant-popover-hidden'))]//button[span[text()='Delete']]")
	WebElement actionsDeleteAll;

	@FindBy(xpath = "//tr[@data-row-key='1']")
	WebElement row1;

	@FindBy(css = ".ant-modal-footer .ant-btn-primary")
	WebElement deleteNotification;

	@FindBy(xpath = "//tr[@class='ant-table-row ant-table-row-level-0']")
	WebElement notificationList;

	@FindBy(xpath = "//*[text()='Status']")
	WebElement filterByStatus;

	@FindBy(xpath = "//*[@title='Draft']")
	WebElement selectStatus;

	@FindBy(xpath = "//*[text()='Apply']")
	WebElement applyStatusFilter;

	@FindBy(xpath = "//*[@placeholder='start date']")
	WebElement scheduleDatePicker;

	@FindBy(xpath = "//*[@class='ant-picker-cell-inner' and text()='31']")
	WebElement scheduleDatePick;

	@FindBy(className = "ant-picker-cell-inner")
	WebElement scheduleDatePick1;

	@FindBy(xpath = "//*[@class='ant-picker-year-btn']")
	WebElement clickSelectYear;

	@FindBy(xpath = "//*[@class='ant-picker-month-btn']")
	WebElement clickSelectMonth;

	@FindBy(xpath = "//*[@class='ant-picker-today-btn']")
	WebElement selectTodayDate;

	@FindBy(xpath = "//*[@id='rc_select_33']/../..")
	WebElement clickHh;

	@FindBy(xpath = "//*[@id='rc_select_34']/../..")
	WebElement clickMm;

	@FindBy(xpath = "//*[@id='rc_select_35']/../..")
	WebElement selectType;

	@FindBy(xpath = "//p[contains(@class,'fw-md')]/following-sibling::div[2]")
	WebElement listingPageSize;

	@FindBy(xpath = "//*[contains(@class,'pagination-container')]//*[@class='ant-space-item']//div//span")
	WebElement templatePageSize;

	@FindBy(css = ".rc-virtual-list-scrollbar")
	WebElement scroll;

	@FindBy(xpath = "//*[contains(@class,'template-cards-wrapper--card-container')]")
	WebElement getAllTemplate;

	@FindBy(xpath = "(//button[contains(@class,'ant-btn-icon')])[2]")
	WebElement nextPage;

	@FindBy(xpath = "//p[contains(@class,'fw-md')]/following-sibling::button[1]")
	WebElement listingNextPage;

	@FindBy(xpath = "//*[text()='Create Campaign']")
	WebElement createCampaign;

	public static String scroll_template_Page = "(//*[contains(@class,'campaign-layout-body')])";

	@FindBy(xpath = "//*[contains(@class,'template-cards-wrapper--card-container')]")
	List<WebElement> templateList;

	// ========== Dynamic Locators (Placeholders) ==========
	public static final String GENERIC_TITLE = "//*[@title='%s']";
	public static final String GENERIC_TEXT = "//*[text()='%s']";
	public static final String GENERIC_CLASS = "//*[@class='%s']";
	public static final String GENERIC_KEY_VALUE = "//*[@%s1='%s2']";
	public static final String GENERIC_CLASS_AND_TEXT = "//*[@class='%s1' and text()='%s2']";
	public static final String SCHEDULE_OPTIONS = "//*[@class='fw-md' and text()='%s']";

	public void createCampaign() {

		createCampaign.click();

	}

	public void addCampaignTitle(String newTitle) throws InterruptedException {
////		campaignTitle.click();
//		Thread.sleep(3000);
		waitElementToClick(CampaignTitle,10);
		campaignTitle.click();
		clearAndType(campaignTitleInput, newTitle);
	}

	public void selectAudience() throws InterruptedException {
//		By checkbox = By.xpath("//input[@value='hide_from_known']");
//		click(By.xpath("//label[contains(., 'Don’t show to known users')]"));
//		click(checkbox);
//		Thread.sleep(3000);
//		click(checkbox);
		dontShowKnownUser.click();
		showToUnknown.click();
		Thread.sleep(3000);
		showToUnknown.click();

	}

	public void saveContinue() throws InterruptedException {
//		waitElementToAppear(saveButton,10);
//		Thread.sleep(3000);
		waitElementToClick(saveButton,10);
		
		waitElementToInvisible(loader,10);
//		waitElementToClickAndClick(saveButton,10);
//		waitElementToClick(saveButton,10);
		
		saveAndContinue.click();
		
		
	}

	
	public void LaunchCampaign() throws InterruptedException {
//		waitElementToAppear(launchButton,1);
//		Thread.sleep(3000);
		waitElementToInvisible(loader,10);
		launchCampaign.click();
		
	}
	
	
	
	
	public void applyTemplateFilter() throws InterruptedException {
		Thread.sleep(3000);
		templateFilter.click();
		Thread.sleep(3000);
		templateTypeFilter.click();
		Thread.sleep(3000);
	}

	
	
	public void applyTemplateFilter1(String value) throws InterruptedException {
		Thread.sleep(3000);
	Find(DynamicXPathLocator(GENERIC_VALUE,value)).click();
//	templateFilter.click();
		Thread.sleep(3000);
//		templateTypeFilter.click();
		Thread.sleep(3000);
	}
	
	
	
	
	
	
	public Boolean searchSelectTemplateold(String TemplateName) throws InterruptedException {
		WebElement temp;
		Boolean match;
		int attempts = 0;
		String[] Page = templatePageSize.getText().split(" ");
		String PageSize = Page[1].trim();
		int MaxPageSize = Integer.parseInt(PageSize);

		do {
			
			
		 temp = templateList.stream()
				    .filter(templateCard -> 
				        templateCard.findElement(By.cssSelector(".ant-typography"))
				                    .getText().trim()
				                    .equalsIgnoreCase(TemplateName))
				    .findFirst().orElse(null);	

			

			match = templateList.stream().anyMatch(templateName -> templateName
					.findElement(By.cssSelector(".ant-typography")).getText().equalsIgnoreCase(TemplateName));

			
		
			
			if (match == false) {

				wheelScrollToBottom(driver, scroll_template_Page);

				nextPage.click();
			}

			attempts++;
			
			

		} while (!match && attempts < MaxPageSize);

		if (!match) {
			
			Assert.assertTrue("Template with name - "+TemplateName+" Not Found", match);
//
//			throw new NoSuchElementException(
//					"Template with" +TemplateName+ "not found after" + MaxPageSize + " attempts.");
		}

		if (match) {

//	hoverTemplate.click();
//			waitElementToClick(DynamicXPathLocator(GENERIC_TEMPLATE_NAME,TemplateName),10);
		
			
//			Thread.sleep(5000);
//			waitElementToClick(usetemplate,10);
		
		
//		waitElementToClick(usetemplate,10);
		
		WebElement useTemplateBtn = temp.findElement(usetemplate);

		// Scroll into view of the button
		Thread.sleep(3000);
		scrollToCenter1(useTemplateBtn);
		
		hoverOverElement(Find(DynamicXPathLocator(GENERIC_TEMPLATE_NAME,TemplateName)));
//	hoverOverElement(useTemplate);
//		temp.findElement(usetemplate).click();
		useTemplateBtn.click();
		
			
//		useTemplate.click();
			
			
		

		}

		return match;
	}
	
	
	
	public Boolean searchSelectTemplate(String templateName) throws InterruptedException {
	    int maxAttempts = getMaxPageSize();
	    boolean isMatchFound = false;
	    WebElement matchedTemplate = null;

	    for (int attempt = 0; attempt < maxAttempts; attempt++) {
	        // Try to find the matching template
	        matchedTemplate = templateList.stream()
	            .filter(card -> card.findElement(By.cssSelector(".ant-typography"))
	                .getText().trim().equalsIgnoreCase(templateName))
	            .findFirst()
	            .orElse(null);

	        if (matchedTemplate != null) {
	            isMatchFound = true;
	            break;
	        }

	        // Scroll and go to next page if not matched yet
	        wheelScrollToBottom(driver, scroll_template_Page);
	        nextPage.click();
	    }

	    if (!isMatchFound) {
	        Assert.assertTrue("Template with name - " + templateName + " Not Found", false);
	        return false;
	    }

	    // Proceed with using the matched template
	    WebElement useTemplateBtn = matchedTemplate.findElement(usetemplate);
	    
	    
//	    scrollToCenter(useTemplateBtn);
	    scrollCardToCenter(matchedTemplate);
	    hoverOverElement(Find(DynamicXPathLocator(GENERIC_TEMPLATE_NAME, templateName)));
	    useTemplateBtn.click();

	    return true;
	}

	private int getMaxPageSize() {
	    String[] pageText = templatePageSize.getText().split(" ");
	    return Integer.parseInt(pageText[1].trim());
	}

	
	

	

	

}
