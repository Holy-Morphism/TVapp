package com.example.tvapp

import android.os.Bundle
import android.util.Log
import android.webkit.WebView
import androidx.fragment.app.FragmentActivity

/**
 * Loads [MainFragment].
 */
class MainActivity : FragmentActivity() {
    private lateinit var webView: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                .replace(R.id.main_browse_fragment, MainFragment())
                .commitNow()
        }
        webView = findViewById(R.id.webview)
        webView.settings.javaScriptEnabled = true
        webView.loadUrl("https://streamsquid.com/")
        Log.d("WebView", "Loaded URL: https://streamsquid.com/")

    }

}