package com.mygallary.activities.base;

import android.os.Bundle;

import com.mygallary.MyApplication;
import com.mygallary.data.Album;
import com.mygallary.data.HandlingAlbums;

/**
 * Created by dnld on 03/08/16.
 */

public class SharedMediaActivity extends ThemedActivity {
  @Override
  public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
  }

  public HandlingAlbums getAlbums() {
	return ((MyApplication) getApplicationContext()).getAlbums();
  }

  public Album getAlbum() {
	return ((MyApplication) getApplicationContext()).getAlbum();
  }
}
