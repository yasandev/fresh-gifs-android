package dev.yasan.fresh.gifs.presentation.compose.screen.home.tabs.modules

import android.content.res.Configuration.UI_MODE_NIGHT_NO
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.sharp.Error
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import dev.yasan.fresh.gifs.R
import dev.yasan.fresh.gifs.presentation.compose.theme.MyAppIcons
import dev.yasan.kit.compose.foundation.grid
import dev.yasan.kit.compose.preview.string.StringPreviewProvider3WordsMax
import dev.yasan.kit.compose.type.rubikFamily

/**
 * A simple layout to show when the content is empty.
 *
 * @param text the text to show.
 * @param icon the icon to show, default is [Error].
 */
@Preview(uiMode = UI_MODE_NIGHT_NO, group = "Day")
@Preview(uiMode = UI_MODE_NIGHT_YES, group = "Night")
@Composable
fun EmptyTabContent(
    @PreviewParameter(StringPreviewProvider3WordsMax::class) text: String,
    icon: ImageVector = MyAppIcons.Error
) {

    Column(
        modifier = Modifier
            .background(color = colorResource(id = R.color.layer_background))
            .padding(grid(2))
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = colorResource(id = R.color.text_desc)
        )

        Spacer(modifier = Modifier.requiredHeight(grid()))

        Text(
            text = text,
            color = colorResource(id = R.color.text_desc),
            fontFamily = rubikFamily,
            textAlign = TextAlign.Center
        )

    }

}