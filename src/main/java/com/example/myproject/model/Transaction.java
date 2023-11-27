<<<<<<< HEAD:src/main/java/com/example/myproject/Transaction.java
package com.example.myproject;
//shit
=======
package com.example.myproject.model;

>>>>>>> ca3c94e (include h2 database):src/main/java/com/example/myproject/model/Transaction.java
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime time;
    private double amount;

    @ManyToOne
    private Merchandise merchandise;

    public Transaction(LocalDateTime time, double amount, Merchandise merchandise) {
        this.time = time;
        this.amount = amount;
        this.merchandise = merchandise;
    }

}
