package dao;

import domain.Arcitle;
import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends ElasticsearchCrudRepository<Arcitle ,Long> {

int i =10;
}
