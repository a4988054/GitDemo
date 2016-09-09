package com.example.activitytest;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends Activity {
	
	private Button openActivity;
	private Button closeActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        openActivity=(Button)findViewById(R.id.openActivity);
        openActivity.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this,SecondActivity.class);
				startActivity(intent);
				
			}
		});
        
       closeActivity= (Button)findViewById(R.id.closeActivity);
       closeActivity.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Builder builder = new AlertDialog.Builder(MainActivity.this);
			builder.setTitle("Talk");
			builder.setMessage("Do you want close the fucking window");
			builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface arg0, int arg1) {
					// TODO Auto-generated method stub
					finish();
				}
			});
			builder.setNegativeButton("No", null);	
			builder.create().show();
		}
	});
    }



}
