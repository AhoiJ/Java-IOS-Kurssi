//
//  EmployeeDetailsViewController.swift
//  Company
//
//  Created by Jere Aho on 26/11/2018.
//  Copyright © 2018 Jere. All rights reserved.
//

import UIKit

class EmployeeDetailsViewController: UITableViewController {
    
 //   var employee: Employee! = Employee()
    var employee: Employee?

    /*
    @IBOutlet weak var IdLabel: UILabel!
    @IBOutlet weak var FnameLabel: UILabel!
    @IBOutlet weak var LnameLabel: UILabel!
    @IBOutlet weak var SalaryLabel: UILabel!
    @IBOutlet weak var BirthdLabel: UILabel!
    @IBOutlet weak var EmailLabel: UILabel!
    @IBOutlet weak var DepIdLabel: UILabel!
    @IBOutlet weak var DepNameLabel: UILabel!
    @IBOutlet weak var PhoneNum1Label: UILabel!
    @IBOutlet weak var PhoneNum2Label: UILabel!
    @IBOutlet weak var ImageUrlLabel: UILabel!
    */
    @IBOutlet weak var IdLabel: UITextField!
    @IBOutlet weak var FnameLabel: UITextField!
    @IBOutlet weak var LnameLabel: UITextField!
    @IBOutlet weak var SalaryLabel: UITextField!
    @IBOutlet weak var BirthdLabel: UITextField!
    @IBOutlet weak var EmailLabel: UITextField!
    @IBOutlet weak var DepIdLabel: UITextField!
    @IBOutlet weak var DepNameLabel: UITextField!
    @IBOutlet weak var PhoneNum1Label: UITextField!
    @IBOutlet weak var PhoneNum2Label: UITextField!
    @IBOutlet weak var ImageUrlLabel: UITextField!
    
    

   
    override func prepare(for segue: UIStoryboardSegue, sender: Any?)  {
        
        
        if segue.identifier == "editEmployee",
            let employeeId = IdLabel.text,
            let employeeFname = FnameLabel.text,
            let employeeLname = LnameLabel.text,
            let employeeSalary = Double(SalaryLabel.text!),
            let employeeBdate = BirthdLabel.text,
            let employeeEmail = EmailLabel.text,
            let employeeDepId = DepIdLabel.text,
            let employeeDepName = DepNameLabel.text,
            let employeePhone1 = PhoneNum1Label.text,
            let employeePhone2 = PhoneNum2Label.text,
            let employeeImage = ImageUrlLabel.text
        {
            
            
            employee = Employee(id: employeeId, fname: employeeFname, lname: employeeLname, salary: employeeSalary, bdate: employeeBdate, email: employeeEmail, dep: employeeDepId, dname: employeeDepName, phone1: employeePhone1, phone2: employeePhone2, image: employeeImage)
        }
    }
        
        override func viewDidLoad() {
/*
            IdLabel.text = self.employee.id
            FnameLabel.text = self.employee.fname
            LnameLabel.text = self.employee.lname
            SalaryLabel.text = String (self.employee.salary!)
            BirthdLabel.text = self.employee.bdate
            EmailLabel.text = self.employee.email
            DepIdLabel.text = self.employee.dep
            DepNameLabel.text = self.employee.dname
            PhoneNum1Label.text = self.employee.phone1
            PhoneNum2Label.text = self.employee.phone2
            ImageUrlLabel.text = self.employee.image
  */
        super.viewDidLoad()
        
     /*
        let tap: UIGestureRecognizer = UITapGestureRecognizer(target:self, action:
            #selector(EmployeeDetailsViewController.dismissKeyboard))
    
        view.addGestureRecognizer(tap)
    */
        
        
        


    }
    
}
