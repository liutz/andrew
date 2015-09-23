package org.lyc.andrew;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class AlphaToHexActivity extends Activity {	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setTitle(R.string.alpha_to_hex);
		setContentView(R.layout.activity_color);
		TextView color = (TextView) findViewById(R.id.color);		
		color.setText(Utils.getAlphaToHex());	
	}	
}
