package me.rajatdhamija.toaster

import android.content.Context
import android.widget.Toast

public class MessageToaster{
    fun toast(context: Context?, message: String?) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}