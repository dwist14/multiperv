package com.example.multityperv

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var mData: List<NormalMultipleEntity>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val manager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false)
        mRecyclerView.layoutManager = manager

        mData = DataServer.normalMultipleEntities
        val multipleItemAdapter = DemoMultipleItemRvAdapter(mData)

        multipleItemAdapter.setSpanSizeLookup { gridLayoutManager, position ->
            val type = mData?.get(position)?.type
            when (type) {
                NormalMultipleEntity.SINGLE_TEXT -> MultipleItem.TEXT_SPAN_SIZE
                NormalMultipleEntity.SINGLE_IMG -> MultipleItem.IMG_SPAN_SIZE
                else -> MultipleItem.IMG_TEXT_SPAN_SIZE
            }
        }

        mRecyclerView.adapter = multipleItemAdapter
    }
}
