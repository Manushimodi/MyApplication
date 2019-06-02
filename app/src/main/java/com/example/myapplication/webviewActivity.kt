package com.example.myapplication

import android.graphics.Bitmap
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_webview.*
import android.webkit.WebView
import android.widget.Toast


class webviewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webview)

        wb_webview_webviewactivity.settings.javaScriptEnabled=true
        wb_webview_webviewactivity.loadUrl("https://stackoverflow.com/questions/26798045/passing-url-and-a-title-to-a-webview")

        wb_webview_webviewactivity.setWebViewClient(object : WebViewClient() {
            override fun onPageFinished(view: WebView, url: String) {
                Toast.makeText(this@webviewActivity,"page loaded",Toast.LENGTH_LONG).show()
            }

            override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
                Toast.makeText(this@webviewActivity,"page started loading",Toast.LENGTH_LONG).show()
            }


        })
    }
}
