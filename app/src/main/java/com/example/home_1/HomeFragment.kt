package com.example.home_1


import android.content.Intent
import android.os.Bundle
import android.view.*
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout

import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.home_1.databinding.ActivityDrawerBinding
import com.example.home_1.databinding.FragmentHomeBinding
import com.example.home_1.toolbar.*

@Suppress("UNREACHABLE_CODE")
class HomeFragment :Fragment() {
    private lateinit var viewBinding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?


    ): View? {
        viewBinding = FragmentHomeBinding.inflate(layoutInflater)

        setHasOptionsMenu(true)
        viewBinding.homeToolbar.inflateMenu(R.menu.home_toolbar)

        //메뉴
        viewBinding.homeToolbar.setNavigationIcon(R.drawable.toolbar_menu)

        viewBinding.homeToolbar.setNavigationOnClickListener {
            val intent = Intent(
                context,DrawerActivity::class.java)
            startActivity(intent)
        }

        viewBinding.homeToolbar.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.home_search -> {
                    val intent = Intent(
                        context,SearchActivity::class.java)
                    startActivity(intent)

                }
                R.id.home_noti -> {
                    val intent = Intent(
                        context,NotiActivity::class.java)
                    startActivity(intent)

                }
            }
            true
        }

        //인기글 RV
        val pplList: ArrayList<Ppls> = arrayListOf()
        pplList.apply {
            add(Ppls("안녕하세요 저는 별이 언니예요","김민지"))
            add(Ppls("안녕하세요 저는 별이 언니예요","김민지"))
            add(Ppls("안녕하세요 저는 별이 언니예요","김민지"))
            add(Ppls("안녕하세요 저는 별이 언니예요","김민지"))
            add(Ppls("안녕하세요 저는 별이 언니예요","김민지"))
        }

        viewBinding.homePplRV.layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
        viewBinding.homePplRV.adapter = PplRVAdapter(pplList)

        //전체글 RV

        val ttlList: ArrayList<Ttls> = arrayListOf()

        ttlList.apply {
            add(Ttls("안녕하세요 저는 별이 언니예요","김민지"))
            add(Ttls("안녕하세요 저는 별이 언니예요","김민지"))
            add(Ttls("안녕하세요 저는 별이 언니예요","김민지"))
            add(Ttls("안녕하세요 저는 별이 언니예요","김민지"))
            add(Ttls("안녕하세요 저는 별이 언니예요","김민지"))
            add(Ttls("안녕하세요 저는 별이 언니예요","김민지"))
            add(Ttls("안녕하세요 저는 별이 언니예요","김민지"))
            add(Ttls("안녕하세요 저는 별이 언니예요","김민지"))
        }

        viewBinding.homeTtlRV.layoutManager = LinearLayoutManager(context)
        viewBinding.homeTtlRV.adapter = TtlRVAdapter(ttlList)

        return viewBinding.root
    }

}