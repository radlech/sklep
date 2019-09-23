package pl.rlechowicz.sklep.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @SequenceGenerator(sequenceName = "customer_seq", name = "customer__seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "customer_seq")
    @Column(name = "customer_id")
    private Long customerId;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(name = "firstname", nullable = false)
    private String firstname;

    @Column(name = "lastname", nullable = false)
    private String lastname;

    @Column(name = "phone", nullable = false)
    private String phone;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "city", nullable = false)
    private String city;

    @Column(name = "postal_code", nullable = false)
    private String postalCode;

}
