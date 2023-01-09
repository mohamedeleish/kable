package com.juul.kable.logs

public object TWILogEngine : LogEngine {
    override fun verbose(throwable: Throwable?, tag: String, message: String) {
        log(tag, message, throwable)
    }

    override fun debug(throwable: Throwable?, tag: String, message: String) {
        log(tag, message, throwable)
    }

    override fun info(throwable: Throwable?, tag: String, message: String) {
        log(tag, message, throwable)
    }

    override fun warn(throwable: Throwable?, tag: String, message: String) {
        log(tag, message, throwable)
    }

    override fun error(throwable: Throwable?, tag: String, message: String) {
        log(tag, message, throwable)
    }

    override fun assert(throwable: Throwable?, tag: String, message: String) {
        log(tag, message, throwable)
    }

    private fun log(tag: String, message: String, throwable: Throwable?) {
        if (throwable == null) {
            TWILogger.twiLogger?.log(tag, message)
        } else {
            TWILogger.twiLogger?.log(tag, message, throwable)
        }
    }
}
