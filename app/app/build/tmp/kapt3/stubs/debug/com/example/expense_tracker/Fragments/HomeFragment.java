package com.example.expense_tracker.Fragments;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\b\u00100\u001a\u000201H\u0002J\b\u00102\u001a\u000201H\u0003R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u001eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\'X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00063"}, d2 = {"Lcom/example/expense_tracker/Fragments/HomeFragment;", "Landroidx/fragment/app/Fragment;", "()V", "addFloatingActionButton", "Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", "getAddFloatingActionButton", "()Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", "setAddFloatingActionButton", "(Lcom/google/android/material/floatingactionbutton/FloatingActionButton;)V", "binding", "Lcom/example/expense_tracker/databinding/FragmentHomeBinding;", "expenseAdapter", "Lcom/example/expense_tracker/ExpenseAdapter;", "getExpenseAdapter", "()Lcom/example/expense_tracker/ExpenseAdapter;", "setExpenseAdapter", "(Lcom/example/expense_tracker/ExpenseAdapter;)V", "expenseRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getExpenseRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "setExpenseRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "expenseTextView", "Landroid/widget/TextView;", "getExpenseTextView", "()Landroid/widget/TextView;", "setExpenseTextView", "(Landroid/widget/TextView;)V", "expenseViewModel", "Lcom/example/expense_tracker/DataBase/ExpenseViewModel;", "getExpenseViewModel", "()Lcom/example/expense_tracker/DataBase/ExpenseViewModel;", "setExpenseViewModel", "(Lcom/example/expense_tracker/DataBase/ExpenseViewModel;)V", "expenses", "", "Lcom/example/expense_tracker/DataBase/Expense;", "sumExpense", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "setUpExpenseRecyclerView", "", "setUpExpenseViewModel", "app_debug"})
public final class HomeFragment extends androidx.fragment.app.Fragment {
    private com.example.expense_tracker.databinding.FragmentHomeBinding binding;
    public com.example.expense_tracker.ExpenseAdapter expenseAdapter;
    public androidx.recyclerview.widget.RecyclerView expenseRecyclerView;
    public com.example.expense_tracker.DataBase.ExpenseViewModel expenseViewModel;
    public com.google.android.material.floatingactionbutton.FloatingActionButton addFloatingActionButton;
    public android.widget.TextView expenseTextView;
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.example.expense_tracker.DataBase.Expense> expenses;
    private double sumExpense = 0.0;
    
    public HomeFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.expense_tracker.ExpenseAdapter getExpenseAdapter() {
        return null;
    }
    
    public final void setExpenseAdapter(@org.jetbrains.annotations.NotNull
    com.example.expense_tracker.ExpenseAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.recyclerview.widget.RecyclerView getExpenseRecyclerView() {
        return null;
    }
    
    public final void setExpenseRecyclerView(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.expense_tracker.DataBase.ExpenseViewModel getExpenseViewModel() {
        return null;
    }
    
    public final void setExpenseViewModel(@org.jetbrains.annotations.NotNull
    com.example.expense_tracker.DataBase.ExpenseViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.google.android.material.floatingactionbutton.FloatingActionButton getAddFloatingActionButton() {
        return null;
    }
    
    public final void setAddFloatingActionButton(@org.jetbrains.annotations.NotNull
    com.google.android.material.floatingactionbutton.FloatingActionButton p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.TextView getExpenseTextView() {
        return null;
    }
    
    public final void setExpenseTextView(@org.jetbrains.annotations.NotNull
    android.widget.TextView p0) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void setUpExpenseViewModel() {
    }
    
    private final void setUpExpenseRecyclerView() {
    }
}