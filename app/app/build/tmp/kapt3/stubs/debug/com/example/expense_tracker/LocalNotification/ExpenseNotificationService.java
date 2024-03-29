package com.example.expense_tracker.LocalNotification;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \f2\u00020\u0001:\u0001\fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/example/expense_tracker/LocalNotification/ExpenseNotificationService;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "notificationManager", "Landroid/app/NotificationManager;", "showNotification", "", "amount", "", "title", "Companion", "app_debug"})
public final class ExpenseNotificationService {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull
    private final android.app.NotificationManager notificationManager = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String EXPENSE_CHANNEL_ID = "expense_channel";
    @org.jetbrains.annotations.NotNull
    public static final com.example.expense_tracker.LocalNotification.ExpenseNotificationService.Companion Companion = null;
    
    public ExpenseNotificationService(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    public final void showNotification(@org.jetbrains.annotations.NotNull
    java.lang.String amount, @org.jetbrains.annotations.NotNull
    java.lang.String title) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/expense_tracker/LocalNotification/ExpenseNotificationService$Companion;", "", "()V", "EXPENSE_CHANNEL_ID", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}