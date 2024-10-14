package com.xiaojinzi.tally.module.main.module.main.view

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.core.view.WindowCompat
import com.xiaojinzi.component.anno.RouterAnno
import com.xiaojinzi.support.activity_stack.ActivityFlag
import com.xiaojinzi.support.annotation.ViewLayer
import com.xiaojinzi.support.compose.StateBar
import com.xiaojinzi.support.ktx.initOnceUseViewModel
import com.xiaojinzi.support.ktx.translateStatusBar
import com.xiaojinzi.tally.lib.res.ui.APP_ACTIVITY_FLAG_MAIN
import com.xiaojinzi.tally.module.base.support.AppRouterConfig
import com.xiaojinzi.tally.module.base.support.finishAppAllTask
import com.xiaojinzi.tally.module.base.theme.AppTheme
import com.xiaojinzi.tally.module.base.view.BaseBusinessAct
import kotlinx.coroutines.InternalCoroutinesApi

@RouterAnno(
    hostAndPath = AppRouterConfig.MAIN_MAIN,
    interceptors = [
        MainRouterInterceptor::class,
    ]
)
@ActivityFlag(
    value = [
        APP_ACTIVITY_FLAG_MAIN,
    ],
)
@ViewLayer
class MainAct : BaseBusinessAct<MainViewModel>() {

    override fun getViewModelClass(): Class<MainViewModel> {
        return MainViewModel::class.java
    }

    @OptIn(
        InternalCoroutinesApi::class,
        ExperimentalMaterial3Api::class,
        ExperimentalAnimationApi::class,
        ExperimentalFoundationApi::class,
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.translateStatusBar()
        WindowCompat.setDecorFitsSystemWindows(window, false)

        initOnceUseViewModel {
        }

        setContent {
            AppTheme {
                StateBar {
                    MainViewWrap()
                }
            }
        }

    }

}