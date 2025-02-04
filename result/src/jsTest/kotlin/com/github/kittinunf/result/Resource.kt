package com.github.kittinunf.result

external fun require(name: String): dynamic
external val __dirname: dynamic

private val fs = require("fs")

actual class Resource actual constructor(actual val name: String) {
    private val path = "$resource/$name"

    actual fun exists(): Boolean = fs.existsSync(path) as Boolean

    actual fun read(): String = fs.readFileSync(path, "utf8") as String
}
