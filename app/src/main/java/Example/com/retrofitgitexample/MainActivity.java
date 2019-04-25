package Example.com.retrofitgitexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import Example.com.retrofitgitexample.adapter.GithubAdapter;
import Example.com.retrofitgitexample.model.Github;
import Example.com.retrofitgitexample.model.GithubOwner;
import Example.com.retrofitgitexample.model.GithubOwnerArrayList;
import Example.com.retrofitgitexample.network.GetGithubDataService;
import Example.com.retrofitgitexample.network.RetrofitInstance;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        GetGithubDataService getGithubDataService = RetrofitInstance.getRetrofitInstance().create(GetGithubDataService.class);

        Call<List<Github>> call = getGithubDataService.getGithubData();

        Call<GithubOwnerArrayList> ownerArrayListCall = getGithubDataService.getGithubOwnerData();

        call.enqueue(new Callback<List<Github>>() {
            @Override
            public void onResponse(Call<List<Github>> call, Response<List<Github>> response) {
                getGithubData(response.body());
            }

            @Override
            public void onFailure(Call<List<Github>> call, Throwable t) {

                Toast.makeText(MainActivity.this, ""+t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        /*ownerArrayListCall.enqueue(new Callback<GithubOwnerArrayList>() {
            @Override
            public void onResponse(Call<GithubOwnerArrayList> call, Response<GithubOwnerArrayList> response) {
                getGithubOwnerData(response.body().getGithubOwnerArrayList());
            }

            @Override
            public void onFailure(Call<GithubOwnerArrayList> call, Throwable t) {

            }
        });*/
    }

    private void getGithubOwnerData(ArrayList<GithubOwner> githubOwnerArrayList) {

    }

    private void getGithubData(List<Github> githubList) {

        GithubAdapter githubAdapter = new GithubAdapter(githubList,this);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(githubAdapter);
    }


}
