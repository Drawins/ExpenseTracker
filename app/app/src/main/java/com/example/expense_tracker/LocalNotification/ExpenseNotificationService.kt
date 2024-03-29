package com.example.expense_tracker.LocalNotification

import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import androidx.core.app.NotificationCompat
import com.example.expense_tracker.MainActivity
import com.example.expense_tracker.R

class ExpenseNotificationService(private val context: Context) {
    private val notificationManager = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
    fun showNotification(amount: String, title:String){
        val activityIntent = Intent(context, MainActivity::class.java)
        val pendingActivityIntent = PendingIntent.getActivity(
            context,
            1,
            activityIntent,
            PendingIntent.FLAG_IMMUTABLE
        )
        val notification = NotificationCompat.Builder(context, EXPENSE_CHANNEL_ID)
            .setSmallIcon(R.drawable.check_24)
            .setContentTitle("New Expense Added")
            .setContentText("$title $$amount")
            .setContentIntent(pendingActivityIntent)
            .build()
        notificationManager.notify(
            1,
            notification
        )
    }
    companion object{
        const val EXPENSE_CHANNEL_ID = "expense_channel"
    }
}