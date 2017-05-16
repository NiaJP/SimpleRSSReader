package com.nia.wings.android.simplerssreader;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;


// Item.java
// Item.java
public class Item {
    // 記事のタイトル
    private CharSequence mTitle;
    // 記事のサイト名
    private CharSequence mSite;
    // 記事の更新日
    private CharSequence mDate;
    // リンク
    private CharSequence mLink;
    // HTML
    private CharSequence mHtml;
    // サムネイル
    private Bitmap mThumbnail;

    public Item() {
        mTitle = "";
        mSite = "";
        mDate = "";
        mLink = "";
        mThumbnail = null;
    }

    public CharSequence getTitle() {
        return mTitle;
    }

    public void setTitle(CharSequence title) {
        mTitle = title;
    }

    public CharSequence getSite() {
        return mSite;
    }

    public void setSite(CharSequence site) {
        mSite = site;
    }

    public CharSequence getDate() { return mDate; }

    public void setDate(CharSequence date) {
        mDate = date;
    }

    public CharSequence getLink() {
        return mLink;
    }

    public void setLink(CharSequence link) {
        mLink = link;
    }

    public CharSequence getHtml() {
        return mHtml;
    }

    public void setHtml(CharSequence html) {
        mHtml = html;
    }

    public Bitmap getThumbnail(Resources res) {

        Bitmap bmp = BitmapFactory.decodeResource(res, R.mipmap.ic_launcher);
        return bmp;
        // return mThumbnail;
    }

    public void setThumbnail(Bitmap thumbnail) {
        this.mThumbnail = thumbnail;
    }
}
