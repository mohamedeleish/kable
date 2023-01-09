package com.juul.kable.logs

import kotlin.native.concurrent.ThreadLocal

@ThreadLocal
public object TWILogger {
    internal var twiLogger: TWILoggerListener? = null

    public fun with(twiLogger: TWILoggerListener?) {
        this.twiLogger = twiLogger
    }
}

public fun interface TWILoggerListener {
    public fun log(tag: String, message: String, throwable: Throwable?)
}