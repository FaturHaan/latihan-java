package com.p2p;

import com.p2p.domain.Borrower;
import com.p2p.service.LoanService;
import com.p2p.domain.Loan;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.math.BigDecimal;

public class LoanServiceTest {

    // Deklarasi logger
    private static final Logger logger = LogManager.getLogger(LoanServiceTest.class);
    // TC-01
    @Test
    void shouldRejectLoanWhenBorrowerNotVerified() {

        // Menambahkan log
        logger.info("Memulai Eksekusi TC-01: shouldRejectLoanWhenBorrowerNotVerified");
        // =====================================================
        // SCENARIO:
        // Borrower tidak terverifikasi (KYC = false)
        // Ketika borrower mengajukan pinjaman
        // Maka sistem harus menolak dengan melempar exception
        // =====================================================

        // =========================
        // Arrange (Initial Condition)
        // =========================
        // Borrower belum lolos proses KYC
        Borrower borrower = new Borrower(false, 700);

        logger.warn("Status Verifikasi Borrower saat ini: KYC Lulus = " + borrower.isVerified());

        // Service untuk pengajuan loan
        LoanService loanService = new LoanService();

        // Jumlah pinjaman valid
        BigDecimal amount = BigDecimal.valueOf(1000);

        // ======================================
        // ACTION + ASSERT (Act + Assert)
        // ======================================
        // Ketika borrower mengajukan loan,
        // sistem harus MENOLAK dengan melempar exception
        assertThrows(IllegalArgumentException.class, () -> {
            loanService.createLoan(borrower, amount);
        });

        logger.info("TC-01 Selesai: Exception berhasil dilempar sesuai ekspektasi.");
    }
    // TC-02
    @Test
    void shouldRejectLoanWhenAmountIsZeroOrNegative() {
        logger.info("Memulai Eksekusi TC-02: shouldRejectLoanWhenAmountIsZeroOrNegative");
        // Arrange
        // Borrower sudah valid (KYC = true)
        Borrower validBorrower = new Borrower(true, 700);
        LoanService loanService = new LoanService();
        
        // Amount bernilai 0
        BigDecimal invalidAmount = BigDecimal.ZERO; 
        
        logger.warn("Mencoba mengajukan loan dengan jumlah uang: " + invalidAmount);

        // Act & Assert
        // sistem menolak dan melempar IllegalArgumentException
        assertThrows(IllegalArgumentException.class, () -> {
            loanService.createLoan(validBorrower, invalidAmount);
        });
        logger.info("TC-02 Selesai: Exception berhasil dilempar untuk jumlah uang tidak valid.");
    }
    // TC-03
    @Test
    void shouldApproveLoanWhenCreditScoreHigh() {
        // Menambahkan log
        logger.info("Memulai Eksekusi TC-03: shouldApproveLoanWhenCreditScoreHigh");
        // Arrange
        // Borrower sudah terverifikasi dan memiliki Credit Score tinggi (700 >= threshold 600)
        Borrower validBorrower = new Borrower(true, 700);
        LoanService loanService = new LoanService();
        BigDecimal validAmount = BigDecimal.valueOf(1000);
        
        logger.info("Mencoba mengajukan loan dengan Credit Score: " + validBorrower.getCreditScore());

        // Act
        Loan loan = loanService.createLoan(validBorrower, validAmount);
        
        // Assert
        // Pinjaman ini harus berstatus APPROVED
        assertEquals(Loan.Status.APPROVED, loan.getStatus());

        logger.info("TC-03 Selesai: Pinjaman berhasil disetujui (Status = APPROVED)");
    }
    // TC-04
    @Test
    void shouldRejectLoanWhenCreditScoreLow() {
        logger.info("Memulai Eksekusi TC-04: shouldRejectLoanWhenCreditScoreLow");
        // Arrange
        // Borrower sudah terverifikasi tapi memiliki Credit Score rendah (500 < threshold 600)
        Borrower lowCreditBorrower = new Borrower(true, 500);
        LoanService loanService = new LoanService();
        BigDecimal validAmount = BigDecimal.valueOf(1000);
        
        logger.warn("Mencoba mengajukan loan dengan Credit Score rendah: " + lowCreditBorrower.getCreditScore());

        // Act
        Loan loan = loanService.createLoan(lowCreditBorrower, validAmount);
        
        // Assert
        // Pinjaman ini harus berstatus REJECTED
        assertEquals(Loan.Status.REJECTED, loan.getStatus());

        logger.info("TC-04 Selesai: Pinjaman berhasil ditolak (Status = REJECTED)");
    }
}
