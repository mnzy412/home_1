package com.example.home_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.home_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var viewBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        //상단 액션바
//        setSupportActionBar(viewBinding.homeToolbar)
//        supportActionBar?.setDisplayShowTitleEnabled(false)
//        supportActionBar?.setDisplayShowHomeEnabled(true)

        viewBinding.bottomNavi.run {

            //아이템 선택 이벤트
            setOnItemSelectedListener {
                when (it.itemId) {
                    R.id.navi_home -> {
                        supportFragmentManager
                            .beginTransaction()
                            .replace(viewBinding.frameFragment.id, HomeFragment())
                            .commitAllowingStateLoss()
                    }
                    R.id.navi_market -> {
                        supportFragmentManager
                            .beginTransaction()
                            .replace(viewBinding.frameFragment.id, MarketFragment())
                            .commitAllowingStateLoss()
                    }

                    R.id.navi_chatting -> {
                        supportFragmentManager
                            .beginTransaction()
                            .replace(viewBinding.frameFragment.id, ChattingFragment())
                            .commitAllowingStateLoss()
                    }
                    R.id.navi_mypage -> {
                        supportFragmentManager
                            .beginTransaction()
                            .replace(viewBinding.frameFragment.id, MypageFragment())
                            .commitAllowingStateLoss()
                    }
                }
                true
            }

            //초기 설정
            selectedItemId = R.id.navi_home //처음 실행할 때 홈 메뉴 가르킬 수 있도록 함
        }


    }


}
