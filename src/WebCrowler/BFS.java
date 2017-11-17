package WebCrowler;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.regex.*;

public class BFS {

    private Queue<String> queue;
    private List<String > discoveredWebsites;

    private String regexp = "http://(\\w+\\.)*(\\w+)";

    public BFS (){
        this.queue = new LinkedList<>();
        this.discoveredWebsites = new ArrayList<>();
    }

    public void discoverWeb(String root) {

        this.queue.add(root);
        this.discoveredWebsites.add(root);

        while (!queue.isEmpty()){

            String v = this.queue.remove();

            StringBuilder rowHtml = readURL(v);
            Pattern pattern = Pattern.compile(regexp);
            Matcher matcher = pattern.matcher(rowHtml);

            while (matcher.find()) {
                String w = matcher.group();

                while (!discoveredWebsites.contains(w)) {
                    discoveredWebsites.add(w);
                    System.out.println("found: " + w);
                    this.queue.add(w);
                }


            }
        }
    }

    private StringBuilder readURL(String s) {
        StringBuilder newString = new StringBuilder("");
        try {
            URL url = new URL(s);
            URLConnection urlconn = url.openConnection();
            InputStream stream = urlconn.getInputStream();

            int i;
            while ((i=stream.read()) != -1){
                newString.append((char)i);

            }

        } catch (Exception e){
            System.out.println(e);
        }

        return newString;
    }
}
