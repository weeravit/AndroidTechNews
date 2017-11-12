package xyz.devnote.androidtechnews.modules

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import xyz.devnote.androidtechnews.modules.landing.LandingActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        LandingActivity.start(this)
    }
}
