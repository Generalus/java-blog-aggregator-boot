package cz.jiripinkas.jba.repository;

import cz.jiripinkas.jba.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

    Category findByShortName(String shortName);

}
