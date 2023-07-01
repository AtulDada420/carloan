package com.getcarloan.reservice.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AllPersonalDocs {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int docId;
private byte[] addressProof;
private byte[] panCard;
private byte[] itr;
private byte[] adharCard;
private byte[] photo;
private byte[] Sign;
private byte[] bankCheck;
private byte[] salarySlips;

}
