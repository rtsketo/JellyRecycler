package eu.rtsketo.jellyrecycler

import android.view.animation.OvershootInterpolator
import android.widget.EdgeEffect
import androidx.recyclerview.widget.RecyclerView

/**
 * Developer: Aristoteles Pasalides
 * Date: 14, 11, 2021
 */

class JellyEffect : RecyclerView.EdgeEffectFactory() {
    @Volatile var isAnimating = false
    @Volatile var lastDirection = 0

    override fun createEdgeEffect(view: RecyclerView, direction: Int): EdgeEffect =
        object : EdgeEffect(view.context) {
            override fun onAbsorb(velocity: Int) = Unit
            override fun onPull(deltaDistance: Float, displacement: Float) {
                if (!isAnimating)
                    if (lastDirection == direction || lastDirection == 0)
                        view.apply {
                            pivotY =
                                if (direction == 1) 0f
                                else view.height.toFloat()
                            scaleY = (scaleY + deltaDistance / 10)
                                .coerceAtMost(1.1f)
                            lastDirection = direction
                        }
                    else onRelease()
            }

            override fun onRelease() {
                isAnimating = true
                view.animate().setDuration(382L)
                    .setInterpolator(OvershootInterpolator())
                    .withEndAction {
                        lastDirection = 0
                        isAnimating = false
                    }.scaleY(1f).start()
            }
        }
}
