package com.example.demo.dao;

import org.springframework.stereotype.Repository;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.Patient;

@Repository
public interface PatientRepository extends MongoRepository<Patient, ObjectId> {
	public Patient findBy_id(ObjectId _id);
	public List<Patient> findByNom(String Nom);
}
