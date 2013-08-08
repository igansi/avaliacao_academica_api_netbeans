/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package service.api.bean;

import java.io.Serializable;
import java.util.Objects;

/**
 * Questão de um questionário como sendo um bean de transporte.
 * @author Igansi
 */
public class QuestionBean implements Serializable {
    
    private int type;
    private String question;

    public QuestionBean() {}

    public QuestionBean(int type, String question) {
        this.type = type;
        this.question = question;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.type, this.question);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final QuestionBean other = (QuestionBean) obj;
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (!Objects.equals(this.question, other.question)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "QuestionBean{" + "type=" + type + ", question=" + question + '}';
    }   
}
