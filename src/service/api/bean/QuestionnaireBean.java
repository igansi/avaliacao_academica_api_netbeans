/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package service.api.bean;

import java.util.Collection;
import java.util.Objects;

/**
 * Questionário como sendo um bean de transporte.
 * @author Igansi
 */
public class QuestionnaireBean {
    
    private String title;
    private Collection<QuestionBean> questions;

    public QuestionnaireBean() {}

    public QuestionnaireBean(String title, Collection<QuestionBean> questions) {
        this.title = title;
        this.questions = questions;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Collection<QuestionBean> getQuestions() {
        return questions;
    }

    public void setQuestions(Collection<QuestionBean> questions) {
        this.questions = questions;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.title, this.questions);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final QuestionnaireBean other = (QuestionnaireBean) obj;
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.questions, other.questions)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "QuestionnaireBean{" + "title=" + title + ", questions=" + questions + '}';
    }
}
