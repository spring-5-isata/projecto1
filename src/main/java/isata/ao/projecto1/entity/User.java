package isata.ao.projecto1.entity;
import java.util.Set;

import javax.persistence.*;

@Entity
public class User {	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String email;
	@ManyToMany
	private Set<Role> roles;
	
	//Get e SET
	
	public Long getId() {
		return id;
	}
	
	
	public User() {

	}
	
	
	
	public User(String name, String email) {

		this.name = name;
		this.email = email;
	}


	public void setId(Long id) {
		this.id = id;
	}
	public String getNameUser() {
		return getName();
	}


	public String getName() {
		return name;
	}
	public void setNameUser(String name) {
		setName(name);
	}


	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}		


