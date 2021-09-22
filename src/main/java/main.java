public class main {
    public static void main(String[] args) {
        String os = "mac";
        IDownloadAbstraction downloader = null;

        switch (os)
        {
            case "windows":
                downloader = new DownloadAbstraction( new WindowsFileDownloadImpl() );
                break;

            case "mac":
                downloader = new DownloadAbstraction( new MacFileDownloadImpl() );
                break;

            case "linux":
                downloader = new DownloadAbstraction( new LinuxFileDownloadImpl() );
                break;

            default:
                System.out.println("OS not supported !!");
        }

        DownloadResponse downloadResponse = downloader.download("/etc/folder");

        System.out.println("Name: " + downloadResponse.getName() + ", ContentType: "
                + downloadResponse.getContentType() + ", Content: " + downloadResponse.getContent());
    }
}
