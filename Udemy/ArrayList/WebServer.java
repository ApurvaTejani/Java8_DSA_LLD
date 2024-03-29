import fi.iki.elonen.NanoHTTPD;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class WebServer extends NanoHTTPD {
    private ArrayList<String> items = new ArrayList<>();

    public WebServer() throws IOException {
        super(8080);
        start(NanoHTTPD.SOCKET_READ_TIMEOUT, false);
        System.out.println("\nRunning! Point your browsers to http://localhost:8080/\n");
    }

    public static void main(String[] args) {
        try {
            new WebServer();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Response serve(IHTTPSession session) {
        Method method = session.getMethod();
        String uri = session.getUri();
        Map<String, List<String>> parms = session.getParameters();

        if (uri.equals("/addItem")) {
            String item = parms.get("item").get(0);
            addItems(item);
        } else if (uri.equals("/removeItem")) {
            String item = parms.get("item").get(0);
            removeItems(item);
        } else if (uri.equals("/clearScreen")) {
            clearScreen();
        }

        String output = items.toString();
        return newFixedLengthResponse(output);
    }

    private synchronized void addItems(String item) {
        String[] values = item.split(",");
        items.addAll(Arrays.asList(values));
        items.sort(Comparator.naturalOrder());
    }

    private synchronized void removeItems(String item) {
        String[] values = item.split(",");
        items.removeAll(Arrays.asList(values));
    }

    private synchronized void clearScreen() {
        items.clear();
    }
}
