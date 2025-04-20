package com.ssafy.mvc.model.dto;

import java.time.LocalDateTime;

public class Board {
    private Long id;
    private String title;
    private String content;
    private String writer;
    private LocalDateTime createdAt;
    private String fileName;
    private String originalFileName;

    public Board(){
    }
    public Board(Long id, String title, String content, String writer, LocalDateTime createdAt,
        String fileName, String originalFileName) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.createdAt = createdAt;
        this.fileName = fileName;
        this.originalFileName = originalFileName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getOriginalFileName() {
        return originalFileName;
    }

    public void setOriginalFileName(String originalFileName) {
        this.originalFileName = originalFileName;
    }

    @Override
    public String toString() {
        return "Board{" +
            "id=" + id +
            ", title='" + title + '\'' +
            ", content='" + content + '\'' +
            ", writer='" + writer + '\'' +
            ", createdAt=" + createdAt +
            ", fileName='" + fileName + '\'' +
            ", originalFileName='" + originalFileName + '\'' +
            '}';
    }
}
