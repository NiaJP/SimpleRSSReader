package com.nia.wings.android.simplerssreader;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

// ItemDetailActivity.java
public class ItemDetailActivity extends Activity {
    private TextView mTitle;
//    private TextView mDescr;
    private TextView mSite;
    private TextView mDate;
    private WebView mWeb;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_detail);

        Intent intent = getIntent();

/*
        String title = intent.getStringExtra("TITLE");
        mTitle = (TextView) findViewById(R.id.item_detail_title);
        mTitle.setText(title);
        String descr = intent.getStringExtra("DESCRIPTION");
        mDescr = (TextView) findViewById(R.id.item_detail_descr);
        mDescr.setText(descr);
        String site = intent.getStringExtra("SITE");
        mSite = (TextView) findViewById(R.id.item_detail_site);
        mSite.setText(site);
        String pdate = intent.getStringExtra("DATE");
        mDate = (TextView) findViewById(R.id.item_detail_date);
        mDate.setText(pdate);
*/

        String link = intent.getStringExtra("LINK");
        mWeb = (WebView) findViewById(R.id.web);
        mWeb.getSettings().setJavaScriptEnabled(true);    // javascript OFF
        mWeb.setWebViewClient( new WebViewClient());
        mWeb.getSettings().setLoadWithOverviewMode(true);    // 全体表示？
        mWeb.getSettings().setUseWideViewPort(true);    // フィット？
        mWeb.loadUrl(link);

    }
}