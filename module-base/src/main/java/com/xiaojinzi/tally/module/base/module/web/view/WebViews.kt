package com.xiaojinzi.tally.module.base.module.web.view

import android.annotation.SuppressLint
import android.webkit.WebView
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.google.accompanist.web.AccompanistWebChromeClient
import com.google.accompanist.web.rememberWebViewState
import com.xiaojinzi.reactive.template.view.BusinessContentView
import com.xiaojinzi.support.ktx.nothing
import com.xiaojinzi.support.ktx.orNull
import com.xiaojinzi.support.ktx.toStringItemDto
import com.xiaojinzi.tally.module.base.view.compose.AppbarNormalM3
import kotlinx.coroutines.InternalCoroutinesApi

@InternalCoroutinesApi
@ExperimentalMaterial3Api
@ExperimentalAnimationApi
@ExperimentalFoundationApi
@Composable
private fun WebView(
    needInit: Boolean? = false,
) {
    val context = LocalContext.current
    BusinessContentView<WebViewModel>(
        needInit = needInit,
    ) { vm ->
        val url by vm.urlStateOb.collectAsState(initial = null)
        url.orNull()?.let { url1 ->
            val state = rememberWebViewState(url = url1)
            com.google.accompanist.web.WebView(
                modifier = Modifier
                    .fillMaxSize()
                    .nothing(),
                state = state,
                onCreated = {
                    it.settings.javaScriptEnabled = true
                },
                chromeClient = remember {
                    object : AccompanistWebChromeClient() {
                        override fun onReceivedTitle(view: WebView, title: String?) {
                            super.onReceivedTitle(view, title)
                            vm.titleStateOb.value = title
                        }
                    }
                },
            )
        }
    }
}

@InternalCoroutinesApi
@ExperimentalMaterial3Api
@ExperimentalAnimationApi
@ExperimentalFoundationApi
@Composable
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
fun WebViewWrap() {
    val vm: WebViewModel = viewModel()
    val title by vm.titleStateOb.collectAsState(initial = "")
    Scaffold(
        topBar = {
            AppbarNormalM3(
                title = title?.toStringItemDto(),
            )
        }
    ) {
        Box(
            modifier = Modifier
                .padding(top = it.calculateTopPadding())
                .nothing(),
        ) {
            WebView()
        }
    }
}

@InternalCoroutinesApi
@ExperimentalMaterial3Api
@ExperimentalAnimationApi
@ExperimentalFoundationApi
@Preview
@Composable
private fun WebViewPreview() {
    WebView(
        needInit = false,
    )
}