/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package service.api.ejb;

import java.util.List;
import javax.ejb.Remote;
import service.api.bean.UserBean;

/**
 * Protocolo que serviço de gerência de usuário (aluno e professor) deve cumprir.
 * @author Igansi
 */
@Remote
public interface ManageUserServiceRemote {
    
    /**
     * Cria um usuário.
     * @param userBean Usuário bean a ser criado
     */
    void createUser(UserBean userBean);
    
    /**
     * Encontra todos os usuários.
     * @return Usuários do sistema
     */
    List<UserBean> findAll();
}
