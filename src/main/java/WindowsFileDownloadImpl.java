public class WindowsFileDownloadImpl implements IDownloadImpl {
    @Override
    public DownloadResponse download(String path) {
        return new DownloadResponse("windows.pdf", "application/pdf", "content");
    }
}