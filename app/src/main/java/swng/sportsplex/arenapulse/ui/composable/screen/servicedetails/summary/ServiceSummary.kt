package swng.sportsplex.arenapulse.ui.composable.screen.servicedetails.summary

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import swng.sportsplex.arenapulse.R
import swng.sportsplex.arenapulse.data.model.ServiceModel
import swng.sportsplex.arenapulse.ui.theme.LocalDimens

@Composable
fun ServiceSummary(
    service: ServiceModel,
    modifier: Modifier = Modifier,
) {
    val dimens = LocalDimens.current

    Column(modifier = modifier) {
        Text(
            text = service.name,
            color = MaterialTheme.colorScheme.onBackground,
            style = MaterialTheme.typography.headlineSmall,
        )

        Spacer(modifier = Modifier.height(dimens.tightSpacing))

        Text(
            text = stringResource(service.serviceCategory.titleRes),
            color = MaterialTheme.colorScheme.onSurfaceVariant,
            style = MaterialTheme.typography.bodySmall,
        )

        Spacer(modifier = Modifier.height(dimens.itemSpacing))

        Text(
            text = stringResource(R.string.price_per_hour, service.pricePerHour),
            color = MaterialTheme.colorScheme.primary,
            style = MaterialTheme.typography.titleLarge,
        )
    }
}
