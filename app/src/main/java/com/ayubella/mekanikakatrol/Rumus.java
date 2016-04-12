package com.ayubella.mekanikakatrol;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class Rumus extends Activity implements OnClickListener {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.rumus);

		View rumus1 = findViewById(R.id.rumus1);
		rumus1.setOnClickListener((OnClickListener) this);
		View rumus2 = findViewById(R.id.rumus2);
		rumus2.setOnClickListener((OnClickListener) this);
		View rumus3 = findViewById(R.id.rumus3);
		rumus3.setOnClickListener((OnClickListener) this);
		View rumus4 = findViewById(R.id.rumus4);
		rumus4.setOnClickListener((OnClickListener) this);
		View rumus5 = findViewById(R.id.rumus5);
		rumus5.setOnClickListener((OnClickListener) this);
		View rumus6 = findViewById(R.id.rumus6);
		rumus6.setOnClickListener((OnClickListener) this);
		View rumus7 = findViewById(R.id.rumus7);
		rumus7.setOnClickListener((OnClickListener) this);
		View rumus8 = findViewById(R.id.rumus8);
		rumus8.setOnClickListener((OnClickListener) this);
		View rumus9 = findViewById(R.id.rumus9);
		rumus9.setOnClickListener((OnClickListener) this);
		View rumus10 = findViewById(R.id.rumus10);
		rumus10.setOnClickListener((OnClickListener) this);
		View rumus11 = findViewById(R.id.rumus11);
		rumus11.setOnClickListener((OnClickListener) this);
		View rumus12 = findViewById(R.id.rumus12);
		rumus12.setOnClickListener((OnClickListener) this);
	}

	public void onClick(View v) {
		switch (v.getId()) {

		case R.id.rumus1:
			Intent menu = new Intent(this, Rumus1.class);
			startActivity(menu);
			break;
		case R.id.rumus2:
			Intent menu1 = new Intent(this, Rumus2.class);
			startActivity(menu1);
			break;
		case R.id.rumus3:
			Intent menu2 = new Intent(this, Rumus3.class);
			startActivity(menu2);
			break;
		case R.id.rumus4:
			Intent menu3 = new Intent(this, Rumus4.class);
			startActivity(menu3);
			break;
		case R.id.rumus5:
			Intent menu4 = new Intent(this, Rumus5.class);
			startActivity(menu4);
			break;
		case R.id.rumus6:
			Intent menu5 = new Intent(this, Rumus6.class);
			startActivity(menu5);
			break;
		case R.id.rumus7:
			Intent menu6 = new Intent(this, Rumus7.class);
			startActivity(menu6);
			break;
		case R.id.rumus8:
			Intent menu7 = new Intent(this, Rumus8.class);
			startActivity(menu7);
			break;
		case R.id.rumus9:
			Intent menu8 = new Intent(this, Rumus9.class);
			startActivity(menu8);
			break;
		case R.id.rumus10:
			Intent menu9 = new Intent(this, Rumus10.class);
			startActivity(menu9);
			break;
		case R.id.rumus11:
			Intent menu10 = new Intent(this, Rumus11.class);
			startActivity(menu10);
			break;
		case R.id.rumus12:
			Intent menu11 = new Intent(this, Rumus12.class);
			startActivity(menu11);
			break;
		}
	}
}