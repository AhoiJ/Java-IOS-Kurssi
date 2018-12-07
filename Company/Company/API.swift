//
//  API.swift
//  Company
//
//  Created by Jere Aho on 05/11/2018.
//  Copyright © 2018 Jere. All rights reserved.
//

import Foundation

struct API{
    
        static var companyUrl = "https://home.tamk.fi/~poypek/iosapi7/index.php/"
        static var companyImageUrl = "https://home.tamk.fi/~poypek/iosapi7/"
        
        // this handles api reads
        static func read(getUrl: String, getCompleted:@escaping (Data?, Bool, String) -> Void) {
            let apiUrl = URL(string: self.companyUrl + getUrl)
            URLSession.shared.dataTask(with: apiUrl!) { (data, response, error)  in
                if let httpResponse = response as? HTTPURLResponse {
                    if httpResponse.statusCode != 200 {
                        getCompleted(nil, false, String(httpResponse.statusCode))
                    } else {
                        getCompleted(data, true, String(httpResponse.statusCode))
                    }
                }
                
                }.resume()
        }
    
    static func write(method: String, body : [String:Any], postUrl : String, postCompleted : @escaping (Bool, String) -> ()) {
        print (body)
        var request = URLRequest(url: URL(string: self.companyUrl + postUrl)!)
        
        request.httpMethod = method
        request.addValue("application/json", forHTTPHeaderField: "Content-Type")
        request.addValue("application/json", forHTTPHeaderField: "Accept")
        
        do {
            request.httpBody = try JSONSerialization.data(withJSONObject: body, options: JSONSerialization.WritingOptions.prettyPrinted)
            
        } catch {
            print(error)
        }
        
        URLSession.shared.dataTask(with: request) { (data, response, error) in
            if let httpResponse = response as? HTTPURLResponse {
                if httpResponse.statusCode != 200 {
                    postCompleted(false, String(httpResponse.statusCode))
                } else {
                    postCompleted(true, String(httpResponse.statusCode))
                }
            }
            }.resume()
    }
    
    
    
}
