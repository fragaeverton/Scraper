package co.evertonfraga.scraper.services.scraper;

import co.evertonfraga.scraper.entities.Product;
import co.evertonfraga.scraper.services.shop.AldiService;
import co.evertonfraga.scraper.services.shop.CostcoService;
import co.evertonfraga.scraper.services.shop.LidlService;
import co.evertonfraga.scraper.services.shop.ShopService;
import lombok.AllArgsConstructor;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

@AllArgsConstructor
public class JsoupService implements Scraper {

    @Override
    public Product getProduct(Product product) {

        Document doc = null;
        try {
            doc = Jsoup.connect(product.getUrl()).get();
            //System.out.println(doc.body());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return setData(doc, product);

        /*Elements newsHeadlines = doc.select("#mp-itn b a");
        return "";*/
    }

    private Product setData(Document doc, Product product) {

        ShopService shopService = null;

        switch (product.getShop().getName()){
            case "Costco":
                shopService = new ShopService(new CostcoService());
                break;
            case "Aldi":
                shopService = new ShopService(new AldiService());
                break;
            case "Lidl":
                shopService = new ShopService(new LidlService());
                break;
        }
        if (shopService != null) {
            String price, name, image = "";

            //NAME
            name = shopService.getName().getSource().equals("text")
                    ? doc.select(shopService.getName().getContent()).first().text()
                    : doc.select(shopService.getName().getContent()).attr(shopService.getName().getSource());
            //IMAGE
            image = shopService.getImage().getSource().equals("text")
                    ? doc.select(shopService.getImage().getContent()).first().text()
                    : doc.select(shopService.getImage().getContent()).attr(shopService.getImage().getSource());
            //PRICE
            price = shopService.getPrice().getSource().equals("text")
                    ? doc.select(shopService.getPrice().getContent()).text()
                    : doc.select(shopService.getPrice().getContent()).attr(shopService.getPrice().getSource());
            try{
                product.setPrice(Double.parseDouble(price.replace("£","")));
            } catch (NumberFormatException err){
                //
            }
            product.setName(name);
            product.setImage(image);
        }
        return product;
    }

}
