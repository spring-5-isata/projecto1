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
		
		User user = new User();
		
		user.setEmailUser("martinsisata@gmail.com");
		user.setNameUser("Martins Isata");
		
		UserRepository.save(user);
		
	}

}
