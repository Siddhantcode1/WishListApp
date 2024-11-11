package sidd.tutorials.mywishlistapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wish-table")
data class Wish(
    @PrimaryKey(autoGenerate = true)
    val id : Long = 0L,
    @ColumnInfo(name = "wish-title")
    val title : String ="",
    @ColumnInfo(name = "wish-desc")
    val description : String= "",

)

object DummyWish{
    val wishlist = listOf(
        Wish(title = "Fist", description = "bbdff"),
        Wish(title = "Blade", description = "bbbbbbsgdfb"),
        Wish(title = "Surtur", description = "bbbbbbsfdsfgbbbb"),
        Wish(title = "Gun", description = "bbbbawessdbbbbbb"),
        Wish(title = "Bun", description = "dkbadfljafb"),

    )
}
