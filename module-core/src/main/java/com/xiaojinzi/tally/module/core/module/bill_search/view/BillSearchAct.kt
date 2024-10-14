package com.xiaojinzi.tally.module.core.module.bill_search.view

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.core.view.WindowCompat
import com.xiaojinzi.component.anno.AttrValueAutowiredAnno
import com.xiaojinzi.component.anno.RouterAnno
import com.xiaojinzi.support.activity_stack.ActivityFlag
import com.xiaojinzi.support.annotation.ViewLayer
import com.xiaojinzi.support.compose.StateBar
import com.xiaojinzi.support.ktx.initOnceUseViewModel
import com.xiaojinzi.support.ktx.translateStatusBar
import com.xiaojinzi.tally.lib.res.ui.APP_ACTIVITY_FLAG_SYNC_SKIP
import com.xiaojinzi.tally.module.base.support.AppRouterConfig
import com.xiaojinzi.tally.module.base.theme.AppTheme
import com.xiaojinzi.tally.module.base.view.BaseBusinessAct
import com.xiaojinzi.tally.module.core.module.bill_search.domain.BillSearchIntent
import kotlinx.coroutines.InternalCoroutinesApi

@RouterAnno(
    hostAndPath = AppRouterConfig.CORE_BILL_SEARCH,
)
@ActivityFlag(
    value = [
        APP_ACTIVITY_FLAG_SYNC_SKIP,
    ],
)
@ViewLayer
class BillSearchAct : BaseBusinessAct<BillSearchViewModel>() {

    @AttrValueAutowiredAnno("accountIdList")
    var accountIdList: ArrayList<String> = arrayListOf()

    @AttrValueAutowiredAnno("labelIdList")
    var labelIdList: ArrayList<String> = arrayListOf()

    override fun getViewModelClass(): Class<BillSearchViewModel> {
        return BillSearchViewModel::class.java
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
            requiredViewModel().addIntent(
                intent = BillSearchIntent.ParameterInit(
                    context = mContext,
                    accountIdSet = accountIdList.toSet(),
                    labelIdSet = labelIdList.toSet(),
                )
            )
        }

        setContent {
            AppTheme {
                StateBar {
                    BillSearchViewWrap()
                }
            }
        }

    }

}