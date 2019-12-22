package day27;

public class Multi_DimensionalArrayTask {

    public static void main(String[] args) {
        
        int[][] numbers = {{12,11,10,19},{19,20,15}};
        
        int max = numbers[0][0];
        for(int[] eachArray: numbers){
            for(int eachNum: eachArray){
                if(eachNum>max){
                    max=eachNum;
                }
            }
        }
        System.out.println("max = " + max);

        for (int i = 0; i <numbers.length ; i++) {
            for (int j = 0; j <numbers[i].length ; j++) {
                if(numbers[i][j]>max){
                    max=numbers[i][j];

                }
            }
        }
        System.out.println("max with fori = " + max);
        System.out.println("=================================================");
        
        int min = numbers[0][0];
        for(int[] eachArr : numbers){
            for(int eachInt : eachArr){
                if(min>eachInt) {
                    min=eachInt ;
                    
                }
            }
        }
        System.out.println("min = " + min);
        System.out.println("======================================================");

        String[] devTeam = {"Vladislav","Hasan","Tolkun"};
        String[] testerTeam = {"Zhibekchach","Mohamed Sohrabi","Nursultan"};
        String[] baTeam = {"Lisa","Ershad","Naila"};

        String[][] scrumTeam = {devTeam, testerTeam, baTeam};
        String longest = "";
        for (String[] eachTeam: scrumTeam){
            for(String eachName : eachTeam){
                if(eachName.length()>longest.length()){
                    longest=eachName;
                }
            }
        }
        System.out.println("longest name = " + longest);
        
        String shortest = scrumTeam[0][0];
        for (int i = 0; i <scrumTeam.length ; i++) {
            for (int j = 0; j <scrumTeam[i].length ; j++) {
                if(shortest.length()>scrumTeam[i][j].length()){
                    shortest=scrumTeam[i][j];
                }
            }
        }
        System.out.println("shortest = " + shortest);
    }
}
