package eu.rtsketo.jellyrecycler

import android.content.Context
import android.util.AttributeSet
import androidx.recyclerview.widget.RecyclerView

/**
 * Developer: Aristoteles Pasalides
 * Date: 14, 11, 2021
 */

class JellyRecycler @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null
) : RecyclerView(context, attrs) {
    init { edgeEffectFactory = JellyEffect() }
}
