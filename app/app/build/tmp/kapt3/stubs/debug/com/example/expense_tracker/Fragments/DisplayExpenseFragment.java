package com.example.expense_tracker.Fragments;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\b\u0010(\u001a\u00020)H\u0002J\b\u0010*\u001a\u00020)H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f\u00a8\u0006+"}, d2 = {"Lcom/example/expense_tracker/Fragments/DisplayExpenseFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/example/expense_tracker/databinding/FragmentDisplayExpenseBinding;", "expense", "", "Lcom/example/expense_tracker/DataBase/Expense;", "expenseAdapter", "Lcom/example/expense_tracker/ExpenseAdapter;", "getExpenseAdapter", "()Lcom/example/expense_tracker/ExpenseAdapter;", "setExpenseAdapter", "(Lcom/example/expense_tracker/ExpenseAdapter;)V", "expenseRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getExpenseRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "setExpenseRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "expenseViewModel", "Lcom/example/expense_tracker/DataBase/ExpenseViewModel;", "getExpenseViewModel", "()Lcom/example/expense_tracker/DataBase/ExpenseViewModel;", "setExpenseViewModel", "(Lcom/example/expense_tracker/DataBase/ExpenseViewModel;)V", "radioGroup", "Landroid/widget/RadioGroup;", "getRadioGroup", "()Landroid/widget/RadioGroup;", "setRadioGroup", "(Landroid/widget/RadioGroup;)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "setUpExpenseViewModel", "", "sortExpense", "app_debug"})
public final class DisplayExpenseFragment extends androidx.fragment.app.Fragment {
    private com.example.expense_tracker.databinding.FragmentDisplayExpenseBinding binding;
    public com.example.expense_tracker.ExpenseAdapter expenseAdapter;
    public androidx.recyclerview.widget.RecyclerView expenseRecyclerView;
    public android.widget.RadioGroup radioGroup;
    public com.example.expense_tracker.DataBase.ExpenseViewModel expenseViewModel;
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.example.expense_tracker.DataBase.Expense> expense;
    
    public DisplayExpenseFragment() {
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
    public final android.widget.RadioGroup getRadioGroup() {
        return null;
    }
    
    public final void setRadioGroup(@org.jetbrains.annotations.NotNull
    android.widget.RadioGroup p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.expense_tracker.DataBase.ExpenseViewModel getExpenseViewModel() {
        return null;
    }
    
    public final void setExpenseViewModel(@org.jetbrains.annotations.NotNull
    com.example.expense_tracker.DataBase.ExpenseViewModel p0) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void setUpExpenseViewModel() {
    }
    
    private final void sortExpense() {
    }
}