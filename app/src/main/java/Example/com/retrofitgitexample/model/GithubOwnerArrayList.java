package Example.com.retrofitgitexample.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class GithubOwnerArrayList {

    @SerializedName("owner")
    private ArrayList<GithubOwner> githubOwnerArrayList;

    public ArrayList<GithubOwner> getGithubOwnerArrayList() {
        return githubOwnerArrayList;
    }

    public void setGithubOwnerArrayList(ArrayList<GithubOwner> githubOwnerArrayList) {
        this.githubOwnerArrayList = githubOwnerArrayList;
    }
}
