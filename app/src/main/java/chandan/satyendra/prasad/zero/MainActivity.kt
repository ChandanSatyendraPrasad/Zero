package chandan.satyendra.prasad.zero

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    var flag = 0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun change(view: View) {
        var imageView = findViewById<ImageView>(R.id.imageView);
        if (flag == 0) {
            imageView.setImageResource(R.drawable.metallica2)
            flag = 1
        } else if (flag != 0) {
            imageView.setImageResource(R.drawable.metallica1)
            flag = 0
        }
    }
}