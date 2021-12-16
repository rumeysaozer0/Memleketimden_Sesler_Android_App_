package com.rumeysaozer.memleketimdenseslerandroidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.MotionEvent
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import com.rumeysaozer.memleketimdenseslerandroidapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val webView = binding.webView as WebView
        webView.loadUrl("http://rumeysaozer.com/memleketimdensesler/")
        val webSetting = webView.settings
        webSetting.javaScriptEnabled = true
        webView.webViewClient = WebViewClient()
        webView.canGoBack()
        webView.setOnKeyListener (View.OnKeyListener{ v, keyCode, event ->
            if(keyCode == KeyEvent.KEYCODE_BACK && event.action == MotionEvent.ACTION_UP && webView.canGoBack()){
                webView.goBack()
                return@OnKeyListener true
    }
        false
        })


    }
}