package ch.hearc.ig.guideresto.business;

import javax.persistence.*;

@Entity
@Table(name="NOTES")
public class Grade {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SEQ_NOT")
    @SequenceGenerator(name="SEQ_NOT",sequenceName = "SEQ_NOTES",initialValue = 1,allocationSize = 1)
    private Integer id;
    @Column(name="NOTE")
    private Integer grade;
    @Embedded
    private CompleteEvaluation evaluation;
    @OneToOne
    @JoinColumn(name="NUMERO")
    private EvaluationCriteria criteria;

    public Grade() {
        this(null, null, null);
    }

    public Grade(Integer grade, CompleteEvaluation evaluation, EvaluationCriteria criteria) {
        this(null, grade, evaluation, criteria);
    }

    public Grade(Integer id, Integer grade, CompleteEvaluation evaluation, EvaluationCriteria criteria) {
        this.id = id;
        this.grade = grade;
        this.evaluation = evaluation;
        this.criteria = criteria;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public CompleteEvaluation getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(CompleteEvaluation evaluation) {
        this.evaluation = evaluation;
    }

    public EvaluationCriteria getCriteria() {
        return criteria;
    }

    public void setCriteria(EvaluationCriteria criteria) {
        this.criteria = criteria;
    }
}