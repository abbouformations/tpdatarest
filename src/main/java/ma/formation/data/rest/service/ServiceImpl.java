package ma.formation.data.rest.service;

import ma.formation.data.rest.dao.CategorieRepository;
import ma.formation.data.rest.service.model.Article;
import ma.formation.data.rest.service.model.Categorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ServiceImpl implements IService {
    @Autowired
    private CategorieRepository categorieRepository;

    @Override
    public void save(Categorie cat, Article... articleList) {
        for (Article a : articleList) {
            a.setCategorie(cat);
            cat.getArticles().add(a);
        }
        categorieRepository.save(cat);
    }
}
