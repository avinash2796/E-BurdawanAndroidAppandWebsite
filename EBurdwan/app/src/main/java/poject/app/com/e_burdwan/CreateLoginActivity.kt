package poject.app.com.e_burdwan

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CreateLoginActivity : AppCompatActivity() {
    var createAccountButton: Button?=null
    var loginAccoubtButton: Button?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_login)
        createAccountButton=findViewById(R.id.create_Button)
        createAccountButton?.setOnClickListener({
            var clickIntent= Intent(this@CreateLoginActivity,CreateAccountActivity::class.java)
            startActivity(clickIntent)
        })
        loginAccoubtButton=findViewById(R.id.login_Button)
        loginAccoubtButton?.setOnClickListener({
            var clickIntent= Intent(this@CreateLoginActivity,AddReviewActivity::class.java)
            startActivity(clickIntent)
        })
    }
}
