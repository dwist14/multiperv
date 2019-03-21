package com.example.multityperv

import com.chad.library.adapter.base.entity.MultiItemEntity
import com.chad.library.adapter.base.entity.SectionMultiEntity

/**
 * https://github.com/CymChad/BaseRecyclerViewAdapterHelper
 */
class SectionMultipleItem : SectionMultiEntity<Video>, MultiItemEntity {
    private var itemType: Int = 0
    private var isMore: Boolean = false
    private var video: Video? = null

    constructor(isHeader: Boolean, header: String, isMore: Boolean) : super(isHeader, header) {
        this.isMore = isMore
    }

    constructor(itemType: Int, video: Video) : super(video) {
        this.video = video
        this.itemType = itemType
    }

    override fun getItemType(): Int {
        return itemType
    }

    companion object {
        const val TEXT = 1
        const val IMG = 2
        const val IMG_TEXT = 3
    }
}
