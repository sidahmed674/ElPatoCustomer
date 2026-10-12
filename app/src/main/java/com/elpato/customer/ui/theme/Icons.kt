package com.elpato.customer.ui.theme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.VectorKt
import androidx.compose.ui.unit.dp

object ElPatoIcons {
    val Home = Icons.Rounded.Home; val Search = Icons.Rounded.Search; val Person = Icons.Rounded.Person; val Settings = Icons.Rounded.Settings
    val Menu = Icons.Rounded.Menu; val Close = Icons.Rounded.Close; val ChevronLeft = Icons.Rounded.ChevronLeft; val ChevronRight = Icons.Rounded.ChevronRight
    val ChevronDown = Icons.Rounded.ExpandMore; val ChevronUp = Icons.Rounded.ExpandLess; val MoreVert = Icons.Rounded.MoreVert
    val LocationOn = Icons.Rounded.LocationOn; val MyLocation = Icons.Rounded.MyLocation; val MapPin = Icons.Rounded.LocationPin
    val Navigation = Icons.Rounded.Navigation; val Storefront = Icons.Rounded.Storefront; val LocalShipping = Icons.Rounded.LocalShipping
    val TwoWheeler = Icons.Rounded.TwoWheeler; val DirectionsCar = Icons.Rounded.DirectionsCar; val Map = Icons.Rounded.Map
    val GpsFixed = Icons.Rounded.GpsFixed; val GpsOff = Icons.Rounded.GpsOff; val NearMe = Icons.Rounded.NearMe
    val Pizza = Icons.Rounded.LocalPizza; val Burger = Icons.Rounded.LunchDining; val Chicken = Icons.Rounded.SetMeal
    val Sandwich = Icons.Rounded.Fastfood; val Dessert = Icons.Rounded.Cake; val Drink = Icons.Rounded.LocalDrink
    val Coffee = Icons.Rounded.LocalCafe; val RiceBowl = Icons.Rounded.RiceBowl; val Dining = Icons.Rounded.Restaurant
    val ShoppingCart = Icons.Rounded.ShoppingCart; val AddShoppingCart = Icons.Rounded.AddShoppingCart
    val CreditCard = Icons.Rounded.CreditCard; val Payments = Icons.Rounded.Payments; val AttachMoney = Icons.Rounded.AttachMoney
    val Receipt = Icons.Rounded.ReceiptLong; val Discount = Icons.Rounded.Discount; val LocalOffer = Icons.Rounded.LocalOffer
    val CheckCircle = Icons.Rounded.CheckCircle; val ErrorOutline = Icons.Rounded.ErrorOutline; val Warning = Icons.Rounded.WarningAmber
    val HourglassTop = Icons.Rounded.HourglassTop; val Schedule = Icons.Rounded.Schedule; val Timer = Icons.Rounded.Timer
    val Pending = Icons.Rounded.PendingActions; val Confirmed = Icons.Rounded.TaskAlt; val Preparing = Icons.Rounded.Kitchen
    val Ready = Icons.Rounded.CheckCircleOutline; val Assigned = Icons.Rounded.AssignmentInd; val Delivering = Icons.Rounded.LocalShipping
    val Delivered = Icons.Rounded.DoneAll; val Cancelled = Icons.Rounded.Cancel
    val Star = Icons.Rounded.Star; val StarHalf = Icons.Rounded.StarHalf; val StarBorder = Icons.Rounded.StarBorder
    val Chat = Icons.Rounded.Chat; val Support = Icons.Rounded.SupportAgent; val Phone = Icons.Rounded.Phone
    val Notification = Icons.Rounded.Notifications; val NotificationOff = Icons.Rounded.NotificationsOff
    val Login = Icons.Rounded.Login; val Logout = Icons.Rounded.Logout; val Lock = Icons.Rounded.Lock; val LockOpen = Icons.Rounded.LockOpen
    val Visibility = Icons.Rounded.Visibility; val VisibilityOff = Icons.Rounded.VisibilityOff
    val Add = Icons.Rounded.Add; val Remove = Icons.Rounded.Remove; val Edit = Icons.Rounded.Edit; val Delete = Icons.Rounded.Delete
    val Save = Icons.Rounded.Save; val Cancel = Icons.Rounded.Cancel; val Check = Icons.Rounded.Check; val Clear = Icons.Rounded.Clear
    val FilterList = Icons.Rounded.FilterList; val Sort = Icons.Rounded.Sort; val Refresh = Icons.Rounded.Refresh
    val Share = Icons.Rounded.Share; val ContentCopy = Icons.Rounded.ContentCopy
}

object BrandIcons {
    val Logo = ImageVector.Builder("ElPatoLogo", 24.dp, 24.dp, 24f, 24f).apply {
        addPath(pathData = "M12 3c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2zm0 2c.55 0 1 .45 1 1s-.45 1-1 1-1-.45-1-1 .45-1 1-1z", fill = androidx.compose.ui.graphics.Color.Unspecified)
        addPath(pathData = "M14 5l3-2-3-2v4z", fill = androidx.compose.ui.graphics.Color.Unspecified)
        addPath(pathData = "M9 9c0-1.66 1.34-3 3-3s3 1.34 3 3-1.34 3-3 3-3-1.34-3-3z", fill = androidx.compose.ui.graphics.Color.Unspecified)
    }.build()
    val BranchMarker = ImageVector.Builder("BranchMarker", 24.dp, 24.dp, 24f, 24f).apply {
        addPath(pathData = "M12 2C8.13 2 5 5.13 5 9c0 5.25 7 13 7 13s7-7.75 7-13c0-3.87-3.13-7-7-7zm0 9.5c-1.38 0-2.5-1.12-2.5-2.5s1.12-2.5 2.5-2.5 2.5 1.12 2.5 2.5-1.12 2.5-2.5 2.5z", fill = androidx.compose.ui.graphics.Color.Unspecified)
    }.build()
}
