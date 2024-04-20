package project.expensetrackerapi.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

@Data
//@AllArgsConstructor
//@NoArgsConstructor
@Entity
@Table(name="expenses")
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="expense_name")
    @NotNull
    private String name;
    private String description;
    @Column(name="expense_amount")
    private BigDecimal amount;
    private String category;
    private Date date;

    @Column (name="created_at", nullable = false, updatable = false)
    @CreationTimestamp
    private Timestamp createdAt;

    @Column (name = "updated_at")
    @UpdateTimestamp
    private Timestamp updatedAt;
}


