package com.example.expensetracker.LocalNotification

import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.core.app.NotificationCompat
import com.example.expensetracker.ExpenseFragment
import com.example.expensetracker.R

class ExpenseNotificationService(private val context: Context) {
    private val notificationManager = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
    fun showNotification(amount:String,title:String){
        val activityIntent = Intent(context,ExpenseFragment::class.java)
        val pendingActivityIntent = PendingIntent.getActivity(
            context,
            1,
            activityIntent,
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) PendingIntent.FLAG_IMMUTABLE else 0
        )
        val notification = NotificationCompat.Builder(context, EXPENSE_CHANNEL_ID)
            .setSmallIcon(R.drawable.baseline_add_24)
            .setContentTitle("New Expense Added")
            .setContentText("$title: $${amount}")
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