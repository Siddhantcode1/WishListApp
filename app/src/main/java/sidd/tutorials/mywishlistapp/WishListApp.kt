package sidd.tutorials.mywishlistapp

import android.app.Application
import sidd.tutorials.mywishlistapp.data.Graph

class WishListApp:Application() {
    override fun onCreate() {
        super.onCreate()
    Graph.provide(this)
    }
}