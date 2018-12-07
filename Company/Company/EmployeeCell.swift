//
//  EmployeeCell.swift
//  Company
//
//  Created by Jere Aho on 05/11/2018.
//  Copyright © 2018 Jere. All rights reserved.
//

import UIKit

class EmployeeCell: UITableViewCell {

    @IBOutlet weak var departmentLabel: UILabel!
    @IBOutlet weak var employeeImage: UIImageView!
    @IBOutlet weak var nameLabel: UILabel!
    // lisää placeholderImageView
    var imageUrl: URL!
    
    var employee: Employee! {
        didSet{
            nameLabel.text = employee.fname! + " " + employee.lname!
            departmentLabel.text = employee.dname
            print (API.companyImageUrl + employee.image!)
            
            if let empImg = employee?.image{
                let imageUrl = URL(string: API.companyImageUrl + empImg)
            
            if let image = imageUrl!.cachedImage{
                //Cached: set immediately
                employeeImage.image = image
                employeeImage.alpha = 1
           //     placeholderImageView.alpha = 0
            }else{
                // not cached load then fade it in
                employeeImage.alpha = 0
                // placeholderImageView.aplha = 1
                imageUrl!.fetchImage{image in self.employeeImage.image = image
                    UIView.animate(withDuration: 0.3, animations: {
                        self.employeeImage.alpha = 1
                        // self.placeholderImageView = 0
                        })
                }
            }
        }
    }
    }
    override func awakeFromNib() {
        super.awakeFromNib()
        // Initialization code
    }

    override func setSelected(_ selected: Bool, animated: Bool) {
        super.setSelected(selected, animated: animated)

        // Configure the view for the selected state
    }

}
