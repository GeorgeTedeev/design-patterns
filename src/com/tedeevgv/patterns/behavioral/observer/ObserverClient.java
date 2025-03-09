package com.tedeevgv.patterns.behavioral.observer;

public class ObserverClient {
    public static void main(String[] args) {
        var youTubeChannel = new YouTubeChannel("channelName");
        var someYoutubeUser = new YouTubeUser("someUserName");
        var anotherYoutubeUser = new YouTubeUser("anotherUserName");
        youTubeChannel.register(someYoutubeUser);
        youTubeChannel.register(anotherYoutubeUser);
        youTubeChannel.addVideo();
        youTubeChannel.remove(someYoutubeUser);
        youTubeChannel.addVideo();
    }
}
