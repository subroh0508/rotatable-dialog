package com.subroh0508.core

import android.app.Dialog
import android.content.Context
import android.support.v7.app.AlertDialog

/**
 * Created by subroh0508 on 16/10/30.
 */
class Sample(val context: Context) {
    companion object {
        fun build(context: Context): Sample {
            return Sample(context).create()
        }
    }

    lateinit var dialog: Dialog

    fun create(): Sample {
        dialog = AlertDialog.Builder(context)
                .setTitle("てすと")
                .setMessage("めっせーーーーーじ")
                .setPositiveButton("OK", { dialogInterface, i -> })
                .setNegativeButton("CANCEL", { dialogInterfave, i -> })
                .create()

        return this
    }

    fun show(): Dialog {
        dialog.show()

        return dialog
    }
}