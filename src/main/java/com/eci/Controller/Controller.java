package com.eci.Controller;

import java.util.List;

import com.eci.Entity.Candidate;
import com.eci.Service.Service;

public class Controller {
	
		
		Service ser = null;
		
		public List<Candidate> getAllCandidates(){
			ser = new Service();
			List<Candidate> allcandidates = ser.getAllCandidates();
			
			return allcandidates;
		}

		
		public List<Candidate> getCandidateByParty(String pname){
			ser = new Service();
			List<Candidate> cndbyparty = ser.getCandidateByParty(pname);
			
			return cndbyparty;
		}


		public List<Candidate> getCandidateByAssembly(String assembly) {
			ser = new Service();
			List<Candidate> cndbyassembly= ser.getCandidateByAssembly(assembly);
			
			return cndbyassembly;
		}


		public List<Candidate> getCandidateByAge(int age) {
			ser = new Service();
			List<Candidate> cndbyage= ser.getCandidateByAge(age);
			
			return cndbyage;
		}


		public List<Candidate> getCandidateByGender(String gender) {
			ser = new Service();
			List<Candidate> cndbygender= ser.getCandidateByGender(gender);
			
			return cndbygender;
		}


		public void insertCandidate() {
			ser = new Service();
			ser.insertCandidate();
			
		}


		public void updateCandidate() {
			ser = new Service();
			ser.updateCandidate();
		}


		public void deleteCandidate(int id) {
			ser = new Service();
			ser.deleteCandidate(id);
		}

	}

