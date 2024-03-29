package com.example.expense_tracker.DataBase;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0011\u001a\u00020\u0012H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u0019\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Lcom/example/expense_tracker/DataBase/ExpenseRepository;", "", "expenseDao", "Lcom/example/expense_tracker/DataBase/ExpenseDao;", "(Lcom/example/expense_tracker/DataBase/ExpenseDao;)V", "readAllExpense", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/expense_tracker/DataBase/Expense;", "getReadAllExpense", "()Landroidx/lifecycle/LiveData;", "readAllExpenseByAmount", "getReadAllExpenseByAmount", "readAllExpenseByDate", "getReadAllExpenseByDate", "readAllExpenseByTime", "getReadAllExpenseByTime", "deleteExpense", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertExpense", "expense", "(Lcom/example/expense_tracker/DataBase/Expense;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class ExpenseRepository {
    @org.jetbrains.annotations.NotNull
    private final com.example.expense_tracker.DataBase.ExpenseDao expenseDao = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<com.example.expense_tracker.DataBase.Expense>> readAllExpense = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<com.example.expense_tracker.DataBase.Expense>> readAllExpenseByDate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<com.example.expense_tracker.DataBase.Expense>> readAllExpenseByTime = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<com.example.expense_tracker.DataBase.Expense>> readAllExpenseByAmount = null;
    
    public ExpenseRepository(@org.jetbrains.annotations.NotNull
    com.example.expense_tracker.DataBase.ExpenseDao expenseDao) {
        super();
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
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object insertExpense(@org.jetbrains.annotations.NotNull
    com.example.expense_tracker.DataBase.Expense expense, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object deleteExpense(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}