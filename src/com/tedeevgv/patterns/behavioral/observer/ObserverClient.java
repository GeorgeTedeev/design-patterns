package com.tedeevgv.patterns.behavioral.observer;

public class ObserverClient {
    public static void main(String[] args) {
        Publisher coolYoutubeChannel = new CoolYouTubeChannel("coolChannelName");
        Subscriber coolYoutubeSubscriber = new CoolYouTubeUser("coolUserName");
        Subscriber anotherCoolYoutubeSubscriber = new CoolYouTubeUser("anotherCoolUserName");
        coolYoutubeSubscriber.subscribe(coolYoutubeChannel);
        anotherCoolYoutubeSubscriber.subscribe(coolYoutubeChannel);
        ((YouTubeChannel) coolYoutubeChannel).addVideo();
        coolYoutubeSubscriber.unSubscribe(coolYoutubeChannel);
        ((YouTubeChannel) coolYoutubeChannel).addVideo();
    }
}
