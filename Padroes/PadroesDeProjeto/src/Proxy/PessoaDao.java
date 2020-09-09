
package Proxy;

/**
 *
 * @author macxi
 */
public class PessoaDao {
    
    public static Subject findById(Integer id) {
        System.out.println("Buscando pessoa no banco");
        System.out.println("Select p from Pessoa p where (p.id =" +id + ")");
        String nome = "Pessoa " + id;
        return new Pessoa(id, nome);
    }
    
}
