package pl.rlechowicz.sklep.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "photo")
public class Photo {

    @Id
    @SequenceGenerator(sequenceName = "photo_seq", name = "photo__seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "photo_seq")
    @Column(name = "photo_id")
    private Long photoId;

    @Column(name = "product_id", nullable = false)
    private Long productId;

    @Column(name = "filename", nullable = false, unique = true)
    private String filename;

    @Column(name = "sort_number", nullable = false)
    private Integer sortNumber;

}
