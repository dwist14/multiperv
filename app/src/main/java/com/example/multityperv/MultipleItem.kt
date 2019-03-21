package com.example.multityperv

import com.chad.library.adapter.base.entity.MultiItemEntity

/**
 * https://github.com/CymChad/BaseRecyclerViewAdapterHelper
 */
class MultipleItem : MultiItemEntity {
    private var itemType: Int = 0
    private var spanSize: Int = 0

    private var content: String? = null

    constructor(itemType: Int, spanSize: Int, content: String) {
        this.itemType = itemType
        this.spanSize = spanSize
        this.content = content
    }

    constructor(itemType: Int, spanSize: Int) {
        this.itemType = itemType
        this.spanSize = spanSize
    }

    override fun getItemType(): Int {
        return itemType
    }

    companion object {
        const val TEXT = 1
        const val IMG = 2
        const val IMG_TEXT = 3

        const val TEXT_SPAN_SIZE = 3
        const val IMG_SPAN_SIZE = 1
        const val IMG_TEXT_SPAN_SIZE = 4
        const val IMG_TEXT_SPAN_SIZE_MIN = 2
    }
}
