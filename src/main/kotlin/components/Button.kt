package components

class Button(val name: String) {
    private var onClickListener: OnClickListener? = null

    fun setOnClickListener(onClick: OnClickListener?) {
        this.onClickListener = onClick
    }

    fun press() {
        onClickListener?.onClick()
    }

    interface OnClickListener {
        fun onClick()
    }
}