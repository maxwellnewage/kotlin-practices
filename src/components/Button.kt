package components

import interfaces.OnClickListener

class Button(val name: String) {
    var event: OnClickListener? = null

    fun setOnClickListener(event: OnClickListener) {
        this.event = event
    }

    fun press() {
        event?.onClick()
    }
}