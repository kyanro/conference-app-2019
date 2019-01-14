package io.github.droidkaigi.confsched2019.notification

import android.content.Context

enum class NotificationChannelInfo(
    val channelId: String,
    private val channelNameResId: Int
) {
    DEFAULT(
        "default_channel",
        R.string.app_name
    ),
    FAVORITE_SESSION_START(
        "favorite_session_start_channel",
        R.string.notification_channel_name_start_favorite_session
    ),
    SUBSCRIBE_TOPIC(
        "subscribe_topic",
        R.string.notification_channel_name_subscribe_topic // FIXME
    );

    fun channelName(context: Context): String = context.getString(channelNameResId)

    companion object {
        fun of(channelId: String): NotificationChannelInfo {
            return values().find {
                it.channelId == channelId
            } ?: DEFAULT
        }
    }
}
