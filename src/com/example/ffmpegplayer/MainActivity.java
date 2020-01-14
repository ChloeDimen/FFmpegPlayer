package com.example.ffmpegplayer;



import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.ActionBarActivity;
import android.view.Surface;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.dimen.ffmpegplayer.VideoPlayer;


public class MainActivity extends ActionBarActivity {
	private VideoPlayer player;
	private VideoView videoView;
	private Spinner sp_video;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		videoView = (VideoView) findViewById(R.id.video_view);
		sp_video = (Spinner) findViewById(R.id.sp_video);
		player = new VideoPlayer();
		
	}
	public void mPlay(View btn){
		
		Surface surface=videoView.getHolder().getSurface();
		player.play("/sdcard/sintel.mp4", surface);
		
	}
	
}
