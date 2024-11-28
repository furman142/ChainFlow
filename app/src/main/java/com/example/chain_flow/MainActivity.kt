package com.example.chain_flow

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : ComponentActivity() {
lateinit var rv:RecyclerView;
    var cryptonamesList=ArrayList<String>();
    var cryptovaluesList=ArrayList<String>();
    var Imagelist=ArrayList<Int>();

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.homepage);


        rv=findViewById(R.id.recyclerView);
        rv.layoutManager=LinearLayoutManager(this@MainActivity)
        cryptonamesList.add("Bitcoin");
        cryptonamesList.add("Ethereum")
        cryptonamesList.add("BNB")

        cryptovaluesList.add("95000")
        cryptovaluesList.add("3000")
        cryptovaluesList.add("45000")

        Imagelist.add(R.drawable.bitcoin)
        Imagelist.add(R.drawable.eth)
        Imagelist.add(R.drawable.bnb)






    }
    }


