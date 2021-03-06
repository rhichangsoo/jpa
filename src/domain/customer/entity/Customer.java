package domain.customer.entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import domain.common.entity.ChangeHistory;

@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue
    private Integer id;
    
    @Embedded
    private ChangeHistory changeHistory;
    
    private String name;
    
    @Enumerated(EnumType.STRING)
    private Sex sex;
    
    private int age;
    
    private String birthDay;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public ChangeHistory getChangeHistory() {
		return changeHistory;
	}
	public void setChangeHistory(ChangeHistory changeHistory) {
		this.changeHistory = changeHistory;
	}
	public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Sex getSex() {
        return sex;
    }
    public void setSex(Sex sex) {
        this.sex = sex;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getBirthDay() {
        return birthDay;
    }
    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;

    }
}
