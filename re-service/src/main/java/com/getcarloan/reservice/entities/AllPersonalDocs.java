package com.getcarloan.reservice.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Lob;


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


@Lob
private byte[] addressProof;
@Lob
private byte[] panCard;
@Lob
private byte[] itr;
@Lob
private byte[] adharCard;
@Lob
private byte[] photo;
@Lob
private byte[] Sign;
@Lob
private byte[] bankCheck;
@Lob

private byte[] salarySlips;

}
