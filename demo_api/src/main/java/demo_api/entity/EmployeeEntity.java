package demo_api.entity;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Table(name="account")
@Entity
@Data
public class EmployeeEntity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1L;

	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private Integer id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="salary")
	private Integer salary;
	
	@Column(name="department_id")
	private Integer departmentId;

}
