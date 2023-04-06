package com.example.layoutwithretrofitmovies

import android.icu.text.IDNA
import com.example.layoutwithretrofitmovies.Result

data class Movies(
    val info: IDNA.Info,
    val results: List<Result>
)
