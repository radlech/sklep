package pl.rlechowicz.sklep.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@Entity
@Table(name = "orders")
public class Order {

    @Id
    @SequenceGenerator(sequenceName = "order_seq", name = "order__seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "order_seq")
    @Column(name = "order_id")
    private Long orderId;

    @Column(name = "customer_id", nullable = false)
    private Long customerId;

    @Column(name = "status", nullable = false)
    private String status;

    @Column(name = "order_date")
    private Timestamp orderDate;

    @Column(name = "comments")
    private String comments;

    @Column(name = "payment_date")
    private Timestamp paymentDate;

    @Column(name = "invoice_filename", unique = true)
    private String invoiceFilename;

}
