package pl.rlechowicz.sklep.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "order_product")
public class OrderProduct {

    @Id
    @SequenceGenerator(sequenceName = "order_product_seq", name = "order_product__seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "order_product_seq")
    @Column(name = "order_product_id")
    private Integer orderProductId;

    @Column(name = "order_id", nullable = false)
    private Integer orderId;

    @Column(name = "product_id", nullable = false)
    private Integer productId;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    @Column(name = "active", nullable = false)
    private BigDecimal price;

}
