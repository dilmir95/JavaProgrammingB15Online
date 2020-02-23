package day54;

public class ChromeDriver implements WebDriver{
    @Override
    public void openBrowser() {
        System.out.println("Opening Chrome browser");
    }

    @Override
    public void navigateTo(String url) {
        System.out.println("Navigating to : "+url);
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing chrome browser");
    }

    @Override
    public void maximize() {
        System.out.println("maximizing chrome browser");
    }
}

class FirefoxDriver implements WebDriver{
    @Override
    public void openBrowser() {
        System.out.println("Opening Firefox browser");
    }

    @Override
    public void navigateTo(String url) {
        System.out.println("Navigating to : "+url);
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing firefox browser");
    }

    @Override
    public void maximize() {
        System.out.println("maximizing firefox browser");
    }
}
class SafariDriver implements WebDriver{
    @Override
    public void openBrowser() {
        System.out.println("Opening safari browser");
    }

    @Override
    public void navigateTo(String url) {
        System.out.println("Navigate to: "+url);
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing safari browser");
    }

    @Override
    public void maximize() {
        System.out.println("maximizing safari browser");
    }
}