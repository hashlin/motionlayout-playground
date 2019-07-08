package co.linminphyo.motionlayoutplayground.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import co.linminphyo.motionlayoutplayground.R
import co.linminphyo.motionlayoutplayground.recyclerview.RVAdapter.RVViewHolder

/**
 * Created by lin min phyo on 2019-05-29.
 */
class RVAdapter : Adapter<RVViewHolder>() {
  override fun onCreateViewHolder(
    parent: ViewGroup,
    viewType: Int
  ): RVViewHolder {
    val view = LayoutInflater.from(parent.context)
        .inflate(R.layout.activity_bubbles_in, parent, false)
    return RVViewHolder(view)
  }

  override fun getItemCount(): Int {
    return 8
  }

  override fun onBindViewHolder(
    holder: RVViewHolder,
    position: Int
  ) {

  }

  class RVViewHolder(itemView: View) : ViewHolder(itemView) {

  }
}