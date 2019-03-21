package com.example.multityperv

/**
 * https://github.com/chaychan
 *
 * @author ChayChan
 * @description: NormalEntity,need not implements MultiItemEntity interface
 * @date 2018/3/30  11:13
 */

class NormalMultipleEntity {

    var type: Int = 0
    var content: String = ""

    constructor(type: Int) {
        this.type = type
    }

    constructor(type: Int, content: String) {
        this.type = type
        this.content = content
    }

    companion object {

        const val SINGLE_TEXT = 1
        const val SINGLE_IMG = 2
        const val TEXT_IMG = 3
        const val RV_HORIZONTAL = 4
    }
}
