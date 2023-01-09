package com.juul.kable.logs

public object TWILogEngine : LogEngine {
    override fun verbose(throwable: Throwable?, tag: String, message: String) {
        TWILogger.twiLogger?.log(tag, message, throwable)
    }

    override fun debug(throwable: Throwable?, tag: String, message: String) {
        TWILogger.twiLogger?.log(tag, message, throwable)
    }

    override fun info(throwable: Throwable?, tag: String, message: String) {
        TWILogger.twiLogger?.log(tag, message, throwable)
    }

    override fun warn(throwable: Throwable?, tag: String, message: String) {
        TWILogger.twiLogger?.log(tag, message, throwable)
    }

    override fun error(throwable: Throwable?, tag: String, message: String) {
        TWILogger.twiLogger?.log(tag, message, throwable)
    }

    override fun assert(throwable: Throwable?, tag: String, message: String) {
        TWILogger.twiLogger?.log(tag, message, throwable)
    }
}
