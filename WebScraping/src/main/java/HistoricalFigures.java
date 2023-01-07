import com.google.gson.Gson;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class HistoricalFigures {
    private String name;
    private String description;

    private static final int MAX = 5000;

    public HistoricalFigures(String name, String description) {
        super();
        this.name = name;
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static void getData(String url){
        Document doc = null;
        try {
            doc = Jsoup
                    .connect(url)
                    .userAgent("Jsoup client")
                    .timeout(20000).get();

            Elements list = doc.select("div.item.column-1");

            for (Element element : list) {
                int i=0;
                Elements figures = element.select("div.page-header > h2 > a");
                Elements description = element.select("p");

                HistoricalFigures aFigures = new HistoricalFigures(figures.text(), description.text());;

                System.out.println(new Gson().toJson(aFigures));

//                System.out.println(aFigures.getName());
//                System.out.println(aFigures.getDescription());
//                System.out.println("----------------------------" + ++i +"-----------------------------");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
