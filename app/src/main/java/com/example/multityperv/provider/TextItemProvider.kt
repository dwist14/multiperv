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
 * @description: Text ItemProvider
 * @date 2018/3/30  11:39
 */

class TextItemProvider : BaseItemProvider<NormalMultipleEntity, BaseViewHolder>() {

    override fun viewType(): Int {
        return DemoMultipleItemRvAdapter.TYPE_TEXT
    }

    override fun layout(): Int {
        return R.layout.item_text_view
    }

    override fun convert(helper: BaseViewHolder, data: NormalMultipleEntity, position: Int) {
        helper.setText(R.id.tv, data.content)
    }

    override fun onClick(helper: BaseViewHolder?, data: NormalMultipleEntity?, position: Int) {
        Toast.makeText(mContext, "click", Toast.LENGTH_SHORT).show()
    }

    override fun onLongClick(helper: BaseViewHolder?, data: NormalMultipleEntity?, position: Int): Boolean {
        Toast.makeText(mContext, "longClick", Toast.LENGTH_SHORT).show()
        return true
    }
}
