package com.eci.Service;

import java.util.ArrayList;
import java.util.List;

import com.eci.Entity.Candidate;
import com.eci.dao.Dao;

public class Service {

	Dao dao = null;

	public List<Candidate> getAllCandidates() {

		dao = new Dao();
		List<Candidate> allcandidates = dao.getAllCandidates();

		return allcandidates;
	}

	public List<Candidate> getCandidateByParty(String partyname) {
		dao = new Dao();
		List<Candidate> allcandidates = dao.getAllCandidates();
		List<Candidate> cndbyparty = new ArrayList<Candidate>();

		for (Candidate candidate : allcandidates) {
			if (candidate.getCname().equalsIgnoreCase(partyname)) {
				cndbyparty.add(candidate);
			}
		}

		return cndbyparty;
	}

	public List<Candidate> getCandidateByAssembly(String assembly) {

		dao = new Dao();
		List<Candidate> allcandidates = dao.getAllCandidates();
		List<Candidate> cndbyassembly = new ArrayList<Candidate>();

		for (Candidate candidate : allcandidates) {
			if (candidate.getAssembly().equalsIgnoreCase(assembly)) {
				cndbyassembly.add(candidate);
			}
		}

		return cndbyassembly;
	}

	public List<Candidate> getCandidateByAge(int age) {
		dao = new Dao();
		List<Candidate> allcandidates = dao.getAllCandidates();
		List<Candidate> cndbyage = new ArrayList<Candidate>();

		for (Candidate candidate : allcandidates) {
			if (candidate.getAge() >= age) {
				cndbyage.add(candidate);
			}
		}

		return cndbyage;
	}

	public List<Candidate> getCandidateByGender(String gender) {
		dao = new Dao();
		List<Candidate> allcandidates = dao.getAllCandidates();
		List<Candidate> cndbygender = new ArrayList<Candidate>();

		for (Candidate candidate : allcandidates) {
			if (candidate.getGender().equalsIgnoreCase(gender)) {
				cndbygender.add(candidate);
			}
		}

		return cndbygender;
	}

	public void insertCandidate() {
		dao = new Dao();
		dao.insertCandidate();
	}

	public void updateCandidate() {
		dao = new Dao();
		dao.updateCandidate();
	}

	public void deleteCandidate(int id) {
		dao = new Dao();
		dao.deleteCandidate(id);
	}

}
