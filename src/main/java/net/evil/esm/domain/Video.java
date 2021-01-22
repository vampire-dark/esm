package net.evil.esm.domain;

import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 视频类
 *
 */
@Repository
public class Video implements Serializable {

    private int id;             //视频id
    private String title;       //视频标题
    private String summary;     //
    private int price;          //视频价格
    private String couverImg;   //
    private Date createTime;    //视频时间
    private List<Chapter> chapter; //视频章节

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

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCouverImg() {
        return couverImg;
    }

    public void setCouverImg(String couverImg) {
        this.couverImg = couverImg;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public List<Chapter> getChapter() {
        return chapter;
    }

    public void setChapter(List<Chapter> chapter) {
        this.chapter = chapter;
    }

    @Override
    public String toString() {
        return "Video{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", summary='" + summary + '\'' +
                ", price=" + price +
                ", couverImg='" + couverImg + '\'' +
                ", createTime=" + createTime +
                ", chapter=" + chapter +
                '}';
    }
}
