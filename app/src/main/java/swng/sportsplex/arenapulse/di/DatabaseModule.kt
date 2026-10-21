package swng.sportsplex.arenapulse.di

import androidx.room.Room
import swng.sportsplex.arenapulse.data.database.Database
import org.koin.dsl.module

private const val DB_NAME = "bxat_db"

val databaseModule = module {
    single {
        Room.databaseBuilder(
            context = get(),
            klass = Database::class.java,
            name = DB_NAME
        ).build()
    }

    single { get<Database>().bookingDao() }
}