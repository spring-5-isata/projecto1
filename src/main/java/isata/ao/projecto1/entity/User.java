package isata.ao.projecto1.entity;
import java.util.Set;

import javax.persistence.*;

@Entity
public class User {	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nameUser;
	private String emailUser;
	@ManyToMany
	private Set<Role> roles;
	
	//Get e SET
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNameUser() {
		return nameUser;
	}
	public void setNameUser(String nameUser) {
		this.nameUser = nameUser;
	}
	public String getEmailUser() {
		return emailUser;
	}
	public void setEmailUser(String emailUser) {
		this.emailUser = emailUser;
	}
	
}		


