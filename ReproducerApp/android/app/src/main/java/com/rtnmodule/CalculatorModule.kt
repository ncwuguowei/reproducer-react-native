package com.rtnmodule

import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import com.rtn.specs.NativeCalculatorSpec

class CalculatorModule internal constructor(context: ReactApplicationContext?) :
    NativeCalculatorSpec(context) {

    override fun getName(): String {
        return NAME
    }

    override fun add(a: Double, b: Double, promise: Promise) {
        promise.resolve(a + b)
    }

    companion object {
        @JvmField
        var NAME = "RTNCalculator"
    }
}