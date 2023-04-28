package com.example.mvp.Presenter

import com.example.mvp.Model.Message
import com.example.mvp.Model.MessageMVP
import com.example.mvp.View.MainView

class MessagePresenterMVP(var view: MainView):MessagePresenter {
    override fun getMessageFromModel() {

        var modelMessage:Message=MessageMVP()
            // obtenemos el mensaje desde el modelo
          val message = modelMessage.getMessage()
        // avisarle a la vista que ya tiene la informacion
        view.showMessage(message)
    }
}