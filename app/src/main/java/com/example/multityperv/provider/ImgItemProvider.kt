package com.example.multityperv.provider

import android.widget.Toast
import com.chad.library.adapter.base.BaseViewHolder
import com.chad.library.adapter.base.provider.BaseItemProvider
import com.example.multityperv.DemoMultipleItemRvAdapter
import com.example.multityperv.NormalMultipleEntity
import com.example.multityperv.R

/**
 * https://github.com/chaychan
 *
 * @author ChayChan
 * @description: Img ItemProvider
 * @date 2018/3/30  11:39
 */

class ImgItemProvider : BaseItemProvider<NormalMultipleEntity, BaseViewHolder>() {

    override fun viewType(): Int {
        return DemoMultipleItemRvAdapter.TYPE_IMG
    }

    override fun layout(): Int {
        return R.layout.item_image_view
    }

    override fun convert(helper: BaseViewHolder, data: NormalMultipleEntity, position: Int) {
        if (position % 2 == 0) {
            helper.setImageResource(R.id.iv, R.mipmap.animation_img1)
        } else {
            helper.setImageResource(R.id.iv, R.mipmap.animation_img2)
        }
    }

    override fun onClick(helper: BaseViewHolder?, data: NormalMultipleEntity?, position: Int) {
        Toast.makeText(mContext, "click", Toast.LENGTH_SHORT).show()
    }

    override fun onLongClick(helper: BaseViewHolder?, data: NormalMultipleEntity?, position: Int): Boolean {
        Toast.makeText(mContext, "longClick", Toast.LENGTH_SHORT).show()
        return true
    }
}
