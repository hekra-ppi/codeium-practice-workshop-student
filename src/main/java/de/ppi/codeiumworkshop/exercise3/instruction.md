# Exercise 3: Bug Finding

## Objective

Identify and fix runtime and logical errors in a provided `BankAccountManager` class using Codeium. Then, extend the class and tests to handle additional edge cases.


## Task Instructions

### 1. Initial Code Examination and Error Fixing

1. **Review the Provided Code:**
   - Examine the `BankAccountManager` class and the `BankAccountManagerTest` unit tests.

2. **Identify Errors:**
   - Note that the `testWithdraw` and `testOverdraw` tests fail.
     - `testWithdraw`: Expected 800, Actual 1000.
     - `testOverdraw`: Expected 1000, Actual -500.

3. **Use Codeium to Fix the Errors:**
   - Use Codeium to identify and correct the errors in the `BankAccountManager` class.
     - The `withdraw` method contains a logical error in the condition checking for insufficient funds.

### 2. Test and Validate

1. **Run the Unit Tests:**
   - Ensure that all unit tests pass after fixing the errors.
   - Verify that the `testWithdraw` and `testOverdraw` tests produce the expected results.

### 3. Handle Edge Cases

1. **Extend the `BankAccountManager` Class:**
   - Ensure that negative amounts for deposit and withdrawal are handled.
   - Ensure zero amounts for deposit and withdrawal are handled correctly.

2. **Extend the Unit Tests:**
   - Add tests to cover edge cases such as negative and zero amounts for both deposit and withdrawal.
