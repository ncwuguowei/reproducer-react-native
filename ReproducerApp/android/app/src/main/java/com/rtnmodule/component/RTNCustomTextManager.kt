package com.rtnmodule.component

import android.graphics.Color
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.ViewManagerDelegate
import com.facebook.react.uimanager.annotations.ReactProp
import com.facebook.react.viewmanagers.RTNCustomTextManagerDelegate
import com.facebook.react.viewmanagers.RTNCustomTextManagerInterface

@ReactModule(name = RTNCustomTextManager.NAME)
class RTNCustomTextManager(context: ReactApplicationContext?) :
    SimpleViewManager<RTNCustomText>(), RTNCustomTextManagerInterface<RTNCustomText?> {

    private val mDelegate: ViewManagerDelegate<RTNCustomText>

    init {
        mDelegate = RTNCustomTextManagerDelegate(this)
    }

    override fun getDelegate(): ViewManagerDelegate<RTNCustomText>? {
        return mDelegate
    }

    override fun getName(): String {
        return NAME
    }

    override fun createViewInstance(context: ThemedReactContext): RTNCustomText {
        return RTNCustomText(context)
    }

    @ReactProp(name = "text")
    override fun setText(view: RTNCustomText?, text: String?) {
        view?.text = text
    }

    @ReactProp(name = "color")
    override fun setTextColor(view: RTNCustomText?, value: String?) {
        value?.let {
            view?.setTextColor(Color.parseColor(it))
        }
    }

    companion object {
        const val NAME = "RTNCustomText"
    }
}