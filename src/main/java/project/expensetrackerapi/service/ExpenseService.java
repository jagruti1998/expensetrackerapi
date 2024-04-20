package project.expensetrackerapi.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import project.expensetrackerapi.entity.Expense;

public interface ExpenseService {

    Page<Expense> getAllExpenses(Pageable page);

    Expense getExpenseById(Long id);
    void deleteExpenseById(Long id);

    Expense saveExpenseDetails(Expense expense);

    Expense updateExpenseDetails(Long id, Expense expense);
}
