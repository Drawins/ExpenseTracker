package com.example.expense_tracker.DataBase;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\'J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\'J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\'J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\'J\u0019\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/example/expense_tracker/DataBase/ExpenseDao;", "", "delete", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getExpense", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/expense_tracker/DataBase/Expense;", "getExpenseBYAmount", "getExpenseByDate", "getExpenseByTime", "insert", "expense", "(Lcom/example/expense_tracker/DataBase/Expense;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@androidx.room.Dao
public abstract interface ExpenseDao {
    
    @androidx.room.Insert
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull
    com.example.expense_tracker.DataBase.Expense expense, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "DELETE FROM Expense")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object delete(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM Expense")
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.expense_tracker.DataBase.Expense>> getExpense();
    
    @androidx.room.Query(value = "SELECT * FROM Expense ORDER BY date DESC")
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.expense_tracker.DataBase.Expense>> getExpenseByDate();
    
    @androidx.room.Query(value = "SELECT * FROM Expense ORDER BY title ASC")
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.expense_tracker.DataBase.Expense>> getExpenseByTime();
    
    @androidx.room.Query(value = "SELECT * FROM Expense ORDER BY amount DESC")
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.expense_tracker.DataBase.Expense>> getExpenseBYAmount();
}