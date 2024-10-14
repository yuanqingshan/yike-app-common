package com.xiaojinzi.tally.module.core.module.price_calculate.domain

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.annotation.UiContext
import com.xiaojinzi.reactive.anno.IntentProcess
import com.xiaojinzi.reactive.template.domain.BusinessUseCase
import com.xiaojinzi.reactive.template.domain.BusinessUseCaseImpl
import com.xiaojinzi.reactive.template.domain.CommonUseCase
import com.xiaojinzi.reactive.template.domain.CommonUseCaseImpl
import com.xiaojinzi.support.annotation.ViewModelLayer
import com.xiaojinzi.support.ktx.getActivity
import com.xiaojinzi.support.ktx.tryFinishActivity
import com.xiaojinzi.tally.module.base.spi.CostUseCaseSpi
import com.xiaojinzi.tally.module.core.spi.CostUseCaseSpiImpl
import kotlinx.coroutines.flow.first

sealed class PriceCalculateIntent {

    data class Submit(
        @UiContext val context: Context,
    ) : PriceCalculateIntent()

}

@ViewModelLayer
interface PriceCalculateUseCase : BusinessUseCase {

    val costUseCase: CostUseCaseSpi

}

@ViewModelLayer
class PriceCalculateUseCaseImpl(
    private val commonUseCase: CommonUseCase = CommonUseCaseImpl(),
    override val costUseCase: CostUseCaseSpi = CostUseCaseSpiImpl()
) : BusinessUseCaseImpl(
    commonUseCase = commonUseCase,
), PriceCalculateUseCase {

    @BusinessUseCase.AutoLoading
    @IntentProcess
    private suspend fun submit(intent: PriceCalculateIntent.Submit) {
        val numberStr = costUseCase.costStrStateOb.first().strValue
        val result = if (numberStr.isEmpty()) {
            0f
        } else {
            costUseCase.calculateResult(target = numberStr)
        }
        intent.context.getActivity()?.run {
            this.setResult(
                Activity.RESULT_OK,
                Intent().apply {
                    this.extras
                    this.putExtra("data", result)
                }
            )
        }
        intent.context.tryFinishActivity()
    }

    override fun destroy() {
        super.destroy()
        commonUseCase.destroy()
        costUseCase.destroy()
    }

}