package co.evertonfraga.scraper;

import co.evertonfraga.scraper.database.ProductService;
import co.evertonfraga.scraper.entities.Product;
import co.evertonfraga.scraper.services.scraper.JsoupService;
import co.evertonfraga.scraper.services.scraper.ScraperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
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
			System.out.println(scraperService.getProduct(product));
		}

	}
}
