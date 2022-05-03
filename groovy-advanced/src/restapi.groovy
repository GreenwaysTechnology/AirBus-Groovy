import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse
import static java.net.http.HttpClient.Redirect.NORMAL
import static java.net.http.HttpClient.Version.HTTP_1_1
import static java.time.Duration.ofSeconds

class TodoService {
    HttpClient httpClient;

    public TodoService() {
        httpClient = HttpClient
                .newBuilder()
                .version(HTTP_1_1)
                .followRedirects(NORMAL)
                .connectTimeout(ofSeconds(20))
                .build();
    }

    public void getAllTodos() {
        def url = "https://jsonplaceholder.typicode.com/todos";
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        try {
            def response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            //print all response details
            def body = response.body();
             println(body)

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

def todoService = new TodoService();
todoService.getAllTodos();