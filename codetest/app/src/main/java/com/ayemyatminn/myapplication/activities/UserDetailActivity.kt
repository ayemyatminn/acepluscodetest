package com.ayemyatminn.myapplication.activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ayemyatminn.myapplication.R
import kotlinx.android.synthetic.main.activity_user_detail.*

class UserDetailActivity: AppCompatActivity() {

    companion object {
        fun newIntent(context: Context): Intent {
            return Intent(context, UserDetailActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_detail)

        listener()
    }

    private fun listener(){

        ivback.setOnClickListener {
            finish()
        }

    }

}