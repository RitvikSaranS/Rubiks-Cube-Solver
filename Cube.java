import java.util.Scanner;

class RubiksCube{
    char [][][] conformation = new char[6][3][3];
    String [] faceColors = {"white", "red", "orange", "green", "blue", "yellow"};
    /*
    conformation[0] => white
    conformation[1] => red
    conformation[2] => orange
    conformation[3] => green
    conformation[4] => blue
    conformation[5] => yellow
*/
    public void enterScramble(){
        for(int i = 0; i < faceColors.length; i++){
            if(i == 0) System.out.println("Enter the colors of " + faceColors[i] + " centered face keeping red at bottom : ");
            else if(i == 5) System.out.println("Enter the colors of " + faceColors[i] + " centered face keeping red at top : ");
            else System.out.println("Enter the colors of " + faceColors[i] + " centered face keeping white at top : ");
            Scanner input = new Scanner(System.in);
            String facecolorstring = input.next();
            for(int j =0, l = 0; j < conformation[0].length && l < (facecolorstring.length() -1); j++){
                for(int k = 0; k < conformation[0][0].length; k++){
                    conformation[i][j][k] = facecolorstring.charAt(l++);
                }
            }
        }
    }
    public void printCube(){
        for(int i = 0; i < faceColors.length; i++){
            System.out.println("\n" + faceColors[i] + " centered face" + "\n");
            System.out.println("- - - - -");
            for(int j = 0; j < conformation[0].length; j++){
                for(int k = 0; k < conformation[0][0].length; k++){
                    if(k == 0 || k == 1){
                        System.out.print(conformation[i][j][k] + " | ");
                    }else System.out.print(conformation[i][j][k]);
                }
                System.out.println("\n" + "- - - - -");
            }
        }
    }
    public void turnAlgorithm(String algorithm){
        for(int i = 0; i < algorithm.length(); i++){
            switch(algorithm.charAt(i)){
                case 'R' : {
                    char [] arr = new char[3];
                    for(int j = 0; j < 3; j++){
                        arr[j] = conformation[1][j][2];
                    }
                    for(int j = 0; j < 3; j++){
                        conformation[1][j][2] = conformation[5][j][2];
                    }
                    for(int j = 0, l = 2; j < 3; j++, l--){
                        conformation[5][j][2] = conformation[2][l][0];
                    }
                    for(int j = 0, l = 2; j < 3; j++, l--){
                        conformation[2][l][0] = conformation[0][j][2];
                    }
                    for(int j = 0; j < 3; j++){
                        conformation[0][j][2] = arr[j];
                    }
                    break;
                }
                case 'L' : {
                    break;
                }
                case 'D' : {
                    break;
                }
                case 'U' : {
                    break;
                }
                case 'F' : {
                    break;
                }
                case 'M' : {
                    break;
                }
                case 'r' : {
                    break;
                }
                case 'l' : {
                    break;
                }
                case 'd' : {
                    break;
                }
                case 'u' : {
                    break;
                }
                case 'f' : {
                    break;
                }
                case 'b' : {
                    break;
                }
            }
        }
    }
}
public class Cube{
    public static void main(String[] args) {
        RubiksCube r = new RubiksCube();
        r.enterScramble();
        r.printCube();
    }
}