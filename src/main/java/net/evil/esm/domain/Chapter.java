package net.evil.esm.domain;

import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * 章节对象
 *
 */
@Repository
public class Chapter implements Serializable {

    private int id;                 //章节id
    private int videoId;           //视频id
    private String title;           //章节标题

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVideoId() {
        return videoId;
    }

    public void setVideoId(int videoId) {
        this.videoId = videoId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Chapter{" +
                "id=" + id +
                ", videoId=" + videoId +
                ", title='" + title + '\'' +
                '}';
    }
}
