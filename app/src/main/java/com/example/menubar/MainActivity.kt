package com.example.menubar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.appbar_menu, menu)
        return true
    }


    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {

        R.id.mContact -> {
            Toast.makeText(applicationContext, "You clicked on ${item.title}", Toast.LENGTH_SHORT).show()
            true
        }

        R.id.mFavorite -> {
            Toast.makeText(applicationContext, "You clicked on ${item.title}", Toast.LENGTH_SHORT).show()
            true
        }

        R.id.mSettings -> {
            Toast.makeText(applicationContext, "You clicked on ${item.title}", Toast.LENGTH_SHORT).show()
            true
        }

        R.id.mFeedback -> {
            Toast.makeText(applicationContext, "You clicked on ${item.title}", Toast.LENGTH_SHORT).show()
            true
        } else -> {
            // If we got here, the user's action was not recognized.
            // Invoke the superclass to handle it.
            super.onOptionsItemSelected(item)
            }
    }
}