/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.first.steps.services;

/**
 *
 * @author pretorian42
 */
public class NameService {
    
    private static final String defaultName = "Bob";
    private String currentName = defaultName;

    /**
     * @return the currentName
     */
    public String getCurrentName() {
        return currentName;
    }

    /**
     * @param currentName the currentName to set
     */
    public void setCurrentName(String currentName) {
        this.currentName = currentName;
    }
}
