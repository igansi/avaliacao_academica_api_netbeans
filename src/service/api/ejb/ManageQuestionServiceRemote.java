/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package service.api.ejb;

import java.util.List;
import javax.ejb.Remote;
import service.api.bean.QuestionBean;

/**
 * Protocolo que serviço de gerência de questões de uma avaliação (aluno e professor) deve cumprir.
 * @author Igansi
 */
@Remote
public interface ManageQuestionServiceRemote {
    
    /**
     * Cria uma questão.
     * @param questionBean Questão bean a ser criada 
     */
    void createQuestion(QuestionBean questionBean);
    
    /**
     * Encontra todas as questões.
     * @return Questões do sistema
     */
    List<QuestionBean> findAll();
}
