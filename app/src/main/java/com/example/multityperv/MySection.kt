package com.example.multityperv

import com.chad.library.adapter.base.entity.SectionEntity

/**
 * https://github.com/CymChad/BaseRecyclerViewAdapterHelper
 */
class MySection : SectionEntity<Video> {
    private var isMore: Boolean = false

    constructor(isHeader: Boolean, header: String, isMore: Boolean) : super(isHeader, header) {
        this.isMore = isMore
    }

    constructor(t: Video) : super(t) {}
}
