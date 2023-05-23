package Lab9_Facade;

class VideoUploadFacade {
    private VideoFormatConverter converter = new VideoFormatConverter();
    private YouTubeAPI youTubeAPI = new YouTubeAPI("your-api-key");

    public void uploadVideo(VideoFile file) {
        VideoFile formattedFile = converter.convertToMp4(file);
        youTubeAPI.uploadVideo(formattedFile);
    }
}
