package com.example.expense_tracker.Fragments;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0003J&\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0017R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\f\"\u0004\b\u001b\u0010\u000e\u00a8\u0006&"}, d2 = {"Lcom/example/expense_tracker/Fragments/AddExpenseFragment;", "Landroidx/fragment/app/Fragment;", "()V", "addButton", "Landroid/widget/Button;", "getAddButton", "()Landroid/widget/Button;", "setAddButton", "(Landroid/widget/Button;)V", "amountEditText", "Landroid/widget/EditText;", "getAmountEditText", "()Landroid/widget/EditText;", "setAmountEditText", "(Landroid/widget/EditText;)V", "binding", "Lcom/example/expense_tracker/databinding/FragmentAddExpenseBinding;", "expenseViewModel", "Lcom/example/expense_tracker/DataBase/ExpenseViewModel;", "getExpenseViewModel", "()Lcom/example/expense_tracker/DataBase/ExpenseViewModel;", "setExpenseViewModel", "(Lcom/example/expense_tracker/DataBase/ExpenseViewModel;)V", "service", "Lcom/example/expense_tracker/LocalNotification/ExpenseNotificationService;", "titleEditText", "getTitleEditText", "setTitleEditText", "insertExpense", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class AddExpenseFragment extends androidx.fragment.app.Fragment {
    private com.example.expense_tracker.databinding.FragmentAddExpenseBinding binding;
    public com.example.expense_tracker.DataBase.ExpenseViewModel expenseViewModel;
    public android.widget.EditText titleEditText;
    public android.widget.EditText amountEditText;
    public android.widget.Button addButton;
    private com.example.expense_tracker.LocalNotification.ExpenseNotificationService service;
    
    public AddExpenseFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.expense_tracker.DataBase.ExpenseViewModel getExpenseViewModel() {
        return null;
    }
    
    public final void setExpenseViewModel(@org.jetbrains.annotations.NotNull
    com.example.expense_tracker.DataBase.ExpenseViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.EditText getTitleEditText() {
        return null;
    }
    
    public final void setTitleEditText(@org.jetbrains.annotations.NotNull
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.EditText getAmountEditText() {
        return null;
    }
    
    public final void setAmountEditText(@org.jetbrains.annotations.NotNull
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.Button getAddButton() {
        return null;
    }
    
    public final void setAddButton(@org.jetbrains.annotations.NotNull
    android.widget.Button p0) {
    }
    
    @java.lang.Override
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    @org.jetbrains.annotations.Nullable
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    private final void insertExpense() {
    }
}