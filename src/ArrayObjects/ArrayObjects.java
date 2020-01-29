package ArrayObjects;
// Today's date is January 28,2020
// I am learning ArrayObjects
public class ArrayObjects {
    private String Names; 

    public String getNames() {
        return Names;
    }

    public void setNames(String Names) {
        this.Names = Names;
    }
    public static void main(String[] args) {
        String myArray[] = new String[6];
        myArray[0] = "Dhoom";
        myArray[1] = "Dhoom2";
        myArray[2] = "Dhoom3";
        myArray[3] = "Dhoom4";
        myArray[4] = "Dhoom5";
        myArray[5] = "Dhoom6";
        
        for (String myArray1 : myArray) {
            System.out.println(myArray1);
        }
    }
}
