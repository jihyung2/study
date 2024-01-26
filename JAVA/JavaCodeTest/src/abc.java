import java.util.Arrays;

public class abc {
    public static void main(String[] args){
        String[] drum = {"######", ">#*###", "####*#", "#<#>>#", ">#*#*<", "######"};
        String[][] arr = new String[drum.length][drum.length];

        for (int i = 0; i<drum.length; i++ ){
            int j = 0;
            String[] NT = drum[i].split("");
            for (String var:NT){
                arr[i][j] = var;
                j++;
            }
        }

        int start = 0;
        int startPositions = 0;

        while(start < drum[0].length()) {
            int i = 0;
            int j = start;
            int starCount = 0;

            while (i < drum.length && j >= 0 && j < drum[0].length()) {
                switch (arr[i][j]) {
                    case "#":
                        i++;
                        break;
                    case ">":
                        j++;
                        break;
                    case "<":
                        j--;
                        break;
                    case "*":
                        if (starCount == 0) {
                            i++;
                            starCount++;
                        } else if (starCount == 1) {
                            break;
                        }
                        break;
                }
                if (j < 0 || j >= drum[0].length() || i == drum.length) {
                    startPositions++;
                    break;
                }
            }
            start++;
        }

        System.out.println("Starting positions where the marble falls out: " + startPositions);
        System.out.println(Arrays.deepToString(arr));
    }
}


