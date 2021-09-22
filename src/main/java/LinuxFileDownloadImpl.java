public class LinuxFileDownloadImpl implements IDownloadImpl {
    @Override
    public DownloadResponse download(String path) {
        return new DownloadResponse("linux.pdf", "application/pdf", "content");
    }
}