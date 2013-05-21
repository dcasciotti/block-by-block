package com.davecasciotti.hello;

import android.os.Bundle;


import org.apache.cordova.*;

public class MainActivity extends DroidGap {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		super.clearCache();
		super.loadUrl("file:///android_asset/www/ch6cat.html");
		super.setIntegerProperty("loadUrlTimeoutValue", 60000);
	}


}
