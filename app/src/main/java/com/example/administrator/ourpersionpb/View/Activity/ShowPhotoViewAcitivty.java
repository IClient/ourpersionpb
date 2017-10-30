package com.example.administrator.ourpersionpb.View.Activity;


import android.os.Bundle;
import android.text.TextUtils;

import com.bumptech.glide.Glide;
import com.example.administrator.ourpersionpb.Application.AndroidApplication;
import com.example.administrator.ourpersionpb.Model.bean.OkHttpURL;
import com.example.administrator.ourpersionpb.R;


import uk.co.senab.photoview.PhotoView;

public class ShowPhotoViewAcitivty extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AndroidApplication application = (AndroidApplication) getApplication();
        application.addactivity(ShowPhotoViewAcitivty.this);
        setContentView(R.layout.activity_show_photo_view);
        PhotoView photoView = (PhotoView) findViewById(R.id.photoview_show);
        String image = getIntent().getStringExtra("imagepath");
        if (!TextUtils.isEmpty(image)) {
            Glide.with(ShowPhotoViewAcitivty.this).load(OkHttpURL.ImageURL + image).into(photoView);
        }

        String oldmanimage = getIntent().getStringExtra("oldmanimage");
        if (!TextUtils.isEmpty(oldmanimage)) {
            Glide.with(ShowPhotoViewAcitivty.this).load(oldmanimage).into(photoView);
        }

        String firstmainoldmanimage = getIntent().getStringExtra("firstmainoldmanimage");
        if (!TextUtils.isEmpty(firstmainoldmanimage)) {
            Glide.with(ShowPhotoViewAcitivty.this).load(firstmainoldmanimage).into(photoView);
        }
    }
}
