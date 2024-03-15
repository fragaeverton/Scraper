package co.evertonfraga.scraper;

import co.evertonfraga.scraper.services.JsoupService;
import co.evertonfraga.scraper.services.ScraperService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScraperApplication {

	public static void main(String[] args) {

		SpringApplication.run(ScraperApplication.class, args);

		ScraperService scraperService = new ScraperService(new JsoupService());

		System.out.println(scraperService.getProduct("https://www.lidl.co.uk/p/freshona-raspberries-strawberries-assorted/p10006645").toString());
	}

}
