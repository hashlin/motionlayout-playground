package co.linminphyo.motionlayoutplayground

/**
 * Created by lin min phyo on 2019-05-01.
 */
class DataProvider {

    var swipedTimes = 0
    val dataList =
        listOf(
            "Apple" to 0xff009800.toInt(),
            "Ball" to 0xff505050.toInt(),
            "Car" to 0xff5050ff.toInt(),
            "Doll" to 0xff909090.toInt(),
            "Ear" to 0xffff9090.toInt(),
            "Flower" to 0xffa0a0a0.toInt(),
            "Goat" to 0xffa0ffa0.toInt(),
            "House" to 0xfff0f0f0.toInt(),
            "Iron" to 0xfff0f0ff.toInt()
        )


    public fun getIndex(currentStateIndex: Int, previousStateIndex: Int): Int {

        val isMoveForward = isMoveForward(currentStateIndex, previousStateIndex)
        val isMoveBackward =
            previousStateIndex - currentStateIndex == 1 || (previousStateIndex == 0 && currentStateIndex == 3)

        if (isMoveForward) swipedTimes++
        if (isMoveBackward) swipedTimes--

        val resultIndex = if (swipedTimes >= 0) {
            (swipedTimes + 1) % dataList.size
        } else {
            dataList.size + ((swipedTimes + 1) % dataList.size)
        }



        return resultIndex
    }


    fun isMoveForward(currentStateIndex: Int, previousStateIndex: Int): Boolean {
        return currentStateIndex == previousStateIndex + 1 || (previousStateIndex == 3 && currentStateIndex == 0)
    }


    fun isMoveBackward(currentStateIndex: Int, previousStateIndex: Int):Boolean {
        return previousStateIndex - currentStateIndex == 1 || (previousStateIndex == 0 && currentStateIndex == 3)
    }


    public fun getData(index: Int): Pair<String, Int> {
        return dataList[index]
    }
}