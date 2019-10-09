package com.zalizniak.module_a;

import org.junit.Test;

import java.util.concurrent.Flow;
import java.util.concurrent.SubmissionPublisher;

public class StreamApi {

    @Test
    public void test() throws InterruptedException {
        SubmissionPublisher<String> feed = new SubmissionPublisher<>();

        feed.subscribe(new Flow.Subscriber<>() {

            @Override
            public void onSubscribe(Flow.Subscription subscription) {
                subscription.request(2);
                System.out.println("onSubscribe " + subscription);
            }

            @Override
            public void onNext(String item) {
                System.out.println("onNext " + item);
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println("onError " + throwable);
            }

            @Override
            public void onComplete() {
                System.out.println("onComplete");
            }
        });

        feed.submit("AB-CD");

        Thread.sleep(1000);
    }
}
