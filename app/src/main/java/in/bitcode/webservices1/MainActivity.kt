package `in`.bitcode.webservices1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import `in`.bitcode.webservices1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var activityMainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)

        activityMainBinding.btnFetch.setOnClickListener {
            WebThread().start()
        }


    }
}