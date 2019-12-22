package Tasks;

public class ExcelExcel {

    public static void main(String[] args) {

        String[][] names = {{"Dilmurod","Dimka","Dili","Dilmir"},{"Shoxsanam","Sanam","Egov","Ilon"},
                {"Bob","Gustavo","Limon","Laki"}   };

        for (int i = 0; i <names.length ; i++) {
            for (int j = 0; j <names[i].length ; j++) {
                System.out.print("Cell("+(i+1)+","+(j+1)+") = "+names[i][j]+" ");
            }
            System.out.println();
        }
    }
}
