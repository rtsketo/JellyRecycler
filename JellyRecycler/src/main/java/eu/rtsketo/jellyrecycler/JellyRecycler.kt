package eu.rtsketo.jellyrecycler

import android.content.Context
import android.util.AttributeSet
import androidx.recyclerview.widget.RecyclerView

/**
 * Developer: Aristoteles Pasalides
 * Date: 14, 11, 2021
 */

class JellyRecycler(context: Context, attrs: AttributeSet?, defStyleAttr: Int) :
    RecyclerView(context, attrs, defStyleAttr) {
    init { edgeEffectFactory = JellyEffect() }
}
