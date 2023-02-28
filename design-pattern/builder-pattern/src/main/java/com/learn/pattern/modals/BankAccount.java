package com.learn.pattern.modals;

/**
 * @author Dhruv Maheshwari
 * @version $Id: BankAccount.java, v 0.1 2023-02-28 11:58 AM Dhruv Maheshwari Exp $$
 */
public class BankAccount {
    private String name;
    private String accountNumber;
    private String email;

    public BankAccount(BankAccountBuilder bankAccountBuilder) {
        this.name = bankAccountBuilder.name;
        this.accountNumber = bankAccountBuilder.accountNumber;
        this.email = bankAccountBuilder.email;
    }

    /**
     * Getter method for property <tt>name</tt>.
     *
     * @return property value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Getter method for property <tt>accountNumber</tt>.
     *
     * @return property value of accountNumber
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Getter method for property <tt>email</tt>.
     *
     * @return property value of email
     */
    public String getEmail() {
        return email;
    }

    // Builder Class
    public static class BankAccountBuilder {
        private String name;
        private String accountNumber;
        private String email;

        public BankAccountBuilder(String name) {
            this.name = name;
        }

        public BankAccountBuilder withAccountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
            return this;
        }

        public BankAccountBuilder withEmail(String email) {
            this.email = email;
            return this;
        }

        public BankAccount build() {
            return new BankAccount(this);
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
