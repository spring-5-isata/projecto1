package isata.ao.projecto1.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import isata.ao.projecto1.entity.User;
import isata.ao.projecto1.repositoy.UserRepository;

@Component
public class DataInitilizr implements ApplicationListener<ContextRefreshedEvent>  {
	
	@Autowired
	UserRepository UserRepository;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent arg0) {
		// TODO Auto-generated method stub -
		createUser("Martins Isata", "martinsisata@gmail.com");
		createUser("Nerbel Isata", "Nerbelisata@gmail.com");
		createUser("Martinho Isata", "martinhoisata@gmail.com");
		createUser("Nerilia Isata", "neriliaisata@gmail.com");
		
		//Select By ID
		//User user = UserRepository.getOne(3L);
		
		//delete by ID
		//UserRepository.deleteById(4L);
		
		//User user = UserRepository.findByNameIgnoreCaseLike("nerilia");
		//System.out.println(user.getName());
		
		
	}
	
	public void createUser (String name, String email) {
		
		User user = new User(name, email);
		
		UserRepository.save(user);
		
		
	}

}
