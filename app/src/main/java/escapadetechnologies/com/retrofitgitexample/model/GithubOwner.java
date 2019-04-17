package escapadetechnologies.com.retrofitgitexample.model;

import com.google.gson.annotations.SerializedName;

public class GithubOwner {

    @SerializedName("login")
    private String login;

    @SerializedName("html_url")
    private String html_url;

    @SerializedName("avatar_url")
    private String avatar_url;

    public GithubOwner(String login, String html_url, String avatar_url) {
        this.login = login;
        this.html_url = html_url;
        this.avatar_url = avatar_url;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getHtml_url() {
        return html_url;
    }

    public void setHtml_url(String html_url) {
        this.html_url = html_url;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }
}
