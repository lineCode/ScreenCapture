package com.softard.wow.screencapture;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.VideoView;

public class RTSPlayerActivity extends AppCompatActivity {

    private VideoView mVideoView;

    private String mURL = "rtsp://118.25.39.144/sample_h264_1mbit.mp4";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rtsplayer);

        mVideoView = this.findViewById(R.id.videoView);
        mVideoView.setVideoPath(mURL);
        mVideoView.requestFocus();
        mVideoView.start();
    }
}
