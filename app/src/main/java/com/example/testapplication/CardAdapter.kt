package com.example.testapplication


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.testapplication.model.Exhibit
import com.squareup.picasso.Picasso

class CardAdapter(val context: Context, private val theList:List<Exhibit>) :
    RecyclerView.Adapter<CardAdapter.ViewHolder>() {

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
    {

        var exhibit_title: TextView = itemView.findViewById(R.id.exhibit_title)
        var exhibit_image: ImageView = itemView.findViewById(R.id.exhibit_image)
        var exhibit_image2: ImageView = itemView.findViewById(R.id.exhibit_image2)
        var exhibit_image3: ImageView = itemView.findViewById(R.id.exhibit_image3)


        fun bind(exhibit: Exhibit){

            exhibit_title.text = exhibit.title

            Picasso.get()
                .load(exhibit.images[0])
                .into(exhibit_image)

            Picasso.get()
                .load(exhibit.images[1])
                .into(exhibit_image2)

            Picasso.get()
                .load(exhibit.images[2])
                .into(exhibit_image3)

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(context).inflate(R.layout.exhibit_card_display,
            parent, false)
        return ViewHolder(itemView)



    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.bind(theList[position])



    }

    override fun getItemCount(): Int {
        return theList.size
    }
}