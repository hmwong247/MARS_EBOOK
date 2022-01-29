package com.mars_ebook;

public class Chapter {

    private String chapterNum, chapterName, link;
    private int like, dislike;

    Chapter(String chapterNum, String chapterName, String link, int like, int dislike) {
        this.chapterNum = chapterNum;
        this.chapterName = chapterName;
        this.link = link;
        this.like = like;
        this.dislike = dislike;
    }

    public String getChapterName() {
        return chapterName;
    }

    public String getChapterNum() {
        return chapterNum;
    }

    public String getLink() {
        return link;
    }

    public int getLike() {
        return like;
    }

    public int getDislike() {
        return dislike;
    }
}
