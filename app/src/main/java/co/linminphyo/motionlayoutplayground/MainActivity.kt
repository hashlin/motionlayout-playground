package co.linminphyo.motionlayoutplayground

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnStackView.setOnClickListener {
            startActivity(Intent(this, CardStackActivity::class.java))
        }


        btnDynamicStackView.setOnClickListener {
            startActivity(Intent(this, DynamicCardStackActivity::class.java))
        }

        btnScaleImage.setOnClickListener {
            startActivity(Intent(this, ScaleImageActivity::class.java))
        }

        btnShapeMorph.setOnClickListener {
            startActivity(Intent(this, ShapeMorphActivity::class.java))
        }

        btnCreditCards.setOnClickListener {
            startActivity(Intent(this, CreditCardActivity::class.java))
        }

        btnLighting.setOnClickListener {
            startActivity(Intent(this, LightingActivity::class.java))
        }

        btnBubbleIn.setOnClickListener {
            startActivity(Intent(this, BubblesActivity::class.java))
        }

        btnDrawer.setOnClickListener {
            startActivity(Intent(this, NavigationDrawerActivity::class.java))
        }
    }

}
