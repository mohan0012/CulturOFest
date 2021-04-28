package com.cg.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.stereotype.Component;

@Entity
@Table(name="adminlogin")
public class Login {
	
	    @Id
		@GeneratedValue(strategy = GenerationType.AUTO)
	    @Column(name = "admin_id")
	    private Long adminid;

	    @Column(name= "Username")
	    private String username;
	    
		@Column(name= "Password")
	    private String password;

		public Login() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Login(Long adminid,String username, String password) {
			super();
			this.adminid = adminid;
			this.username= username;
			this.password = password;
		}

		public long getAdminid() {
			return adminid;
		}

		public void setAdminid(Long adminid) {
			this.adminid = adminid;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}
		
		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		@Override
		public String toString() {
			return "Login [adminid=" + adminid + "username= " + username +", password=" + password + "]";
		}


}
