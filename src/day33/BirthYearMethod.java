package day33;

public class BirthYearMethod {

    public static void main(String[] args) {
        System.out.println(returnTheAge(1995));

        System.out.println("===========================");
        int[] years = {1995,1990,1900,2025,2034};
        for (int i = 0; i <years.length ; i++) {
            System.out.println(returnTheAge(years[i]));
        }
    }

    public static int returnTheAge(int year){
        if(year>=1900 && year<=2020){
            return 2019-year;
        }else{
            return 0;
        }
    }
}
