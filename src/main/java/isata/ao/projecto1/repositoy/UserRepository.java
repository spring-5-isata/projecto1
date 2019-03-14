package isata.ao.projecto1.repositoy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import isata.ao.projecto1.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail (String email);
	

//	@Query("select u from User u where u.name_user like %?1%")
//	User findByNameQualquerCoisa (String name);
	
	User findByNameIgnoreCaseLike(String name);

}
