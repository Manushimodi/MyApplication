package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Context
import android.location.*
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main4.*
import java.util.*


class Main4Activity : AppCompatActivity(), LocationListener {
    override fun onLocationChanged(location: Location?) {
        val geocoder: Geocoder
        val addresses: List<Address>
        geocoder = Geocoder(this, Locale.getDefault())
        addresses = geocoder.getFromLocation(location!!.getLatitude(), location.getLongitude(), 1)
        val address = addresses[0].getAddressLine(0) // If any additional address line present than only, check with max available address lines by getMaxAddressLineIndex()
        val city = addresses[0].getLocality()
        val state = addresses[0].getAdminArea()
        val country = addresses[0].getCountryName()
        val postalCode = addresses[0].getPostalCode()
        val knownName = addresses[0].getFeatureName()
        locationText.setText("Current Location: " + location!!.getLatitude() + ", " + location.getLongitude() + address + city + state + country + postalCode + knownName);
    }

    override fun onStatusChanged(provider: String?, status: Int, extras: Bundle?) {
        Toast.makeText(this, "Please Enable GPS and Internet", Toast.LENGTH_SHORT).show();
            }

    override fun onProviderDisabled(provider: String?) {

    }

    override fun onProviderEnabled(provider: String?) {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        getLocationBtn.setOnClickListener(){
            getlocation()

        }

    }

    @SuppressLint("MissingPermission")
    fun getlocation(){
        var locationManager:LocationManager = getSystemService(Context.LOCATION_SERVICE) as LocationManager
        locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER,5000,5.0f,this)
    }
}
