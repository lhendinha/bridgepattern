import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BridgeTest {
    private IDownloadAbstraction downloader;

    @Test
    void testWindows() {
        System.out.println("Running: testWindows");

        downloader = new DownloadAbstraction(new WindowsFileDownloadImpl());
        DownloadResponse downloadResponse = downloader.download("/etc/folder");

        assertEquals(downloadResponse.getName(), "windows.pdf");
        assertEquals(downloadResponse.getContentType(), "application/pdf");
        assertEquals(downloadResponse.getContent(), "content");
    }

    @Test
    void testMac() {
        System.out.println("Running: testMac");

        downloader = new DownloadAbstraction(new MacFileDownloadImpl());
        DownloadResponse downloadResponse = downloader.download("/etc/folder");

        assertEquals(downloadResponse.getName(), "mac.pdf");
        assertEquals(downloadResponse.getContentType(), "application/pdf");
        assertEquals(downloadResponse.getContent(), "content");
    }

    @Test
    void testLinux() {
        System.out.println("Running: testLinux");

        downloader = new DownloadAbstraction(new LinuxFileDownloadImpl());
        DownloadResponse downloadResponse = downloader.download("/etc/folder");

        assertEquals(downloadResponse.getName(), "linux.pdf");
        assertEquals(downloadResponse.getContentType(), "application/pdf");
        assertEquals(downloadResponse.getContent(), "content");
    }
}
