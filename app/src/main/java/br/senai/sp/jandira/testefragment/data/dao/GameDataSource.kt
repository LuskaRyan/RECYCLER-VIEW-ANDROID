package br.senai.sp.jandira.testefragment.data.dao

import android.content.Context
import br.senai.sp.jandira.testefragment.R
import br.senai.sp.jandira.testefragment.fragments.model.Console
import br.senai.sp.jandira.testefragment.fragments.model.Game

class GameDataSource {

    companion object{
        fun getGames (context: Context) : ArrayList<Game>{
            var games = ArrayList<Game>()



            games.add(Game(1,

                "Mortal Kombat 3",

                context.getDrawable(R.drawable.mortal)!!,

                "Ai mortal e a melhor franquia de jogos de luta",

                4.5, listOf(Console(1,"Play1","SONY", "1995"),

            Console(2, ""))

        }
    }

}