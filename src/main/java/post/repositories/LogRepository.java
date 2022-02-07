package post.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import post.models.Log;

@Repository
public interface LogRepository extends JpaRepository<Log, Integer> {

}
