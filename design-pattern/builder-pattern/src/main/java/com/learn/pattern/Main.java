package com.learn.pattern;

import com.learn.pattern.modals.BankAccount;

/**
 * @author Dhruv Maheshwari
 * @version $Id: Main.java, v 0.1 2023-02-28 11:58 AM Dhruv Maheshwari Exp $$
 */
public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount.BankAccountBuilder("Dhruv")
                .withAccountNumber("123456")
                        .withEmail("dhruv@gmail.com")
                                .build();

        System.out.println("Hello world!");
        System.out.println(bankAccount.toString());
    }
}