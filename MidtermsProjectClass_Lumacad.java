package midtermsProjectPackage;
import java.util.ArrayList;
import java.util.Scanner;

public class MidtermsProjectClass_Lumacad {

	public void method_registeredAlready() {
		System.out.println("\n" + "Congratulations on your registration, we hope to see you soon!");
		main(null); // We call main method so the program goes back to the very beginning without
//		having to press 'run' every time
	}

	public void method_waitlistedApplicant() {
		System.out.println("\n"
				+ "You have been waitlisted. An email will be sent out to you for further instructions regarding your admissions. Thank you very much! 				AMDG.");
		main(null);
	}

	// *******************************************************************************************//

	public static void main(String[] args) {

//		Declaration of universal variables so it could be accessed anywhere within the class
		String selectedCollege = "";
		String appName = "";
		String selectedProgram="";
		String input;
		int numSubjects;

//		We create an object to gain access to the methods under the class 'MidtermsProjectClass_Lumacad' 
		MidtermsProjectClass_Lumacad applicant = new MidtermsProjectClass_Lumacad(); 

//		Establishing a scanner object which will read applicant inputs
		Scanner applicantInput = new Scanner(System.in);

//		Admissions system welcomes applicant to the admissions system
		System.out.println("\n" + "================================================================================");
		System.out.println("Welcome to the Xavier Univerity - Ateneo de Cagayan, admissions system, where your educational journey begins!"); 
		System.out.println("Have you registered already or are you new here?");

//		Applicants decides on whether or not they have already registered
		System.out.println("\n" + "1 | Yes, I have registered already.");
		System.out.println("2 | No, I am new here.");
		System.out.print("\n" + "Enter here: ");

		int regisStatus = applicantInput.nextInt();

//		Conditionals depending on the registration status of the applicant 
		if (regisStatus == 1) {
			applicant.method_registeredAlready(); 
		} else if (regisStatus == 2) {

//			=================================STUDENT REGISTRATION PORTION===================================================
			
			System.out.println("\n" + "================================================================================");
			System.out.println("NEW STUDENT REGISTRATION:");
			System.out.println("Please input the necessary information.");
			System.out.println("--------------------------------------------------------------------------------");

			System.out.print("Fullname: ");
			appName = applicantInput.next() + " " + applicantInput.next();

			System.out.print("Age: "); 
			int appAge =applicantInput.nextInt(); 

			applicantInput.nextLine();
			System.out.print("Address: ");;
			String appAddress = applicantInput.nextLine();

			System.out.print("Email: ");
			String appEmail = applicantInput.next();

			applicantInput.nextLine();
			System.out.print("Contact No: ");
			String appContNo = applicantInput.next();

			applicantInput.nextLine();
			System.out.print("Last school Attended: ");
			String appLastSchoolAttended = applicantInput.nextLine();

//			System asks applicant on which college they want to be admitted in
			System.out.println("\nEnter the college you want to be admitted in");
			System.out.println("1 | College of Engineering");
			System.out.println("2 | College of Nursing");
			System.out.println("3 | College of Computer Studies");
			System.out.print("\n" + "Enter here: ");

			int collegeChoice = applicantInput.nextInt();

//			Different college choices (Engineering, Nursing, and Computer Studies)
			if (collegeChoice == 1) {
				selectedCollege = "College of Engineering";
			} else if (collegeChoice == 2) {
				selectedCollege = "College of Nursing";
			} else if (collegeChoice == 3) {
				selectedCollege = "College of Computer Studies";
			} else {
				System.out.println("Invalid choice of college, please try again.");
				main(null);
			}

//			System asks applicant on which program they want to pursue within their selected college
			System.out.println("\n" + "================================================================================");
			System.out.println("You have selected the " + selectedCollege);
			System.out.println("Choose a program within the " + selectedCollege + ".");
			System.out.println("--------------------------------------------------------------------------------");

			if(collegeChoice == 1) { //Engineering
				System.out.println("1 | Mechanical Engineering");
				System.out.println("2 | Electrical Engineering");
				System.out.println("3 | Civil Engineering");
			} else if (collegeChoice == 2) { //Nursing
				System.out.println("1 | Nursing");
			} else if (collegeChoice == 3) { //Computer Studies
				System.out.println("1 | Computer Science");
				System.out.println("2 | Information Technology");
				System.out.println("3 | Information Systems");
				System.out.println("4 | Entertainment and Multimedia Computing");
			}

			System.out.print("\n" + "Enter here: ");
			int programChoice = applicantInput.nextInt();

//			Different colleges and their respective program offerings
			switch (selectedCollege) {
			case "College of Engineering": 
				switch (programChoice) { 
				case 1:
					selectedProgram = "Mechanical Engineering";
					break;

				case 2:
					selectedProgram = "Electrical Engineering";
					break;

				case 3:
					selectedProgram = "Civil Engineering";
					break;

				default:
					System.out.println("Invalid program choice.");
				}
				break;

			case "College of Nursing":
				switch (programChoice) {
				case 1:
					selectedProgram = "Nursing";
					break;

				default:
					System.out.println("Invalid program choice.");
				}
				break;

			case "College of Computer Studies":
				switch (programChoice) {
				case 1: 
					selectedProgram = "Computer Science";
					break;

				case 2:
					selectedProgram = "Information Technology";
					break;

				case 3:
					selectedProgram = "Information Systems";
					break;

				case 4:
					selectedProgram = "Entertainment and Multimedia Computing";
					break;
				}
				break;
			}

//			System displays everything that the applicant has submitted so far for submission
			System.out.println("\n" + "================================================================================");
			System.out.println("NEW STUDENT CONFIRMATION:");
			System.out.println("Please review your inputs to see if they are correct and final.");
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("\n" + "Name: " + appName);
			System.out.println("Age: " + appAge);
			System.out.println("Address: " + appAddress);
			System.out.println("Email: " + appEmail);
			System.out.println("Contact No: " + appContNo);
			System.out.println("Last school attended: " + appLastSchoolAttended);

			System.out.println("College: " + selectedCollege);
			System.out.println("Program: Bachelor of Science in " + selectedProgram);

			System.out.println("\n" + "--------------------------------------------------------------------------------");
			System.out.println("0 | Submit");
			System.out.print("\n" + "Enter here: ");
			int submitStatus = applicantInput.nextInt();

			if (submitStatus == 0) {
				System.out.println("\n" + "================================================================================");

//				==============================================ADMISSION CRITERIA PORTION=============================================================
				
				System.out.println("Thank you for completing the student registration. Please input your GPA to see if you qualify for admissions.");

				System.out.println("================================================================================");
				System.out.println("Accepted GPA per College");
				System.out.println("College of Nursing: 3.0 ");
				System.out.println("College of Engineering: 3.0");
				System.out.println("College of Computer Studies: 3.0 ");
				System.out.println("================================================================================");

//				Applicant inputs their GPA
				System.out.print("\n" + "Input your GPA: ");
				Double appGPA = applicantInput.nextDouble();

				if (appGPA >= 3.0) {
					System.out.println("\n" + "You are legible to apply for this college program.");
					System.out.println("\nYou may now proceed to enroll in your chosen subjects."); 
				}
				else if (appGPA < 3.0) {
					applicant.method_waitlistedApplicant();
				}

			}

			System.out.println("\n" + "================================================================================");

		}

//		======================================ENROLLMENT OF SUBJECTS PORTION===============================================  

		System.out.println("\n" + "ENROLLMENT OF SUBJECTS");
		System.out.println("\nYou may now select the subjects you want to enroll in");

		switch (selectedCollege) {
		
//		CASE 1: COLLEGE OF ENGINEERING
		case "College of Engineering":
			String[] subjectsEngg = {
					"CE 11      | INTRODUCTION TO CIVIL ENGINEERING",
					"MATH 86.1  | DIFFERENTIAL CALCULUS",
					"CHEM 86    | CHEMISTRY FOR ENGINEERS (LECTURE)",
					"CHEM 86 L  | CHEMISTRY FOR ENGINEERS (LABORATORY)",
					"PSY 1      | UNDERSTANDING THE SELF",
					"ENGL 5     | PURPOSIVE COMMUNICATION",
					"MATH 4     | MATHEMATICS IN THE MODERN WORLD",	
					"PE 11      | PATH-FIT 1",
					"NSTP 1     | NATIONAL SERVICE TRAINING PROGRAM 1"

			};

//			System displays array subjectsEngg to show the applicant the subjects that they can enroll in
			for (String iterate: subjectsEngg) {
				System.out.println(iterate);
			}	

//			System asks applicant on how many subjects they want to enroll in. If it exceeds the number of subjects offered in that college, it 
//			would loop until applicant's input does not exceed anymore.
			while (true) {
				System.out.println("\nHow many subjects do you want to enroll in?");
				if (applicantInput.hasNextInt()) {
					numSubjects = applicantInput.nextInt();
					if (numSubjects > 0 && numSubjects < subjectsEngg.length) {
						break;
					} else {
						System.out.println("\nInvalid number of subjects. Please enter a number between 1 and " + subjectsEngg.length);
					}
				} else {
					System.out.println("Invalid input. Please enter a valid number.");
					applicantInput.next();
				}
			}

			ArrayList<String> selectedSubjects = new ArrayList<>();

//			System asks applicant on the subjects they want to enroll in. They will have to enter the subject code
			System.out.println("\nEnter the subject code(s) of the subjects you want to enroll to: (e.g. PSY 4, NSTP 1, PE 11) ");
			applicantInput.nextLine();
			input = applicantInput.nextLine();

//			Input subjects from the applicant gets stored in the array selectedSubjects
			selectedSubjects.add(input);

//			Admissions and notice of enrollment letter gets displayed which will also show the list of subjects that the applicant enrolled 
//			themselves in.
			System.out.println("\n================================================================================");
			System.out.println("\nTO: " +appName);
			System.out.println("Bachelor of Science in " + selectedProgram);
			System.out.println("Enrolled XU Applicant");
			System.out.println("\nFROM: Xavier University - Ateneo de Cagayan");
			System.out.println("\nRE: CLEARANCE LETTER");
			System.out.println("\nMagis day! "); 
			System.out.println("\nCongratulations! We are pleased to inform you that you have been successfully enrolled in the " + selectedProgram +" 			program for 1st Semester.");
			System.out.println("You are currently enrolled in the following subjects (Refer to the Course Codes): ");
			System.out.println("\n" + selectedSubjects); 
			System.out.println("\nThank you for giving us this special privilege of being part of your education and formation.");
			System.out.println("We all look forward to working closely with you.");
			System.out.println("\nAMDG+");

			break;

//		CASE 2 College of Computer Studies Enrolling of Subjects
		case "College of Computer Studies":
			String[] subjectsCompStud = {
					"CC 10.1 | INTRODUCTION TO COMPUTING",
					"CC 11   | COMPUTER PROGRAMMING 1",
					"HIST 1  | READINGS IN PHILIPPINE HISTORY",
					"MATH 4  | MATHEMATICS IN THE MODERN WORLD",
					"THEO 1  | INTRODUCITON TO CHRISTIAN THEOLOGY",
					"PSY 1   | UNDERSTANDING THE SELF",
					"PE 11   | PATH-FIT 1",
					"NSTP 1  | NATIONAL SERVICE TRAINING PROGRAM 1"
			};

//			System displays array subjectsCompStud to show applicant the subjects that they can enroll in 
			System.out.println("");
			for (String iterate : subjectsCompStud) {
				System.out.println(iterate);
			}

//			System asks applicant on how many subjects they want to enroll in. If it exceeds the number of subjects offered in that college, it 
//			would loop until applicant's input does not exceed anymore.
			while (true) {
				System.out.println("\nHow many subjects do you want to enroll in?");
				if (applicantInput.hasNextInt()) {
					numSubjects = applicantInput.nextInt();
					if (numSubjects > 0 && numSubjects < subjectsCompStud.length) {
						break;
					} else {
						System.out.println("\nInvalid number of subjects. Please enter a number between 1 and " + subjectsCompStud.length);
					}
				} else {
					System.out.println("Invalid input. Please enter a valid number.");
					applicantInput.next(); 
				}
			}

			selectedSubjects = new ArrayList<>();

//			System asks applicant on the subjects they want to enroll in. They will have to enter the subject code
			System.out.println("\nEnter the subject code(s) of the subjects you want to enroll to: (e.g. PSY 4, NSTP 1, PE 11) ");
			applicantInput.nextLine();
			input = applicantInput.nextLine();

//			Input subjects from the applicant gets stored in the array selectedSubjects
			selectedSubjects.add(input);

//			Admissions and notice of enrollment letter gets displayed which will also show the list of subjects that the applicant enrolled 
//			themselves in.
			System.out.println("\n================================================================================");
			System.out.println("\nTO: " +appName);
			System.out.println("Bachelor of Science in " + selectedProgram);
			System.out.println("Enrolled XU Applicant");
			System.out.println("\nFROM: Xavier University - Ateneo de Cagayan");
			System.out.println("\nRE: CLEARANCE LETTER");
			System.out.println("\nMagis day! "); 
			System.out.println("\nCongratulations! We are pleased to inform you that you have been successfully enrolled in the " + selectedProgram +" 			program for 1st Semester.");
			System.out.println("You are currently enrolled in the following subjects (Refer to the Course Codes): ");
			System.out.println("\n" + selectedSubjects); 
			System.out.println("\nThank you for giving us this special privilege of being part of your education and formation.");
			System.out.println("We all look forward to working closely with you.");
			System.out.println("\nAMDG+");

			break;

//		CASE 3 College of Nursing Enrolling of Subjects
		case "College of Nursing":
			String[] subjectsNsg = {
					"NSG 10     | ANATOMY AND PHYSIOLOGY",
					"NCM 100    | THEORETICAL FOUNDATIONS IN NURSING",
					"CHEM 153   | ORGANIC BIOCHEMISTRY (LECTURE)",
					"CHEM 153 L | ORGANIC BIOCHEMISTRY (LABORATORY)",
					"MATH 4     | MATHEMATICS IN THE MODERN WORLD",
					"ENG 5      | PURPOSIVE COMMUNICATION",
					"IDE 10.1   | IGNATIAN CULTURE AND MISSION",
					"PSY 1      | UNDERSTANDING THE SELF",
					"NSTP 1     | NATIONAL SERVICE TRAINING PROGRAM 1"
			};

//			System displays array subjectsEngg to show the applicant the subjects that they can enroll in
			System.out.println("");
			for (String iterate: subjectsNsg) {
				System.out.println(iterate);
			}

//			System asks applicant on how many subjects they want to enroll in. If it exceeds the number of subjects offered in that college, it 
//			would loop until applicant's input does not exceed anymore.
			while (true) {
				System.out.println("\nHow many subjects do you want to enroll in?");
				if (applicantInput.hasNextInt()) {
					numSubjects = applicantInput.nextInt();
					if (numSubjects > 0 && numSubjects < subjectsNsg.length) {
						break;
					} else {
						System.out.println("\nInvalid number of subjects. Please enter a number between 1 and " + subjectsNsg.length);
					}
				} else {
					System.out.println("Invalid input. Please enter a valid number.");
					applicantInput.next();
				}
			}

			selectedSubjects = new ArrayList<>();

//			System asks applicant on the subjects they want to enroll in. They will have to enter the subject code
			System.out.println("\nEnter the subject code(s) of the subjects you want to enroll to: (e.g. PSY 4, NSTP 1, PE 11) ");
			applicantInput.nextLine();
			input = applicantInput.nextLine();

//			Input subjects from the applicant gets stored in the array selectedSubjects
			selectedSubjects.add(input);

//			Admissions and notice of enrollment letter gets displayed which will also show the list of subjects that the applicant enrolled 
//			themselves in.
			System.out.println("\n================================================================================");
			System.out.println("\nTO: " +appName);
			System.out.println("Bachelor of Science in " + selectedProgram);
			System.out.println("Enrolled XU Applicant");
			System.out.println("\nFROM: Xavier University - Ateneo de Cagayan");
			System.out.println("\nRE: CLEARANCE LETTER");
			System.out.println("\nMagis day! "); 
			System.out.println("\nCongratulations! We are pleased to inform you that you have been successfully enrolled in the " + selectedProgram +" 			program for 1st Semester.");
			System.out.println("You are currently enrolled in the following subjects (Refer to the Course Codes): ");
			System.out.println("\n" + selectedSubjects); 
			System.out.println("\nThank you for giving us this special privilege of being part of your education and formation.");
			System.out.println("We all look forward to working closely with you.");
			System.out.println("\nAMDG+");

		}
		
//		System closes scanner object applicantInput
		applicantInput.close();

	}

}
