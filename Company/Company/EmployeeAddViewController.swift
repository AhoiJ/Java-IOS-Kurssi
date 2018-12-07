//
//  EmployeeAddViewController.swift
//  Company
//
//  Created by Jere Aho on 19/11/2018.
//  Copyright © 2018 Jere. All rights reserved.
//

import UIKit

class EmployeeAddViewController: UITableViewController {
        var employee: Employee?
    @IBOutlet weak var fnameTextField: UITextField!
    @IBOutlet weak var lnameTextField: UITextField!
    @IBOutlet weak var idTextField: UITextField!
    @IBOutlet weak var salaryTextField: UITextField!
    @IBOutlet weak var birthDateTextField: UITextField!
    @IBOutlet weak var emailTextField: UITextField!
    @IBOutlet weak var departmentIdTextField: UITextField!
    @IBOutlet weak var departmentNameTextField: UITextField!
    @IBOutlet weak var phoneNum1TextField: UITextField!
    @IBOutlet weak var phoneNum2TextField: UITextField!
    @IBOutlet weak var imageTextField: UITextField!
   
    
    
    override func prepare(for segue: UIStoryboardSegue, sender: Any?)  {
        
        if segue.identifier == "saveEmploeeDetail",
        let employeeId = idTextField.text,
        let employeeFname = fnameTextField.text,
        let employeeLname = lnameTextField.text,
        let employeeSalary = Double(salaryTextField.text!),
        let employeeBdate = birthDateTextField.text,
        let employeeEmail = emailTextField.text,
        let employeeDepId = departmentIdTextField.text,
        let employeeDepName = departmentNameTextField.text,
        let employeePhone1 = phoneNum1TextField.text,
        let employeePhone2 = phoneNum2TextField.text,
        let employeeImage = imageTextField.text
        {
            employee = Employee(id: employeeId, fname: employeeFname, lname: employeeLname, salary: employeeSalary, bdate: employeeBdate, email: employeeEmail, dep: employeeDepId, dname: employeeDepName, phone1: employeePhone1, phone2: employeePhone2, image: employeeImage)
        }
    }
    

    
    
    override func viewDidLoad() {
        super.viewDidLoad()

        // Uncomment the following line to preserve selection between presentations
        // self.clearsSelectionOnViewWillAppear = false

        // Uncomment the following line to display an Edit button in the navigation bar for this view controller.
        // self.navigationItem.rightBarButtonItem = self.editButtonItem
    }

}
