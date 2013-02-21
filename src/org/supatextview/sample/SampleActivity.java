package org.supatextview.sample;

import org.supatextview.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class SampleActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sample);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.sample, menu);
		return true;
	}

}
