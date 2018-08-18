package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@RunWith(SpringRunner.class)
@SpringBootTest
public class SearchFacadeTestSuite {
    @Autowired
    private SearchFacade facade;
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void testFindCompanyByPartName() {
        //Given
        Company greyMatter = new Company("Tesla");
        companyDao.save(greyMatter);
        //When
        List<Company> companies = facade.findCompanyByPartName("sla");
        //Then
        Assert.assertEquals("Tesla", companies.get(0).getName());
    }

    @Test
    public void testFindEmployeeByPartName() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        employeeDao.save(johnSmith);
        //When
        List<Employee> employees = facade.findEmployeeByPartName("ith");
        //Then
        Assert.assertEquals("Smith", employees.get(0).getLastname());
    }
}