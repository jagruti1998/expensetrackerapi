package project.expensetrackerapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.expensetrackerapi.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
