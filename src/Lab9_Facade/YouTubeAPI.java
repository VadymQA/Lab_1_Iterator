package Lab9_Facade;

class YouTubeAPI {
    private String apiKey;

    public YouTubeAPI(String apiKey){
        this.apiKey = apiKey;
    }

    public void uploadVideo(VideoFile file) {
        System.out.println("Uploading video " + file + " file to YouTube...");
    }
}
