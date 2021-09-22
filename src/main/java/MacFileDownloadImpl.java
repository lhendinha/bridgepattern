public class MacFileDownloadImpl implements IDownloadImpl {
    @Override
    public DownloadResponse download(String path) {
        return new DownloadResponse("mac.pdf", "application/pdf", "content");
    }
}