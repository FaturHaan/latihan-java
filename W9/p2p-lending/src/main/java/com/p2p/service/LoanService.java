package com.p2p.service;
import com.p2p.domain.*;
import java.math.BigDecimal;
public class LoanService {

    // =========================
    // Extract Constant TC-04
    // =========================
    private static final int MINIMUM_CREDIT_SCORE = 600;

    public Loan createLoan(Borrower borrower, BigDecimal amount) {
        // =========================
        // VALIDASI UTAMA (TC-01)
        // =========================
        // Jika borrower belum terverifikasi,
        // maka proses harus dihentikan
        validateBorrower(borrower);

        // =========================
        // VALIDASI UTAMA (TC-02)
        // =========================
        validateAmount(amount);
    
        // Membuat objek loan baru
        Loan loan = new Loan();

        // =========================
        // PENENTUAN STATUS TC-03, TC-04
        // =========================
        determineLoanStatus(borrower, loan);
        return loan;
        
    }
    // =========================
    // Extract Method TC-01
    // =========================
    private void validateBorrower(Borrower borrower) {
        if (!borrower.canApplyLoan()) {
            throw new IllegalArgumentException("Borrower not verified");
        }
    }
    // =========================
    // Extract Method TC-02
    // =========================
    private void validateAmount(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Loan amount must be greater than zero");
        }
    }
    // =========================
    // Extract Method TC-03
    // =========================
    private void determineLoanStatus(Borrower borrower, Loan loan) {
        if (borrower.getCreditScore() >= MINIMUM_CREDIT_SCORE) {
            loan.approve();
        } else {
            loan.reject();
        }
    }
}
