/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package service.api.ejb;

import java.util.List;
import javax.ejb.Remote;
import service.api.bean.QuestionBean;
import service.api.bean.QuestionnaireBean;

/**
 * Protocolo que serviço de gerência de questionários deve cumprir.
 * @author Igansi
 */
@Remote
public interface ManageQuestionnaireServiceRemote {
    
    /**
     * Cria uma questionário.
     * @param questionnaireBean Questionário bean a ser criada 
     */
    void createQuestionnaire(QuestionnaireBean questionnaireBean);
    
    /**
     * Encontra todos os questionários.
     * @return Questionários do sistema
     */
    List<QuestionnaireBean> findAll();
}
