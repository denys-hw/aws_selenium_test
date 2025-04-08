ChromeOptions options = new ChromeOptions();
options.addArguments("--headless", "--no-sandbox", "--disable-dev-shm-usage");

WebDriver driver = new ChromeDriver(options);
driver.get("https://example.com");
System.out.println("Title: " + driver.getTitle());
driver.quit();