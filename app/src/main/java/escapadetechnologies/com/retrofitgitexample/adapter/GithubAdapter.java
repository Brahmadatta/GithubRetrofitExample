package escapadetechnologies.com.retrofitgitexample.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import escapadetechnologies.com.retrofitgitexample.R;
import escapadetechnologies.com.retrofitgitexample.model.Github;

public class GithubAdapter extends RecyclerView.Adapter<GithubAdapter.GithubViewHolder>{

    List<Github> githubArrayList;
    private Context context;

    public GithubAdapter(List<Github> githubArrayList, Context context) {
        this.githubArrayList = githubArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public GithubViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.github_row,null,false);
        return new GithubViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GithubViewHolder githubViewHolder, int i) {

        Github github = githubArrayList.get(i);


        githubViewHolder.node_id.setText(githubArrayList.get(i).getNode_id());
        githubViewHolder.name.setText(githubArrayList.get(i).getName());
        githubViewHolder.full_name.setText(githubArrayList.get(i).getFull_name());
        githubViewHolder.description.setText(githubArrayList.get(i).getDescription());

        githubViewHolder.login.setText(github.getOwner().getLogin());
        githubViewHolder.html_url.setText(github.getOwner().getHtml_url());
        githubViewHolder.avatar_url.setText(github.getOwner().getAvatar_url());
    }

    @Override
    public int getItemCount() {
        return githubArrayList.size();
    }

    public class GithubViewHolder extends RecyclerView.ViewHolder{

        TextView node_id,name,full_name,login,html_url,avatar_url,description;

        public GithubViewHolder(@NonNull View itemView) {
            super(itemView);
            node_id = itemView.findViewById(R.id.node_id);
            name = itemView.findViewById(R.id.name);
            full_name = itemView.findViewById(R.id.full_name);
            login = itemView.findViewById(R.id.login);
            html_url = itemView.findViewById(R.id.html_url);
            avatar_url = itemView.findViewById(R.id.avatar_url);
            description = itemView.findViewById(R.id.description);
        }
    }
}
