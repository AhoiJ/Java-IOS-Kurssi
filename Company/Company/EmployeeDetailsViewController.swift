//
//  EmployeeDetailsViewController.swift
//  Company
//
//  Created by Jere Aho on 26/11/2018.
//  Copyright © 2018 Jere. All rights reserved.
//

import UIKit

class EmployeeDetailsViewController: UITableViewController {
    
    var employee: Employee! = Employee()
    
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
    



    override func viewDidLoad() {
        
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
        
        
        super.viewDidLoad()
        
    }
    
}
