package pl.rlechowicz.sklep.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "category")
public class Category implements Comparable<Category> {

    @Id
    @SequenceGenerator(sequenceName = "category_seq", name = "category__seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "category_seq")
    @Column(name = "category_id")
    private Long categoryId;

    @Column(name = "name", nullable = false, unique = true)
    private String name;

    @Column(name = "icon", nullable = false)
    private String icon;

    @Override
    public int compareTo(Category c) {
        return name.compareTo(c.name);
    }
}
