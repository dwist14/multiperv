package com.example.multityperv.provider

import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.Toast
import com.chad.library.adapter.base.BaseViewHolder
import com.chad.library.adapter.base.provider.BaseItemProvider
import com.example.multityperv.DemoMultipleItemRvAdapter
import com.example.multityperv.NormalMultipleEntity
import com.example.multityperv.R
import com.example.multityperv.RvHorizontalAdapter

/**
 * https://github.com/chaychan
 *
 * @author ChayChan
 * @description: Img ItemProvider
 * @date 2018/3/30  11:39
 */

class RvHorizontalProvider : BaseItemProvider<NormalMultipleEntity, BaseViewHolder>() {
    private lateinit var mAdapter: RvHorizontalAdapter
    private var list: MutableList<String> = arrayListOf()

    override fun viewType(): Int {
        return DemoMultipleItemRvAdapter.TYPE_RV_HORIZONTAL
    }

    override fun layout(): Int {
        return R.layout.rv_home
    }

    override fun convert(helper: BaseViewHolder, data: NormalMultipleEntity, position: Int) {
        val rvList: RecyclerView = helper.getView(R.id.mRecyclerView)
        rvList.layoutManager = LinearLayoutManager(mContext, LinearLayoutManager.HORIZONTAL, false)

       for (i in 0..4){
           list.add("1")
       }

        mAdapter = RvHorizontalAdapter(R.layout.item_rv_horizontal, list)
        rvList.adapter = mAdapter

    }

    override fun onClick(helper: BaseViewHolder?, data: NormalMultipleEntity?, position: Int) {
        Toast.makeText(mContext, "click", Toast.LENGTH_SHORT).show()
    }

    override fun onLongClick(helper: BaseViewHolder?, data: NormalMultipleEntity?, position: Int): Boolean {
        Toast.makeText(mContext, "longClick", Toast.LENGTH_SHORT).show()
        return true
    }
}
