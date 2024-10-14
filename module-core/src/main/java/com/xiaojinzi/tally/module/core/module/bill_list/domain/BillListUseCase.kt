package com.xiaojinzi.tally.module.core.module.bill_list.domain

import com.xiaojinzi.reactive.anno.IntentProcess
import com.xiaojinzi.reactive.template.domain.BusinessUseCase
import com.xiaojinzi.reactive.template.domain.BusinessUseCaseImpl
import com.xiaojinzi.reactive.template.domain.CommonUseCase
import com.xiaojinzi.reactive.template.domain.CommonUseCaseImpl
import com.xiaojinzi.support.annotation.ViewModelLayer
import com.xiaojinzi.tally.module.base.module.common_bill_list.domain.CommonBillQueryConditionUseCase
import com.xiaojinzi.tally.module.base.module.common_bill_list.domain.CommonBillQueryConditionUseCaseImpl

sealed class BillListIntent {

    data object Submit : BillListIntent()

}

@ViewModelLayer
interface BillListUseCase : BusinessUseCase {

    val billQueryConditionUseCase: CommonBillQueryConditionUseCase

}

@ViewModelLayer
class BillListUseCaseImpl(
    private val commonUseCase: CommonUseCase = CommonUseCaseImpl(),
    override val billQueryConditionUseCase: CommonBillQueryConditionUseCase = CommonBillQueryConditionUseCaseImpl(),
) : BusinessUseCaseImpl(
    commonUseCase = commonUseCase,
), BillListUseCase {

    @BusinessUseCase.AutoLoading
    @IntentProcess
    private suspend fun submit(intent: BillListIntent.Submit) {
        // TODO
    }
    
    override fun destroy() {
        super.destroy()
        commonUseCase.destroy()
    }

}