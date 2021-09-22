public class DownloadResponse {
    private String Name;
    private String ContentType;
    private String Content;

    public DownloadResponse(String name, String contentType, String content) {
        this.setName(name);
        this.setContentType(contentType);
        this.setContent(content);
    }
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getContentType() {
        return ContentType;
    }

    public void setContentType(String contentType) {
        ContentType = contentType;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }
}
