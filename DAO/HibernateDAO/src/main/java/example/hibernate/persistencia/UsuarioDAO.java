/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example.hibernate.persistencia;
import example.hibernate.model.Usuario;

/**
 *
 * @author ana
 */
public interface UsuarioDAO extends GenericDAO<Usuario>{
    public Usuario buscaUsuarioPorNome(String nome);
}
