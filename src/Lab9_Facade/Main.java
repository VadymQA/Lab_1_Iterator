package Lab9_Facade;

public class Main {
    public static void main(String[] args) {
        VideoUploadFacade facade = new VideoUploadFacade();
        facade.uploadVideo(new VideoFile("test_video"));
    }
}
