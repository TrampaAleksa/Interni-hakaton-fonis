package com.fonis.interni;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Post {

    @Id
    @GeneratedValue
    private long id;
    private String text;
    private String date;
    private String title;
    private String link;

    public Post() {
    }

    public Post(String text, String date, String title, String link) {
        this.text = text;
        this.date = date;
        this.title = title;
        this.link = link;
    }

    public Post(String text, String date, String title) {
        this.text = text;
        this.date = date;
        this.title = title;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", date='" + date + '\'' +
                ", title='" + title + '\'' +
                ", link='" + link + '\'' +
                '}';
    }
}
