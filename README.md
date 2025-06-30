# 💰 Bank Account Simulation (Java)

This is a basic **Java console-based banking application** that allows a user to:
- Deposit and withdraw money
- Check balance
- View transaction history

It uses **object-oriented programming** and **Unicode ₹ symbol** for Indian currency display.

---

## 🛠 Features

- ✅ Create account with name and initial balance
- ✅ Deposit money
- ✅ Withdraw money (with balance check)
- ✅ View current balance
- ✅ Print transaction history
- ✅ Uses Unicode `₹` symbol without relying on `Currency`/`Locale`

---

### Prerequisites:
- Java 17 or above
- Any IDE or terminal with Unicode support

### Sample Output:

Enter account holder name: Ankur

Enter initial balance : ₹10000

--- Menu ---
1. Deposit
2. Withdraw
3. Check Balance
4. Transaction History
5. Exit
Choose an option: 1

Enter amount to deposit : ₹5000

Deposit successful. New balance: ₹15000.0

### ⚙️ Compile and Run
```bash
javac Account.java Bank.java
java Bank

