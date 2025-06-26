package Webengage.Initialize;

import org.openqa.selenium.WebDriver;
import Webengage.LandingPage;
import Webengage.Onsite_Page;
import Webengage.PageNavigate;

public class PageObjectManager {

    private WebDriver driver;

    private LandingPage landingPage;
    private Onsite_Page onsitePage;
    private PageNavigate pageNavigate;

    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public LandingPage getLandingPage() {
        if (landingPage == null) {
            landingPage = new LandingPage(driver);
        }
        return landingPage;
    }

    public Onsite_Page getOnsitePage() {
        if (onsitePage == null) {
            onsitePage = new Onsite_Page(driver);
        }
        return onsitePage;
    }

    public PageNavigate getPageNavigate() {
        if (pageNavigate == null) {
            pageNavigate = new PageNavigate(driver);
        }
        return pageNavigate;
    }
}
