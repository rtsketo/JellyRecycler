package eu.rtsketo.jellydemo

import android.graphics.Color.BLACK
import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams.MATCH_PARENT
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

/**
 * Developer: Aristoteles Pasalides
 * Company: Axiom Consulting LTD
 * Date: 14, 11, 2021
 */

class TextAdapter() : RecyclerView.Adapter<TextAdapter.ViewHolder>() {
    inner class ViewHolder(val item: TextView) : RecyclerView.ViewHolder(item)

    override fun getItemCount() = 1
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
        ViewHolder = ViewHolder(
        TextView(parent.context).apply {
            layoutParams = RecyclerView.LayoutParams(MATCH_PARENT, WRAP_CONTENT)
        }
    )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.item.text = holder.item.context.getString(R.string.large_text)
        holder.item.setTextColor(BLACK)
    }
}
