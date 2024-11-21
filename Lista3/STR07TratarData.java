package Lista3;

import java.util.Scanner;

public class STR07TratarData {
    
    public static String getDay(String data){
        return data.substring(0,2);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String data = s.nextLine();

        System.out.println("Estamos no dia "+getDay(data)+" do mês.");
    }
}
