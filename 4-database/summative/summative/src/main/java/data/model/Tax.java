package data.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "tax")

public class Tax {
    //    Tax_ID INT PRIMARY KEY AUTO_INCREMENT,
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Tax_ID")
    private Integer taxID;

    //    Tax_Percentage DECIMAL(5 , 2 ) NOT NULL,
    @Column(name = "tax_percentage", precision = 9, scale = 2, nullable = false)
    private BigDecimal taxPercentage;

    //    Start_Date DATE NOT NULL,
    @Column(name = "start_date", nullable = false)
    private LocalDateTime startDate;

    //    End_Date DATE NULL
    @Column(name = "end_date")
    private LocalDateTime endDate;

    public Integer getTaxID() {
        return taxID;
    }

    public void setTaxID(Integer taxID) {
        this.taxID = taxID;
    }

    public BigDecimal getTaxPercentage() {
        return taxPercentage;
    }

    public void setTaxPercentage(BigDecimal taxPercentage) {
        this.taxPercentage = taxPercentage;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }
}
