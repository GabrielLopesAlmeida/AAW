package com.newton.aaw.hr.api;

import java.time.LocalDate;

import com.newton.aaw.hr.domain.entity.Employee;
import com.newton.aaw.hr.domain.enums.Gender;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {

	private String id;
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	private Gender gender;
	private LocalDate startDate;
	private LocalDate endDate;
	private String position;
	private Float monthlySalary;
	private Float hourSalary;
	private String area;
	
	public EmployeeDto(Employee a) {
		this.id = a.getId();
		this.firstName = a.getFirstName();
		this.lastName = a.getLastName();
		this.dateOfBirth = a.getDateOfBirth();
		this.gender = a.getGender();
		this.startDate = a.getStartDate();
		this.endDate = a.getEndDate();
		this.position = a.getPosition();
		this.monthlySalary = a.getMonthlySalary();
		this.hourSalary = a.getHourSalary();
		this.area = a.getArea();
	}
	
}