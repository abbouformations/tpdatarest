package ma.formation.data.rest.service.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Article {
    @Id
    @GeneratedValue
    private Long id;
    private String description;
    private Double price;
    private Double quantity;

    @ManyToOne
    @JoinColumn(name = "categorie_id")
    private Categorie categorie;

    public Article(String description, Double price, Double quantity) {
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

}
