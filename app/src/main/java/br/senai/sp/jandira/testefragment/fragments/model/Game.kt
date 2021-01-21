package br.senai.sp.jandira.testefragment.fragments.model

import android.graphics.drawable.Drawable

data class Game (
    var id: Long,
    var gameName: String,
    var gameImage: Drawable,
    var gameDescription: String,
    var gameRatting: Double,
    var consoles: List<Console>
){
}