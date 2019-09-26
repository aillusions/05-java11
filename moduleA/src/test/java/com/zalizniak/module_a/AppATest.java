package com.zalizniak.module_a;

import org.junit.Test;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class AppATest {

    @Test
    public void shouldAnswerWithTrue() throws IOException, InterruptedException {

        Function<String, Void> print = (var s) -> {
            System.out.println(s);
            return null;
        };
        print.apply("Hello World !");

        var i = 2;

        {
            var request = HttpRequest.newBuilder()
                    .uri(URI.create("https://winterbe.com"))
                    .GET()
                    .build();
            var client = HttpClient.newHttpClient();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());
        }

        {
            var request = HttpRequest.newBuilder()
                    .uri(URI.create("https://winterbe.com"))
                    .build();
            var client = HttpClient.newHttpClient();
            client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                    .thenApply(HttpResponse::body)
                    .thenAccept(System.out::println);
        }

        {
            var list = List.of("A", "B", "C");
            var map = Map.of("A", 1, "B", 2);
        }
    }
}
