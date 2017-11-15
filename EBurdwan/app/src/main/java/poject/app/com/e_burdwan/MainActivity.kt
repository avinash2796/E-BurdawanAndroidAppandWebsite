package poject.app.com.e_burdwan

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    var addPlacesButton: Button?=null
    var addReviewsButton: Button?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addPlacesButton=findViewById(R.id.addPlaces)
        addPlacesButton?.setOnClickListener({
            var clickIntent=Intent(this@MainActivity,LoginCreateActivity::class.java)
            startActivity(clickIntent)
        })
        addReviewsButton=findViewById(R.id.addReviews)
        addReviewsButton?.setOnClickListener({
            var clickIntent=Intent(this@MainActivity,CreateLoginActivity::class.java)
            startActivity(clickIntent)
        })
    }
}
