package service.impl;

import dao.ArticleRepository;
import domain.Arcitle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.ArcitleService;

@Service
public class ArcitleServiceImpl implements ArcitleService {

    @Autowired
    ArticleRepository articleRepository;

    public void save(Arcitle arcitle) {
        articleRepository.save(arcitle);
    }
}
