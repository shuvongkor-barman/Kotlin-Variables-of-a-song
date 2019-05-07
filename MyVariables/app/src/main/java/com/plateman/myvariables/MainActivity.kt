    package com.plateman.myvariables

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import durationInMinute
import durationInSecond
import genre
import recordingMonth
import recordingStudio
import recordingYear
import releasedMonth
import releasedYear
import songAlbum
import songArtist
import songTitle

    class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // logging out the variables

        Log.d("Title", songTitle)
        Log.d("Artist", songArtist)
        Log.d("Album", songAlbum)
        Log.d("Released Year", releasedYear.toString())
        Log.d("Released Month", releasedMonth)
        Log.d("Recording Year", recordingYear.toString())
        Log.d("Recording Month", recordingMonth)
        Log.d("Studio", recordingStudio)
        Log.d("Genre", genre)

        // Concatenating duration minute and second to display total song duration
        val songLength: String = durationInMinute.toString() + ":" + durationInSecond.toString()

        Log.d("Duration", songLength)



    }
}
