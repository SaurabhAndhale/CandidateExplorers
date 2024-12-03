package com.eci.Client;

import java.util.List;
import java.util.Scanner;

import com.eci.Controller.Controller;
import com.eci.Entity.Candidate;

public class ECIClient {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Controller con = new Controller();

		while (true) {

			System.out.println("1. See/Sort Candidates.");
			System.out.println("2. Insert Candidate.");
			System.out.println("3. Update Candidate.");
			System.out.println("4. Delete Candidate.");

			System.out.println("Enter Choice: ");
			int ch = sc.nextInt();

			switch (ch) {

			case 1:
				ECIClient eci = new ECIClient();
				eci.sortCandidates();
				break;
			case 2:
				con.insertCandidate();
				break;
			case 3:
				con.updateCandidate();
				break;
			case 4:
				System.out.println("Enter Candidate id: ");
				int id = sc.nextInt();
				con.deleteCandidate(id);
				break;
			}

		}

	}

	public void sortCandidates() {

		Scanner sc = new Scanner(System.in);
		Controller con = new Controller();

		while (true) {
			System.out.println("1. Get All Candidates.");
			System.out.println("2. Get Candidate By Party.");
			System.out.println("3. Get Candidate By Assembly Name.");
			System.out.println("4. Get Candidate By gender.");
			System.out.println("5. Candidate's By Age.");

			System.out.println("Enter Choice:- ");
			int ch = sc.nextInt();
			switch (ch) {

			case 1:
				List<Candidate> allcandidates = con.getAllCandidates();
				for (Candidate candidate : allcandidates) {
					System.out.println(candidate);
				}
				break;
			case 2:
				System.out.println("Enter Party Name:- ");
				String partyname = sc.next();
				sc.nextLine();
				List<Candidate> cndbypary = con.getCandidateByParty(partyname);
				for (Candidate candidate : cndbypary) {
					System.out.println(candidate);

				}
				break;

			case 3:
				System.out.println("Enter Assembly Name:- ");
				String assembly = sc.next();
				sc.nextLine();
				List<Candidate> cndbyassembly = con.getCandidateByAssembly(assembly);
				for (Candidate candidate : cndbyassembly) {
					System.out.println(candidate);

				}

				break;

			case 4:
				System.out.println("Enter Gender:- ");
				String gender = sc.next();

				List<Candidate> cndbygender = con.getCandidateByGender(gender);
				for (Candidate candidate : cndbygender) {
					System.out.println(candidate);

				}
				break;

			case 5:
				System.out.println("Enter Age:- ");
				int age = sc.nextInt();

				List<Candidate> cndage = con.getCandidateByAge(age);
				for (Candidate candidate : cndage) {
					System.out.println(candidate);
				}

				break;

			}
		}
	}
}
