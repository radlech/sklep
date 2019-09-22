package pl.rlechowicz.sklep.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "order")
public class Order {

    @Id
    @SequenceGenerator(sequenceName = "order_seq", name = "order__seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "order_seq")
    @Column(name = "order_id")
    private Integer orderId;

    @Column(name = "customer_id", nullable = false)
    private Integer customerId;

    @Column(name = "status", nullable = false)
    private String status;

    @Column(name = "order_date", nullable = false)
    private Timestamp orderDate;

    @Column(name = "comments")
    private String comments;

    @Column(name = "payment_date")
    private Timestamp paymentDate;

    @Column(name = "invoice_filename", unique = true)
    private String invoiceFilename;

}
