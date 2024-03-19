package co.evertonfraga.scraper;

import co.evertonfraga.scraper.database.ProductController;
import co.evertonfraga.scraper.database.ProductService;
import co.evertonfraga.scraper.entities.Product;
import co.evertonfraga.scraper.services.scraper.JsoupService;
import co.evertonfraga.scraper.services.scraper.ScraperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.List;

@SpringBootApplication
@EnableScheduling
public class ScraperApplication implements CommandLineRunner {

	@Autowired
	private ProductService productService;

	public static void main(String[] args) {
		SpringApplication.run(ScraperApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Retrieve the list of products
		List<Product> productList = productService.productList();

		for (Product product : productList) {
			ScraperService scraperService = new ScraperService(new JsoupService());
			productService.saveProduct(scraperService.getProduct(product));
		}
	}

	@Scheduled(cron = "0 0 * * * *")
	public void runScheduled() throws Exception {
		run();
	}
}