/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import iterator.depois.*;

/**
 *
 * @author João Guilherme
 */
public interface IteratorProduto<T> {
    
    boolean hasNext();
    T next();
    
}
