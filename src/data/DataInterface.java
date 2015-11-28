/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
/**
 *
 * @author April
 */
public class DataInterface {
    int numOfGender = 0;
    String fileName = "";
    ArrayList<String> originData;
    String[][] divide;
    int size;
    
    public DataInterface(String fileName) {
        int i;
        this.fileName = fileName;
        File origin = new File(this.fileName);
        originData = ImportCSV.importCSV(origin);
        size = originData.size();
        divide = new String[size][23];
        
        for(i=1;i<size;i++){
            divide[i] = originData.get(i).split(",");
        }   
    }
    
	public ArrayList<NumCountryPair> getTop5NumCountryPair() {
		ArrayList<NumCountryPair> top5Country = new ArrayList<NumCountryPair>();
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(int i = 0; i < divide.length; i++) { //6
			Integer count = map.get(divide[i][6]);
			map.put(divide[i][6], (count == null) ? 1 : count + 1);
		}
		TreeMap<String, Integer> sortedMap = new TreeMap<String, Integer>(new MapComparator(map));
		sortedMap.putAll(map);
		Iterator it = sortedMap.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Integer> pair = (Map.Entry<String, Integer>)it.next();
			System.out.println(pair.getKey() + " = " + pair.getValue());
			top5Country.add(new NumCountryPair(pair.getValue(), pair.getKey()));
		}
		return top5Country;
	}
	
	class MapComparator implements Comparator {
		HashMap<String, Integer> map;
		public MapComparator(HashMap<String, Integer> base) {
			this.map = base;
		}
		public int compare(Object keyA, Object keyB) {
			Comparable valueA = (Comparable) map.get(keyA);
			Comparable valueB = (Comparable) map.get(keyB);
			return valueB.compareTo(valueA);
		}
	}
			
    public int getNum(String gender) {
        int i;
        for(i=1;i<size;i++){
            if (divide[i][3].equals(gender)) {
                numOfGender++;
            }
        } 
        return numOfGender;
    }

    public int getNumOfMale(){
	return getNum("Male");
    }
    
    public int getNumOfFemale(){
        return getNum("Female");
    }
	

    
	public int[] getGPADistribution(String gender) {
        int i;
        int[] gpaDistribution = new int[7];
        for(int m = 0; m<gpaDistribution.length;m++) {
            gpaDistribution[m] = 0;
        }
        double GPA;
        
        for(i=1;i<size;i++){
            if(divide[i][3].equals(gender)){
                GPA = Double.parseDouble(divide[i][14]);
                if((GPA>3.5)&&(GPA<=4)) {
                    gpaDistribution[0]++;
                } else if((GPA>3)&&(GPA<=3.5)){
                    gpaDistribution[1]++;
                } else if((GPA>2.5)&&(GPA<=3)){
                    gpaDistribution[2]++;
                } else if((GPA>2)&&(GPA<=2.5)){
                    gpaDistribution[3]++;
                } else if((GPA>1.5)&&(GPA<=2)){
                    gpaDistribution[4]++;
                } else if((GPA>1)&&(GPA<=1.5)){
                    gpaDistribution[5]++;
                } else if((GPA>0)&&(GPA<=1)){
                    gpaDistribution[6]++;
                } 
            } 
		}
		for(int m = 0; m<gpaDistribution.length; m++)
            System.out.println("gpaDistribution" + gender + m + ":" + gpaDistribution[m]);
        return gpaDistribution; 
    }
	
    public int[] getGPADistributionFemale() {
		return getGPADistribution("Female");
	}
    
    public int[] getGPADistributionMale() {
		return getGPADistribution("Male");
	}
     
    public int[] getNumOfPartTimeAndFullTime() {
        int i;
        int[] num = {0,0};

        for(i=1;i<size;i++){
            if (divide[i][12].equals("part_time")) {
                num[0]++;
            }
            else {
                num[1]++;
            }
        }
        System.out.println(num[0]);
        System.out.println(num[1]);
        
        return num;
    }

    public int[] getNumOfEnrolledByYear(int startYear, int endYear) {
        int i,j;
        int year;
        int[] yearArray = new int[endYear-startYear+1];
        
        for(i=1;i<size;i++){
            year = Integer.parseInt(divide[i][9]);
            for(j = 0; j<yearArray.length; j++) {
                
                if(year==startYear+j) {
                    yearArray[j]++;
                }
            }
        }
        for(int m = 0; m<yearArray.length; m++)
            System.out.println("yearArray" + yearArray[m]);
        int n;
        File file = new File("NumOfEnrolledByYear.csv");
        try(BufferedWriter output = new BufferedWriter(new FileWriter(file))){
            output.write("Year");
            output.write(",");
            output.write("NumberOfEnrolled");
            output.newLine();
            for(n=0;n<yearArray.length;n++){
                output.write(startYear+n+"");
                output.write(",");
                output.write(yearArray[n]+"");
                output.newLine();
                
            }
            output.write(endYear+1+"");
            output.write(",");
            output.write("?");
        }catch(IOException e){}

        return yearArray;
        
    }
    
    public int[] getNumByMajor(String gender) {
        int i;
        int[] major = {0,0,0,0,0,0};

        for(i=1;i<size;i++){
            if(divide[i][3].equals(gender)){
                switch (divide[i][10]) {
                    case "MSIT" : major[0]++; continue;
                    case "Global MISM" : major[1]++; continue;
                    case "Financial Engineering" : major[2]++; continue;
                    case "MS in CS" : major[3]++; continue;
                    case "MBA" : major[4]++; continue;
                    case "MSIPPM" : major[5]++; continue;
                }
            }
        }
        for(int m = 0; m<major.length; m++) {
            System.out.println("major" + major[m]);
        }
        return major;
    }

    public int[] getNumOfMaleByMajor() {
        return getNumByMajor("Male");
    }
    
    public int[] getNumOfFemaleByMajor() {
        return getNumByMajor("Male");
    }
 
    public String[] getMajorName() {
        String[] names = {"MSIT", "Global MISM", "Financial Engineering", "MS in CS", "MBA", "MSIPPM"};
        return names;
    }
    
    public int[] getNUmOfDroppedByYear(int startYear, int endYear) {
        int i,j;
        int year;
        int[] yearArray = new int[endYear-startYear+1];
        File origin = new File(fileName);
        ArrayList<String> originData = ImportCSV.importCSV(origin);
        ArrayList<String> processData = new ArrayList();
        int size = originData.size();
        String[][] divide = new String[size][23];
        processData.add(originData.get(0));
        for(i=1;i<size;i++){
            divide[i] = originData.get(i).split(",");
            year = Integer.parseInt(divide[i][9]);
            for(j = 0; j<yearArray.length; j++) {
                if(year==startYear+j) {
                    if(divide[i][22].equals("No")) {
                        yearArray[j]++;
                    }
                    
                }
            }     
        }
        for(int m = 0; m<yearArray.length; m++)
            System.out.println("yearArray" + yearArray[m]);
        int n;
        File file = new File("NumOfDroppedByYear.csv");
        try(BufferedWriter output = new BufferedWriter(new FileWriter(file))){
            output.write("Year");
            output.write(",");
            output.write("NumberOfDropped");
            output.newLine();
            for(n=0;n<yearArray.length;n++){
                output.write(startYear+n+"");
                output.write(",");
                output.write(yearArray[n]+"");
                output.newLine();
                
            }
            output.write(endYear+1+"");
            output.write(",");
            output.write("?");
        }catch(IOException e){}

        return yearArray;
    }

}


