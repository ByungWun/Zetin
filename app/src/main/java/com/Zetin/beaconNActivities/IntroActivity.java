package com.Zetin.beaconNActivities;

import com.Zetin.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class IntroActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_intro);

		new Thread(new Runnable() {
			public void run() {
				// TODO Auto-generated method stub
				try {
					Thread.sleep(1500);
				} catch (Throwable ex) {
					ex.printStackTrace();
				}
				Intent i = new Intent(IntroActivity.this, MainActivity.class); //실행될 메인 액티비티를 써준 것이다.
				startActivity(i);
				finish();
			}
		}).start();
	}

//	private void initialize(){
//		Handler handler = new Handler(){
//			public void handleMessage(Message msg) {
//				//finish();
//				startActivity(new Intent(getApplicationContext(), MainActivity.class));
//				//finish();
//			}
//		};
//		handler.sendEmptyMessageDelayed(0, 3000);
//	}
}
