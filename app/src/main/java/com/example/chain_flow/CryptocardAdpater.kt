package com.example.chain_flow

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.lifecycle.findViewTreeViewModelStoreOwner
import androidx.recyclerview.widget.RecyclerView

class CryptocardAdpater(
    var cryptonamesList: ArrayList<String>,
    var cryptovaluesList: ArrayList<String>,
    var Imagelist: ArrayList<Int>,
    var context: Context):RecyclerView.Adapter<CryptocardAdpater.CryptoViewHolder>(){
    class CryptoViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
        var textviewcryptonam:TextView=itemView.findViewById(R.id.crypto_name)
        var textviewcryptopricr:TextView=itemView.findViewById(R.id.crypto_price);
        var cryptoImage:ImageView=itemView.findViewById(R.id.crypto_icon);
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CryptoViewHolder {
        val view:View=LayoutInflater.from(parent.context).inflate(R.layout.cryptocard,parent,false);
        return  CryptoViewHolder(view);
    }

    override fun getItemCount(): Int {
return cryptonamesList.size;
    }

    override fun onBindViewHolder(holder: CryptoViewHolder, position: Int) {

    }

}