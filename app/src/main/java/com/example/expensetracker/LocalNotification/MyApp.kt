package com.example.expensetracker.LocalNotification

import android.app.Application
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.os.Build

class MyApp:Application() {
    override fun onCreate() {
        super.onCreate()
        createNotificationChannel()
    }

    private fun createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            val channel = NotificationChannel(
                ExpenseNotificationService.EXPENSE_CHANNEL_ID,
                "Expense",
                NotificationManager.IMPORTANCE_DEFAULT
            )
            channel.description = "Used to alert on addition of an income or expense"
            val notificationManager = getSystemService(Context.NOTIFICATION_SERVICE)as NotificationManager
            notificationManager.createNotificationChannel(channel)
        }
    }
}