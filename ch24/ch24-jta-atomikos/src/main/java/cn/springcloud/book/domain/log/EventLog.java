package cn.springcloud.book.domain.log;

import javax.persistence.*;

/**
 * Created by caibosi on 2018-07-25.
 */
@Entity
@PersistenceUnit(unitName="logPersistUnit")
public class EventLog {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String operation;

    private String operator;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}
