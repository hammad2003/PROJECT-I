package com.example.projecti;

import java.util.HashMap;
import java.util.Map;

public class Post {
    public String uid;
    public String author;
    public String authorPhotoUrl;
    public String content;
    public String mediaUrl;
    public String mediaType;
    public Long timeStamp;


    public Map<String, Boolean> likes = new HashMap<>();

    // Constructor vacio requerido por Firestore
    public Post() {}
    public Post(String uid, String displayName, String photo, String postContent, String mediaUrl, String mediaTipo, Long timeStamp)
    {
        this.uid = uid;
        this.author = displayName;
        this.authorPhotoUrl = photo;
        this.content = postContent;
        this.mediaUrl = mediaUrl;
        this.mediaType = mediaTipo;
        this.timeStamp = timeStamp;
    }
}
