package com.example.jeremy.anews.adapter;

public class News {

    private String title;
    private String description;
    private String fullNews;

    public News(String title, String description, String fullNews)
    {
        this.title = title;
        this.description = description;
        this.fullNews =  fullNews;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFullNews() {
        return fullNews;
    }

    public void setFullNews(String fullNews) {
        this.fullNews = fullNews;
    }
}
