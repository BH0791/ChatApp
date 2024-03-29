package fr.hamtec.chatapp.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import fr.hamtec.chatapp.R

val fira_code = FontFamily(
    Font(
        resId = R.font.fira_code_medium,
        weight = FontWeight.Medium
    )
)
val lato = FontFamily(
    Font(
        resId = R.font.lato_thin,
        weight = FontWeight.Thin
    ),
    Font(
        resId = R.font.lato_bold,
        FontWeight.Bold
    ),
    Font(
        resId = R.font.lato_black,
        FontWeight.Black
    )
)
val h1= TextStyle(
    fontFamily = lato,
    fontWeight = FontWeight.Light,
    fontSize = 40.sp
)

val ChatAppTypography = Typography(
    bodyLarge = TextStyle(
        fontFamily = lato,
        fontWeight = FontWeight.Black,
        fontSize = 14.sp
    )
    )

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = lato,
        fontWeight = FontWeight.Black,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )

    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */

)

val ChatAppShapes = Shapes(
    small = RoundedCornerShape(30.dp),
    medium = RoundedCornerShape(8.dp),
    large = RoundedCornerShape(4.dp)
)