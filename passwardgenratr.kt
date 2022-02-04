package com.example.myapplication2

class passwardgenrator {

    private val charecters= "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*()~"

    fun genratepassward(length: Int, sword: String= ""): String {
        val sb = StringBuilder(length)

        for(x in 0 until length) {
            val random: Int = (charecters.indices.random())
            sb.append(charecters[random])
        }
        sb.insert((0 until length).random(), sword)
        return  sb.toString()
    }
}
