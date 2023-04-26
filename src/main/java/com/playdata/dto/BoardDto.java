package com.playdata.dto;

public class BoardDto {
    //DTO는 Data Transfer Object의 약어로, 데이터 전송을 위한 객체입니다
    private int id;
    private String title;

    private String content;
    private String author;
    private String Create_at;

    public BoardDto(int id, String title, String content, String author, String create_at) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.author = author;
        Create_at = create_at;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCreate_at() {
        return Create_at;
    }

    public void setCreate_at(String create_at) {
        Create_at = create_at;
    }
}
