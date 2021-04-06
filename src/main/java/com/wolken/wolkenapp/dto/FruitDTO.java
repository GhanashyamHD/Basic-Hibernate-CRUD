package com.wolken.wolkenapp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
@Table(name ="fruits")
public class FruitDTO {
@Id
@Column(name ="fId")
private int fruitId;
@Column(name ="fName")
private String fruitName;
//public FruitDTO() {
//	// TODO Auto-generated constructor stub
//}
//public int getFruitId() {
//	return fruitId;
//}
//public void setFruitId(int fruitId) {
//	this.fruitId = fruitId;
//}
//public String getFruitName() {
//	return fruitName;
//}
//public void setFruitName(String fruitName) {
//	this.fruitName = fruitName;
//}



}
