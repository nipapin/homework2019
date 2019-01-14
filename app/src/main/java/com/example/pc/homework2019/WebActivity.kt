package com.example.pc.homework2019

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_web.*
import android.webkit.WebViewClient


class WebActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)

        webview.webViewClient = WebViewClient()
        val Intent = intent
        webview.loadUrl(Intent.getStringExtra("Link"))
    }
}
