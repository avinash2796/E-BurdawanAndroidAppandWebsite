package poject.app.com.e_burdwan

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginCreateActivity : AppCompatActivity() {
    var createAccountButton: Button?=null
    var loginAccoubtButton: Button?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_create)
        createAccountButton=findViewById(R.id.createButton)
        createAccountButton?.setOnClickListener({
            var clickIntent= Intent(this@LoginCreateActivity,CreateAccountActivity::class.java)
            startActivity(clickIntent)
        })
        loginAccoubtButton=findViewById(R.id.loginButton)
        loginAccoubtButton?.setOnClickListener({
            var clickIntent= Intent(this@LoginCreateActivity,AddPlaceActivity::class.java)
            startActivity(clickIntent)
        })
    }
}
