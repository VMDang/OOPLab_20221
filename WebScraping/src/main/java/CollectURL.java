import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class CollectURL {
    public static void main(String[] args) {
        String url = "https://nguoikesu.com/nhan-vat";
        getAllUrl(url);
    }

    protected static void getAllUrl(String url){
        HistoricalFigures.getData(url);

        Document doc = null;
        try {
            doc = Jsoup
                    .connect(url)
                    .userAgent("Jsoup client")
                    .timeout(100000).get();

            Elements element = doc.select("li.pagination-next > a.pagenav");

            String nextUrl = "https://nguoikesu.com" + element.attr("href");

            if (nextUrl == "https://nguoikesu.com" || nextUrl == null){
                return;
            }else {
                getAllUrl(nextUrl);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}