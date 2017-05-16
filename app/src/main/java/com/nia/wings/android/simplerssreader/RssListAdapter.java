package com.nia.wings.android.simplerssreader;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.nia.wings.android.*;

import java.util.List;

/**
 * Created by Norio on 2017/05/05.
 */

public class RssListAdapter extends ArrayAdapter<Item> {
    private LayoutInflater mInflater;
    private TextView mSite;
    private TextView mDate;
    private TextView mTitle;
    private ImageView mThumbnail;
//    private TextView mDescr;

    public RssListAdapter(Context context, List<Item> objects) {
        super(context, 0, objects);
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    // 1行ごとのビューを生成する
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;

        if (convertView == null) {
            view = mInflater.inflate(R.layout.item_row, null);
        }

        // 現在参照しているリストの位置からItemを取得する
        Item item = this.getItem(position);
        if (item != null) {
            // Itemから必要なデータを取り出し、それぞれTextViewにセットする

            // タイトル
            String title = item.getTitle().toString();
            mTitle = (TextView) view.findViewById(R.id.item_title);
            mTitle.setText(title);

            // サイト
            String site = item.getSite().toString();
            mSite = (TextView) view.findViewById(R.id.item_site);
            mSite.setText(site);

            // 日付
            String date = item.getDate().toString();
            mDate = (TextView) view.findViewById(R.id.item_date);
            mDate.setText(date);

            // サムネイル
            mThumbnail = (ImageView) view.findViewById(R.id.item_thumbnail);
//            mThumbnail.setImageBitmap(R.mipmap.ic_launcher);

        }
        return view;
    }
}