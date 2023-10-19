package ma.formation.data.rest.service;

import ma.formation.data.rest.service.model.Article;
import ma.formation.data.rest.service.model.Categorie;

public interface IService {
    void save(Categorie cat, Article... articles);
}
