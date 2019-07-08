package co.linminphyo.motionlayoutplayground.recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import co.linminphyo.motionlayoutplayground.R.layout
import kotlinx.android.synthetic.main.activity_recycler_view.rv

/**
 * Created by lin min phyo on 2019-05-12.
 */
class RecyclerViewActivity : AppCompatActivity(){

  private val rvAdapter = RVAdapter()

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(layout.activity_recycler_view)

    rv.apply {
      layoutManager = LinearLayoutManager(context , RecyclerView.VERTICAL , false)
      adapter = rvAdapter
      addItemDecoration(DividerItemDecoration(context , RecyclerView.VERTICAL))
    }
  }
}