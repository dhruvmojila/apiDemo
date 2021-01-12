package com.example.apidemo;

public class Pojo {
    private float postId;
    private float id;
    private String name;
    private String email;
    private String body;


    // Getter Methods

    public String getPostId() {
        return String.valueOf(postId);
    }

    public String getId() {
        return String.valueOf(id);
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getBody() {
        return body;
    }

    // Setter Methods

    public void setPostId(float postId) {
        this.postId = postId;
    }

    public void setId(float id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBody(String body) {
        this.body = body;
    }

}
