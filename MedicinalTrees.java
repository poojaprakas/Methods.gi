package com.xworkz.controlStaments;

public class MedicinalTrees {
	public static int diseaseAnalyser(int diseases, int signs) {
	int accuracyOfDisease = diseases*signs;
	return accuracyOfDisease;
	}

	public static void main(String[] args) {
		int signs = 3;
		int diseases = 8;
		int medicinerrequired;
		medicinerrequired = MedicinalTrees.diseaseAnalyser(8, 3);
		System.out.println("medicinal trees required is " +medicinerrequired);
				

	}

}
