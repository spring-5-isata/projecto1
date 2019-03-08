package isata.ao.projecto1.repositoy;
import org.springframework.data.jpa.repository.JpaRepository;

import isata.ao.projecto1.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
