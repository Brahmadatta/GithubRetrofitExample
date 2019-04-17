package escapadetechnologies.com.retrofitgitexample.network;

import java.util.List;

import escapadetechnologies.com.retrofitgitexample.model.Github;
import escapadetechnologies.com.retrofitgitexample.model.GithubOwnerArrayList;
import retrofit2.Call;
import retrofit2.http.GET;

public interface GetGithubDataService {
    @GET("repositories")
    Call<List<Github>> getGithubData();

    @GET("repositories")
    Call<GithubOwnerArrayList> getGithubOwnerData();
}
