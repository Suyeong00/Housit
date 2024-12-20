package housit.housit_backend.repository;

import housit.housit_backend.domain.finance.*;
import housit.housit_backend.domain.room.Room;

import java.lang.reflect.Type;
import java.util.List;

public interface FinanceRepository {
    void saveAccount(Account account);
    void saveTxn(AccountTxn accountTxn);

    Account findAccountById(Long accountId);
    AccountTxn findTxnById(Long txnId);

    void deleteAccount(Account account);
    void deleteTxn(AccountTxn accountTxn);

    List<Account> findAllAccounts(Room room);
    List<AccountTxn> findAllTxnsByYearMonth(Account account, Integer year, Integer month);
    List<AccountTxn> findAllTxnsByYearMonthWithType(Account account, Integer year, Integer month, TxnType type);

    void saveFinancePlan(FinancePlan financePlan);

    List<PredictedIncome> findAllPredictedIncomesByDate(Room room, Integer year, Integer month);

    List<PredictedIncome> findSoonPredictedIncomes(Room room, Integer days);

    List<PredictedExpense> findAllPredictedExpensesByDate(Room room, Integer year, Integer month);

    List<PredictedExpense> findSoonPredictedExpenses(Room room, Integer days);

    List<SavingGoal> findAllSavingGoalsByDate(Room room, Integer year, Integer month);

    List<SavingGoal> findSoonSavingGoals(Room room, Integer days);

    Long findTotalSumByDate(List<Account> allAccounts, Room room, Integer year, Integer month, TxnType txnType);

    PredictedIncome findPredictedIncomeById(Long financePlanId);

    void deleteFinancePlan(FinancePlan financePlan);

    PredictedExpense findPredictedExpenseById(Long financePlanId);

    SavingGoal findSavingGoalById(Long financePlanId);
}
