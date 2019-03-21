package com.example.multityperv

/**
 * https://github.com/CymChad/BaseRecyclerViewAdapterHelper
 */
class Status {
    var isRetweet: Boolean = false
    var text: String? = null
    var userName: String? = null
    var userAvatar: String? = null
    var createdAt: String? = null

    override fun toString(): String {
        return "Status{" +
                "isRetweet=" + isRetweet +
                ", text='" + text + '\''.toString() +
                ", userName='" + userName + '\''.toString() +
                ", userAvatar='" + userAvatar + '\''.toString() +
                ", createdAt='" + createdAt + '\''.toString() +
                '}'.toString()
    }
}
