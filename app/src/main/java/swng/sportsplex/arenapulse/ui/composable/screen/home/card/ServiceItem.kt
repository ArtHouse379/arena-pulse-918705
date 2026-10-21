package swng.sportsplex.arenapulse.ui.composable.screen.home.card

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import swng.sportsplex.arenapulse.R
import swng.sportsplex.arenapulse.data.model.ServiceModel
import swng.sportsplex.arenapulse.ui.composable.screen.shared.ServiceImage
import swng.sportsplex.arenapulse.ui.theme.LocalDimens
import swng.sportsplex.arenapulse.ui.theme.cardBorderStroke
import swng.sportsplex.arenapulse.ui.theme.imageBorder

private const val DESCRIPTION_MAX_LINES = 3

@Composable
fun ServiceItem(
    service: ServiceModel,
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
) {
    val dimens = LocalDimens.current

    Card(
        modifier = modifier
            .fillMaxWidth()
            .clickable(onClick = onClick),
        shape = RoundedCornerShape(dimens.cardCornerRadius),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceContainerLow,
            contentColor = MaterialTheme.colorScheme.onSurface,
        ),
        border = cardBorderStroke(),
    ) {
        ServiceImage(
            imageUrl = service.imageUrl,
            modifier = Modifier
                .fillMaxWidth()
                .height(180.dp)
                .imageBorder(RectangleShape),
        )

        Column(modifier = Modifier.padding(dimens.cardPadding)) {
            Text(
                text = service.name,
                color = MaterialTheme.colorScheme.onSurface,
                style = MaterialTheme.typography.titleMedium,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis,
            )

            Text(
                text = stringResource(service.serviceCategory.titleRes),
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                style = MaterialTheme.typography.bodySmall,
            )

            Spacer(modifier = Modifier.height(dimens.itemSpacing))

            Text(
                text = service.description,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                style = MaterialTheme.typography.bodyMedium,
                maxLines = DESCRIPTION_MAX_LINES,
                overflow = TextOverflow.Ellipsis,
            )

            Spacer(modifier = Modifier.height(dimens.itemSpacing))

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Text(
                    text = stringResource(R.string.price_per_hour, service.pricePerHour),
                    modifier = Modifier.weight(1f),
                    color = MaterialTheme.colorScheme.primary,
                    style = MaterialTheme.typography.titleMedium,
                )

                Icon(
                    imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                    contentDescription = null,
                    tint = MaterialTheme.colorScheme.onSurfaceVariant,
                )
            }
        }
    }
}
