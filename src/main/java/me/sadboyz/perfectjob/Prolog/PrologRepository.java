/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.sadboyz.perfectjob.Prolog;


/**
 *
 * @author hugo
 */
public class PrologRepository {
    
    public PrologRepository consultFile(){
        String consult = "pwd.";
        Query query = new Query(consult);
        System.out.println(query.getSolution().toString());
        return this;
    }
    
}
