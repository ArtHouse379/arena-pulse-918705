package swng.sportsplex.arenapulse.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import swng.sportsplex.arenapulse.data.dao.BookingDao
import swng.sportsplex.arenapulse.data.database.converter.Converters
import swng.sportsplex.arenapulse.data.entity.BookingEntity

@Database(
    entities = [BookingEntity::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(Converters::class)
abstract class Database : RoomDatabase() {

    abstract fun bookingDao(): BookingDao
}

