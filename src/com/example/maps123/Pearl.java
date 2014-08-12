package com.example.maps123;

//import com.example.maps123.About;
//import com.example.maps123.MapLocation;
import com.example.maps123.Pearl;
import com.example.maps123.R;
import com.pushbots.push.Pushbots;
//import com.example.maps123.Shedule;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Pearl extends Activity {

	private String SENDER_ID="761297081029";
	private String CLIENT_APPLICATION_ID="53108e291d0ab180168b45cf";

	@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
    getActionBar().hide();
    Pushbots.init(this, SENDER_ID,CLIENT_APPLICATION_ID);
	setContentView(R.layout.activity_pearl);
	
	ImageButton about = (ImageButton)findViewById(R.id.about);
	ImageButton shedule = (ImageButton)findViewById(R.id.shedule);
	ImageButton locbut = (ImageButton)findViewById(R.id.location);
	ImageButton web=(ImageButton) findViewById(R.id.webbutton);
	ImageButton iv1=(ImageButton) findViewById(R.id.imageView1);
	ImageButton iv2=(ImageButton) findViewById(R.id.imageView2);
	ImageButton iv3=(ImageButton) findViewById(R.id.imageView3);
	ImageButton iv4=(ImageButton) findViewById(R.id.imageView4);
	ImageButton iv5=(ImageButton) findViewById(R.id.imageView5);
	ImageButton feed = (ImageButton)findViewById(R.id.imageView29);
	ImageButton events = (ImageButton)findViewById(R.id.imageView25);
	
	/*ImageView iv1=(ImageView) findViewById(R.id.imageView1);
	ImageView iv2=(ImageView) findViewById(R.id.imageView2);
	ImageView iv3=(ImageView) findViewById(R.id.imageView3);
	ImageView iv4=(ImageView) findViewById(R.id.imageView4);
	ImageView iv5=(ImageView) findViewById(R.id.imageView5);*/
	iv5.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://bits-pearl.org/contact/"));
			startActivity(intent);
		}
	});
	iv4.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent intent=new Intent(Pearl.this,Food.class);
			startActivity(intent);
		}
	});
	iv3.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.bits-pearl.org/#"));
			startActivity(intent);
		}
	});
	iv1.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://m.facebook.com/bitspearl"));
			startActivity(intent);
		}
	});
	iv2.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.twitter.com/intent/user?screen_name=bits_pearl"));
			startActivity(intent);
		}
	});
	web.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.bits-pearl.org"));
			startActivity(intent);
		}
	});
	shedule.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			startActivity(new Intent(Pearl.this,Schedule.class));
			
		}
	});
	about.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			startActivity(new Intent(Pearl.this,About.class));
		
			
		}
	});
	locbut.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			startActivity(new Intent(Pearl.this,Prakhar.class));
			// TODO Auto-generated method stub
			//startActivity(new Intent(Pearl.this,MapLocation.class));
		}
	});
	
	
	// for sending The feedBack
	feed.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			final Intent _Intent = new Intent(android.content.Intent.ACTION_SEND);
	         _Intent.setType("text/html");
	         _Intent.putExtra(android.content.Intent.EXTRA_EMAIL, new String[]{ getString(R.string.mail_feedback_email) });
	         _Intent.putExtra(android.content.Intent.EXTRA_SUBJECT, getString(R.string.mail_feedback_subject));
	         _Intent.putExtra(android.content.Intent.EXTRA_TEXT, getString(R.string.mail_feedback_message));
	         startActivity(Intent.createChooser(_Intent, getString(R.string.title_send_feedback)));
			
		}
	});
	
	events.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			startActivity(new Intent(Pearl.this,EventManaging.class));
		}
	});
}

}
