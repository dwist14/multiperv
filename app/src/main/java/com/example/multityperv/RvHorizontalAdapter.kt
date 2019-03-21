package com.example.multityperv

import android.annotation.SuppressLint
import android.support.annotation.LayoutRes
import android.widget.ImageView
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder

/**
 * Created by Dwi Styo Purwoko on 21/08/18.
 */
class RvHorizontalAdapter(@LayoutRes layoutResId: Int, data: List<String>?) :
        BaseQuickAdapter<String, BaseViewHolder>(layoutResId, data) {

    @SuppressLint("SetTextI18n")
    override fun convert(helper: BaseViewHolder?, item: String?) {
        val img = helper?.getView<ImageView>(R.id.iv)

        img?.setImageResource(R.drawable.image1)

        helper?.setIsRecyclable(false)
    }

}