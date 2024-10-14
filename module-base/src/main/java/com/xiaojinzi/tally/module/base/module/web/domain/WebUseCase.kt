package com.xiaojinzi.tally.module.base.module.web.domain

import com.xiaojinzi.reactive.anno.IntentProcess
import com.xiaojinzi.reactive.template.domain.BusinessUseCase
import com.xiaojinzi.reactive.template.domain.BusinessUseCaseImpl
import com.xiaojinzi.reactive.template.domain.CommonUseCase
import com.xiaojinzi.reactive.template.domain.CommonUseCaseImpl
import com.xiaojinzi.support.annotation.StateHotObservable
import com.xiaojinzi.support.annotation.ViewModelLayer
import com.xiaojinzi.support.ktx.MutableSharedStateFlow

sealed class WebIntent {

    data object Submit : WebIntent()

}

@ViewModelLayer
interface WebUseCase : BusinessUseCase {

    /**
     * 网页地址
     */
    @StateHotObservable
    val urlStateOb: MutableSharedStateFlow<String?>

    /**
     * 网页标题
     */
    @StateHotObservable
    val titleStateOb: MutableSharedStateFlow<String?>

}

@ViewModelLayer
class WebUseCaseImpl(
    private val commonUseCase: CommonUseCase = CommonUseCaseImpl(),
) : BusinessUseCaseImpl(
    commonUseCase = commonUseCase,
), WebUseCase {

    override val urlStateOb = MutableSharedStateFlow<String?>(
        initValue = null,
    )

    override val titleStateOb = MutableSharedStateFlow<String?>(
        initValue = null,
    )

    @IntentProcess
    @BusinessUseCase.AutoLoading
    private suspend fun submit(intent: WebIntent.Submit) {
        // TODO
    }
    
    override fun destroy() {
        super.destroy()
        commonUseCase.destroy()
    }

}