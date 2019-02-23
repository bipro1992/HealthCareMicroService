package hcportal.employer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import hcportal.employer.dto.EmployerDto;
import hcportal.employer.entity.Employer;
import hcportal.employer.service.EmployerService;

@RestController
public class EmployerController {

	@Autowired
	private EmployerService service; // autowiring employer service

	// GET operation to fetch employer details from employerId
	@RequestMapping(method = RequestMethod.GET, value = "/employer/{id}", produces = "application/json")
	public EmployerDto getEmployerById(@PathVariable("id") int employerId) {
		return this.service.getEmployerById(employerId);
	}

	// PUT i.e update operation to update given employer details from its ID
	@RequestMapping(method = RequestMethod.PUT, value = "/employer/{id}", produces = "application/json", consumes = "application/json")
	public Employer updateEmployer(@PathVariable("id") int employerId, @RequestBody Employer employer) {
		return this.service.updateEmployer(employerId, employer);
	}

}
