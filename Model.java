public class Model {
    private String [][] data = {
        {"89137789","WHITE","2", "11"},
        {"32631613","BROWN", "9", "5"},
        {"88118282","WHITE", "1", "4"},
        {"77879040","PINK", "4", "3"},
        {"38277165","PINK", "5", "2"},
        {"94985657","BROWN", "2", "10"},
        {"86340623","PINK", "3", "6"},
        {"85975754","PINK", "8", "2"},
        {"17734365","BROWN", "4", "1"},
        {"73462169","WHITE", "3", "5"},
        {"43403313","PINK", "5", "6"},
        {"83058353","BROWN", "10", "1"},
        {"21607382","PINK", "7", "5"},
        {"86943917","WHITE", "6", "9"},
        {"33605131","WHITE", "4", "2"},
    };
    private String milk_plain = "0";
    private String milk_choco = "0";
    private String milk_strawberry = "0";

    public void getData(String code){
        if (verifyData(code) == false){
            System.out.println("Invalid Input please enter again");
            new Controller();
            
        }
        else{
            System.out.println("true");
            calculate(code);

        }

    }
    private boolean verifyData(String code){
        if (code.length() != 8){
            System.out.println("false");
            return false;
        }
        if (code.charAt(0) == '0'){
            System.out.println("false");
            return false;
        }
        else{
            for (int i = 0; i < data.length; i++){
                if (code.equals(data[i][0])){
                    System.out.println("found");
                    return true;
                }
            }
        }
        return true;
    }
    private void calculate(String code){
        for (int i = 0; i < data.length; i++){
            if (code.equals(data[i][0])){
                if (data[i][1].equals("WHITE")){
                    calculateWhite(i ,1);
                }
                else if (data[i][1].equals("BROWN")){
                    calculateBrown(i, 1);
                }
                else if (data[i][1].equals("PINK")){
                    calculatePink(i, 1);
                }
                new View(milk_plain, milk_choco, milk_strawberry);
            }
        } 
    }
    private void calculateWhite(int i, int code){
        int k = 120;
        int month = (Integer.parseInt(data[i][2]) * 12) + (Integer.parseInt(data[i][3]));
        System.out.println(month);
        int ans = k - month;
        System.out.println(ans + " l");
        milk_plain = Integer.toString(ans);
    }
    private void calculateBrown(int i, int code){
        int k = 40;
        int years = (Integer.parseInt(data[i][2]));
        int ans = k - years;
        System.out.println(ans + " l");
        milk_choco = Integer.toString(ans);

    }
    
    private void calculatePink(int i, int code){
        int k = 30;
        int month = (Integer.parseInt(data[i][3]));
        int ans = k - month;
        System.out.println(ans + " l");
        milk_strawberry = Integer.toString(ans);

    }
    
}
