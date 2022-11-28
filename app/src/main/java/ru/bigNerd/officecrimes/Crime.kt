package ru.bigNerd.officecrimes


import android.text.format.DateFormat
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*
@Entity
data class Crime(
    @PrimaryKey
    val id: UUID = UUID.randomUUID(),
    var title:String = "",
    var date: DateFormat = DateFormat(),
    var isSolved:Boolean = false,
    var requiresPolice:Boolean = false

)


