package co.linminphyo.motionlayoutplayground

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.constraintlayout.motion.widget.MotionScene.Transition
import kotlinx.android.synthetic.main.layout_stack_view.*

/**
 * Created by lin min phyo on 4/15/19.
 */
class DynamicCardStackActivity : AppCompatActivity() {


    val dataProvider = DataProvider()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_stack_view)


        motionLayout.setTransitionListener(object : MotionLayout.TransitionListener {
            override fun allowsTransition(p0: Transition?): Boolean {
                return true
            }

            var previousState = R.id.state_initial

            override fun onTransitionTrigger(p0: MotionLayout?, p1: Int, p2: Boolean, p3: Float) {

            }

            override fun onTransitionStarted(p0: MotionLayout?, p1: Int, p2: Int) {
            }

            override fun onTransitionChange(p0: MotionLayout?, p1: Int, p2: Int, p3: Float) {
            }

            override fun onTransitionCompleted(p0: MotionLayout?, currentState: Int) {
                when (currentState) {
                    R.id.state_initial -> Log.i("Stack view state", "Initial State")
                    R.id.state_view_one_move_out -> Log.i("Stack view state", "One moved out")
                    R.id.state_view_two_move_out -> Log.i("Stack view state", "Two moved out")
                    R.id.state_view_three_move_out -> Log.i("Stack view state", "Three moved out")
                    else -> Log.i("Stack view state", "Nothing")
                }

                val data = getData(currentState, previousState)

                when (currentState) {
                    R.id.state_initial -> {
                        tv_three.text = data.first
                        view_three.setCardBackgroundColor(data.second)
                    }
                    R.id.state_view_one_move_out -> {
                        tv_four.text = data.first
                        view_four.setCardBackgroundColor(data.second)
                    }
                    R.id.state_view_two_move_out -> {
                        tv_one.text = data.first
                        view_one.setCardBackgroundColor(data.second)

                    }
                    R.id.state_view_three_move_out -> {
                        tv_two.text = data.first
                        view_two.setCardBackgroundColor(data.second)

                    }
                    else -> Log.i("Stack view state", "Nothing")
                }

                previousState = currentState
            }
        })

    }

    /**
     * Constraint layout state id
     */
    private fun getDataItemIndex(currentState: Int, previousState: Int): Int {
        val states = listOf(
            R.id.state_initial,
            R.id.state_view_one_move_out,
            R.id.state_view_two_move_out,
            R.id.state_view_three_move_out
        )

        val currentStateIndex = states.indexOf(currentState)
        val previousStateIndex = states.indexOf(previousState)


        return dataProvider.getIndex(currentStateIndex, previousStateIndex)
    }

    private fun getData(currentState: Int, previousState: Int): Pair<String, Int> {
        return dataProvider.getData(getDataItemIndex(currentState, previousState))
    }

}