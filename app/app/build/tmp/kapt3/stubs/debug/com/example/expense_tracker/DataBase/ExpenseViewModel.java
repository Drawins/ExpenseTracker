package com.example.expense_tracker.DataBase;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nJ\u0006\u0010\u0016\u001a\u00020\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f\u00a8\u0006\u0017"}, d2 = {"Lcom/example/expense_tracker/DataBase/ExpenseViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "expenseRepository", "Lcom/example/expense_tracker/DataBase/ExpenseRepository;", "readAllExpense", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/expense_tracker/DataBase/Expense;", "getReadAllExpense", "()Landroidx/lifecycle/LiveData;", "readAllExpenseByAmount", "getReadAllExpenseByAmount", "readAllExpenseByDate", "getReadAllExpenseByDate", "readAllExpenseByTime", "getReadAllExpenseByTime", "addExpense", "", "expense", "deleteExpense", "app_debug"})
public final class ExpenseViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<com.example.expense_tracker.DataBase.Expense>> readAllExpense = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<com.example.expense_tracker.DataBase.Expense>> readAllExpenseByDate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<com.example.expense_tracker.DataBase.Expense>> readAllExpenseByTime = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<com.example.expense_tracker.DataBase.Expense>> readAllExpenseByAmount = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.expense_tracker.DataBase.ExpenseRepository expenseRepository = null;
    
    public ExpenseViewModel(@org.jetbrains.annotations.NotNull
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.example.expense_tracker.DataBase.Expense>> getReadAllExpense() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.example.expense_tracker.DataBase.Expense>> getReadAllExpenseByDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.example.expense_tracker.DataBase.Expense>> getReadAllExpenseByTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.example.expense_tracker.DataBase.Expense>> getReadAllExpenseByAmount() {
        return null;
    }
    
    public final void addExpense(@org.jetbrains.annotations.NotNull
    com.example.expense_tracker.DataBase.Expense expense) {
    }
    
    public final void deleteExpense() {
    }
}