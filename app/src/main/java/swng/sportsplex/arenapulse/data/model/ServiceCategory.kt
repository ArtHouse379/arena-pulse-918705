package swng.sportsplex.arenapulse.data.model

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CleaningServices
import androidx.compose.material.icons.filled.FitnessCenter
import androidx.compose.material.icons.filled.Grass
import androidx.compose.material.icons.filled.HealthAndSafety
import androidx.compose.material.icons.filled.SportsBasketball
import androidx.compose.ui.graphics.vector.ImageVector
import swng.sportsplex.arenapulse.R

enum class ServiceCategory(
    @field:StringRes val titleRes: Int,
    val icon: ImageVector,
) {
    GROUNDS_TURF(
        titleRes = R.string.service_category_grounds_turf_title,
        icon = Icons.Filled.Grass,
    ),
    COURTS_SURFACES(
        titleRes = R.string.service_category_courts_surfaces_title,
        icon = Icons.Filled.SportsBasketball,
    ),
    EQUIPMENT_REPAIR(
        titleRes = R.string.service_category_equipment_repair_title,
        icon = Icons.Filled.FitnessCenter,
    ),
    CLEANING_WATER(
        titleRes = R.string.service_category_cleaning_water_title,
        icon = Icons.Filled.CleaningServices,
    ),
    SAFETY_SYSTEMS(
        titleRes = R.string.service_category_safety_systems_title,
        icon = Icons.Filled.HealthAndSafety,
    ),
}
