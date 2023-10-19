package ma.formation.data.rest.service.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Categorie {
    @Id
    @GeneratedValue
    private Long id;
    @Column(unique = true)
    private String categorie;

    @OneToMany(mappedBy = "categorie", cascade = CascadeType.ALL)
    private List<Article> articles = new ArrayList<>();

    public Categorie(String categorie) {
        this.id = id;
        this.categorie = categorie;
    }
}
