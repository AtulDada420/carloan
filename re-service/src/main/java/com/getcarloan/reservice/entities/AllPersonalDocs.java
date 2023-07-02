package com.getcarloan.reservice.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AllPersonalDocs {
@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "docs_generator")
@SequenceGenerator(name = "docs_generator", sequenceName = "DOCUMENTS_SEQUENCE",initialValue=888,allocationSize = 0)
private int docId;

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
private byte[] sign;
@Lob
private byte[] bankCheque;
@Lob
private byte[] salarySlips;

}
