package com.tcs;



import java.util.*;


public class BankAccountOperations {
    static int balance;
    static List<Integer> transactionHistory = new ArrayList<>();
    static List<Integer> commitHistory = new ArrayList<>();
    static List<Boolean> committedTransactions = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        balance = sc.nextInt();
        int N = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < N; i++) {
            String operation = sc.nextLine();
            processOperation(operation);
        }
    }
    
    static void processOperation(String operation) {
        String[] parts = operation.split(" ");
        
        switch (parts[0]) {
            case "read":
                System.out.println(balance);
                break;
            
            case "credit":
                int creditAmount = Integer.parseInt(parts[1]);
                transactionHistory.add(creditAmount);
                committedTransactions.add(false);
                balance += creditAmount;
                break;
                
            case "debit":
                int debitAmount = Integer.parseInt(parts[1]);
                transactionHistory.add(-debitAmount);
                committedTransactions.add(false);
                balance -= debitAmount;
                break;
                
            case "abort":
                int abortIndex = Integer.parseInt(parts[1]) - 1;
                if (abortIndex < transactionHistory.size() && !committedTransactions.get(abortIndex)) {
                    int abortedAmount = transactionHistory.get(abortIndex);
                    if (abortedAmount > 0) {
                        balance -= abortedAmount;
                    } else {
                        balance += -abortedAmount;
                    }
                    transactionHistory.set(abortIndex, 0);
                    committedTransactions.set(abortIndex, true);
                }
                break;
                
            case "rollback":
                int rollbackIndex = Integer.parseInt(parts[1]) - 1;
                if (rollbackIndex < commitHistory.size()) {
                    balance = commitHistory.get(rollbackIndex);
                }
                break;
                
            case "commit":
                commitHistory.add(balance);
                for (int i = 0; i < committedTransactions.size(); i++) {
                    committedTransactions.set(i, true);
                }
                break;
                
            default:
                System.out.println("Invalid operation");
        }
    }
}