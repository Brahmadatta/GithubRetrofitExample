package escapadetechnologies.com.retrofitgitexample.model;

import com.google.gson.annotations.SerializedName;

public class Github {

    @SerializedName("id")
    private String id;

    @SerializedName("node_id")
    private String node_id;

    @SerializedName("name")
    private String name;

    @SerializedName("full_name")
    private String full_name;


    public Github(String id, String node_id, String name, String full_name) {
        this.id = id;
        this.node_id = node_id;
        this.name = name;
        this.full_name = full_name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNode_id() {
        return node_id;
    }

    public void setNode_id(String node_id) {
        this.node_id = node_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }
}
