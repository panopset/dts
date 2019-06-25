package com.panopset.droid.textslider

import android.text.InputFilter
import android.text.Spanned

/**
 * https://stackoverflow.com/questions/14212518
 * "Very simple example on Kotlin:"
 */
class InputFilterRange(private var range: IntRange) : InputFilter {

    override fun filter(source: CharSequence, start: Int, end: Int, dest: Spanned, dstart: Int, dend: Int) = try {
        val input = Integer.parseInt(dest.toString() + source.toString())
        if (range.contains(input)) null else ""
    } catch (nfe: NumberFormatException) {
        ""
    }
}
