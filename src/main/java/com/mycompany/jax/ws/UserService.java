/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jax.ws;

import javax.jws.WebService;

@WebService
public interface UserService {
    public float getNetSalary(User user);
    
}
