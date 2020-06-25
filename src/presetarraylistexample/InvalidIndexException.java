/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presetarraylistexample;

/**
 *
 * @author Enubs
 */
public class InvalidIndexException extends IndexOutOfBoundsException{
    public InvalidIndexException(String msg){
        super(msg);
    }
}
