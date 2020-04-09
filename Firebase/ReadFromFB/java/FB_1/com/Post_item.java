package FB_1.com;

public class Post_item {

    int LikeCnt;
    String userName, url, text;

    public Post_item(int likeCnt, String userName, String url, String text) {
        LikeCnt = likeCnt;
        this.userName = userName;
        this.url = url;
        this.text = text;
    }

    public int getLikeCnt() {
        return LikeCnt;
    }

    public void setLikeCnt(int likeCnt) {
        LikeCnt = likeCnt;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
