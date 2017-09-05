package cz.jiripinkas.jba.repository;

import cz.jiripinkas.jba.entity.NewsItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsItemRepository extends JpaRepository<NewsItem, Integer> {

    NewsItem findByShortName(String shortName);

}
