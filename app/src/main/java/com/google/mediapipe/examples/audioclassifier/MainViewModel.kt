

package com.google.mediapipe.examples.audioclassifier

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private var _threshold: Float = AudioClassifierHelper.DISPLAY_THRESHOLD
    private var _maxResults: Int = AudioClassifierHelper.DEFAULT_NUM_OF_RESULTS
    private var _overlapPosition: Int = 2

    val currentThreshold: Float get() = _threshold
    val currentMaxResults: Int get() = _maxResults
    val currentOverlapPosition: Int get() = _overlapPosition

    fun setThreshold(threshold: Float) {
        _threshold = threshold
    }

    fun setMaxResults(maxResults: Int) {
        _maxResults = maxResults
    }

    fun setOverlap(position: Int) {
        _overlapPosition = position
    }
}
