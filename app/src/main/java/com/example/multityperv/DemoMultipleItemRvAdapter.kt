package com.example.multityperv

import com.chad.library.adapter.base.BaseViewHolder
import com.chad.library.adapter.base.MultipleItemRvAdapter
import com.example.multityperv.provider.ImgItemProvider
import com.example.multityperv.provider.RvHorizontalProvider
import com.example.multityperv.provider.TextImgItemProvider
import com.example.multityperv.provider.TextItemProvider

/**
 * @author ChayChan
 * modify by AllenCoder 2018/04/11
 * @description: MultipleItemRvAdapter demo
 * @date 2018/3/30  11:28
 */

class DemoMultipleItemRvAdapter(data: List<NormalMultipleEntity>?) :
    MultipleItemRvAdapter<NormalMultipleEntity, BaseViewHolder>(data) {

    init {

        //构造函数若有传其他参数可以在调用finishInitialize()之前进行赋值，赋值给全局变量
        //这样getViewType()和registerItemProvider()方法中可以获取到传过来的值
        //getViewType()中可能因为某些业务逻辑，需要将某个值传递过来进行判断，返回对应的viewType
        //registerItemProvider()中可以将值传递给ItemProvider

        //If the constructor has other parameters, it needs to be assigned before calling finishInitialize() and assigned to the global variable
        // This getViewType () and registerItemProvider () method can get the value passed over
        // getViewType () may be due to some business logic, you need to pass a value to judge, return the corresponding viewType
        //RegisterItemProvider() can pass value to ItemProvider

        finishInitialize()
    }

    override fun getViewType(entity: NormalMultipleEntity): Int {
        //根据实体类判断并返回对应的viewType，具体判断逻辑因业务不同，这里这是简单通过判断type属性
        //According to the entity class to determine and return the corresponding viewType,
        //the specific judgment logic is different because of the business, here is simply by judging the type attribute
        return when {
            entity.type == NormalMultipleEntity.SINGLE_TEXT -> TYPE_TEXT
            entity.type == NormalMultipleEntity.SINGLE_IMG -> TYPE_IMG
            entity.type == NormalMultipleEntity.TEXT_IMG -> TYPE_TEXT_IMG
            entity.type == NormalMultipleEntity.RV_HORIZONTAL -> TYPE_RV_HORIZONTAL
            else -> 0
        }
    }

    override fun registerItemProvider() {
        //注册相关的条目provider
        //Register related entries provider
        mProviderDelegate.registerProvider(TextItemProvider())
        mProviderDelegate.registerProvider(ImgItemProvider())
        mProviderDelegate.registerProvider(TextImgItemProvider())
        mProviderDelegate.registerProvider(RvHorizontalProvider())
    }

    companion object {

        const val TYPE_TEXT = 100
        const val TYPE_IMG = 200
        const val TYPE_TEXT_IMG = 300
        const val TYPE_RV_HORIZONTAL = 400

    }
}
