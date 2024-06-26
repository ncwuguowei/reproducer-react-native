package com.rtnmodule.component

import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import android.view.Gravity
import android.widget.TextView

class RTNCenteredText : TextView {

    constructor(context: Context?) : super(context) {
        configureComponent()
    }

    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {
        configureComponent()
    }

    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        configureComponent()
    }

    private fun configureComponent() {
        setBackgroundColor(Color.RED)
        this.gravity = Gravity.CENTER_HORIZONTAL
    }
}