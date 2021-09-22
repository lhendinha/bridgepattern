public class DownloadAbstraction implements IDownloadAbstraction {
    private IDownloadImpl provider = null;

    public DownloadAbstraction(IDownloadImpl provider) {
        super();
        this.provider = provider;
    }

    @Override
    public DownloadResponse download(String path) {
        return provider.download(path);
    }
}