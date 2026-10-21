package swng.sportsplex.arenapulse.data.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.BuildCircle
import androidx.compose.material.icons.filled.Verified
import androidx.compose.material.icons.filled.WorkspacePremium
import androidx.compose.ui.graphics.vector.ImageVector

data class Benefit(
    val icon: ImageVector,
    val text: String,
)

val defaultServiceBenefits: List<Benefit> = listOf(
    Benefit(
        icon = Icons.Filled.WorkspacePremium,
        text = "Venue-ready quality",
    ),
    Benefit(
        icon = Icons.Filled.Verified,
        text = "Workmanship warranty",
    ),
    Benefit(
        icon = Icons.Filled.BuildCircle,
        text = "Essential upkeep",
    ),
)
