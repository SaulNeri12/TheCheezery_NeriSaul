package neri.saul.thecheezery_nerisaul

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val getStartedBtn: Button = findViewById(R.id.get_started_btn)

        getStartedBtn.setOnClickListener {
            val intent = Intent(this, UserRegistryActivity::class.java)
            startActivity(intent)
        }
    }

}