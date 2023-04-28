package com.example.mvp.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.mvp.Model.MessageMVP
import com.example.mvp.Presenter.MessagePresenter
import com.example.mvp.Presenter.MessagePresenterMVP
import com.example.mvp.R

class MainActivity : AppCompatActivity(), MainView {

    private val presenter: MessagePresenter by lazy { MessagePresenterMVP(this) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter.getMessageFromModel()
    }

    var txtMessage = findViewById<TextView>(R.id.txtMessage)

    override fun showMessage(message: String) {
         txtMessage.text= message
    }
}