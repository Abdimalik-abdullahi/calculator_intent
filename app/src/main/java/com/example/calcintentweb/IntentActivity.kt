package com.example.calcintentweb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_intent.*
import org.jetbrains.anko.*

class
IntentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)

        Btn_sms.setOnClickListener {
            sendSMS("0797140858","How was you day")
        }
        Btn_stk.setOnClickListener {
            val simToolkitintent=this@IntentActivity.getPackageManager().getLaunchIntentForPackage("com.android.stk");
            if(simToolkitintent !=null){
                startActivity(simToolkitintent)



        }
        }
        Btn_email.setOnClickListener {
            email("abdimalikabdullahi6@gmail.com","exams update","wish you all the best")

        }
        Btn_share.setOnClickListener {
            share("no one will do the exam without paying exams fees")
        }
        Btn_call.setOnClickListener {
            makeCall("0714468111")
        }
        Btn_browse.setOnClickListener {
            browse("www.facebook.com")
        }


    }
}