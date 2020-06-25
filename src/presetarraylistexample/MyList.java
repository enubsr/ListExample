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
public interface MyList<E> {
    public int size();
    public boolean isEmpty();
    public E get(int i) throws InvalidIndexException;
    public E set(int i, E e) throws InvalidIndexException;
    public void add(int i, E e) throws InvalidIndexException;
    public E remove(int i) throws InvalidIndexException;
}
