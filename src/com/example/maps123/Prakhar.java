package com.example.maps123;


import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;


import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.view.Window;

public class Prakhar extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
	    getActionBar().hide();
		setContentView(R.layout.activity_prakhar);
		final GoogleMap googleMap;
		googleMap = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		final LatLng bitspilani = new LatLng(17.544860 , 78.571718);
		Marker TP = googleMap.addMarker(new MarkerOptions().position(bitspilani).title("BPHC")); 
		CameraUpdate center = CameraUpdateFactory.newLatLng(bitspilani);
		CameraUpdate zoom = CameraUpdateFactory.zoomTo(18);
		googleMap.moveCamera(center);
		googleMap.animateCamera(zoom);
		/*
		determining the location through GPS*/
		
		LocationManager lm=(LocationManager) this.getSystemService(Context.LOCATION_SERVICE);
		LocationListener listener=new LocationListener() {
			
			@Override
			public void onStatusChanged(String arg0, int arg1, Bundle arg2) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onProviderEnabled(String arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onProviderDisabled(String arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onLocationChanged(Location loc) {
				// TODO Auto-generated method stub
				final float lati = (float)loc.getLatitude();
				final float longi  = (float)loc.getLongitude();
				final LatLng pos = new LatLng(lati , longi);
				Marker userMarker = googleMap.addMarker(new MarkerOptions().position(pos).title("YOU"));
				
			}
		};
		
		lm.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, listener);
		
		/*SAVING THE LAST LOCATION*/
		String locationprevious = LocationManager.NETWORK_PROVIDER;
		Location last = lm.getLastKnownLocation(locationprevious);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.prakhar, menu);
		return true;
	}


}
