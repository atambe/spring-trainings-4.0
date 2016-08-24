package com.cg.demo;
/* For injecting collection @Resourse annotation should be used instead of @Autowired because, If a class has 
 * attribute List<Address> and has @Autowired annotation, Spring will try to inject all beans of type Address 
 * defined within current application context instead of the <util:list> declared in the configuration file.
 * This will result into unexpected dependencies being injected. So for collection type of injection we have to
 * explicitly instruct Spring to perform injection by specifying bean name, which the @Resource annotation supports.
 */
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Service;

@Service
public class Employee {
	@Value("Sagar")
	private String name;
	@Resource(name="map")
	private Map<String, Address>address;
	@Resource(name="set")
	private Set<Project> projects;
	@Resource(name="list")
	private List<Phone> phones;
	@Resource(name="props")
	private Properties family;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<String, Address> getAddress() {
		return address;
	}
	public void setAddress(Map<String, Address> address) {
		this.address = address;
	}
	public Set<Project> getProjects() {
		return projects;
	}
	public void setProjects(Set<Project> projects) {
		this.projects = projects;
	}
	public List<Phone> getPhones() {
		return phones;
	}
	public void setPhones(List<Phone> phones) {
		this.phones = phones;
	}
	public Properties getFamily() {
		return family;
	}
	public void setFamily(Properties family) {
		this.family = family;
	}
	@Override
	public String toString() {
		return "Employee [address=" + address + ", family=" + family
				+ ", name=" + name + ", phones=" + phones + ", projects="
				+ projects + "]";
	}
	
}
