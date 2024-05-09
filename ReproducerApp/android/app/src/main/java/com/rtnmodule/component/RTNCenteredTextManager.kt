package com.rtnmodule.component

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.ViewManagerDelegate
import com.facebook.react.uimanager.annotations.ReactProp
import com.facebook.react.viewmanagers.RTNCenteredTextManagerDelegate
import com.facebook.react.viewmanagers.RTNCenteredTextManagerInterface
import com.rtnmodule.component.RTNCenteredTextManager

@ReactModule(name = RTNCenteredTextManager.NAME)
class RTNCenteredTextManager(context: ReactApplicationContext?) :
    SimpleViewManager<RTNCenteredText>(), RTNCenteredTextManagerInterface<RTNCenteredText?> {

    private val mDelegate: ViewManagerDelegate<RTNCenteredText>

    init {
        mDelegate = RTNCenteredTextManagerDelegate(this)
    }

    override fun getDelegate(): ViewManagerDelegate<RTNCenteredText>? {
        return mDelegate
    }

    override fun getName(): String {
        return NAME
    }

    override fun createViewInstance(context: ThemedReactContext): RTNCenteredText {
        return RTNCenteredText(context)
    }

    @ReactProp(name = "text")
    override fun setText(view: RTNCenteredText?, text: String?) {
        view?.text = text
    }

    companion object {
        const val NAME = "RTNCenteredText"
    }
}