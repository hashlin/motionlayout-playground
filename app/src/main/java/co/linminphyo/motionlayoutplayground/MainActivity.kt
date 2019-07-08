package co.linminphyo.motionlayoutplayground

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import co.linminphyo.motionlayoutplayground.recyclerview.RecyclerViewActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnStackView.setOnClickListener {
            startActivity(Intent(this, CardStackActivity::class.java))
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

        btnFlow.setOnClickListener {
            startActivity(Intent(this, FlowActivity::class.java))
        }

        btnRecyclerView.setOnClickListener {
            startActivity(Intent(this, RecyclerViewActivity::class.java))
        }
    }

}
