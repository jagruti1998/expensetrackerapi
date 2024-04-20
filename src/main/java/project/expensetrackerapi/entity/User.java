package project.expensetrackerapi.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
    @Entity
    @Table(name="users")
    public class User {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;
        @Column(name="expense_name")
        private String name;
        @Column(unique = true)
        private String email;
        @JsonIgnore
        private String password;
        private long age;

        @Column (name="created_at", nullable = false, updatable = false)
        @CreationTimestamp
        private Timestamp createdAt;

        @Column (name = "updated_at")
        @UpdateTimestamp
        private Timestamp updatedAt;
    }




