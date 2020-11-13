import java.util.ArrayList;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class loggbok {
    static boolean isRunning = true;
    static Scanner sc = new Scanner(System.in);
    static ArrayList<bok> loggar = new ArrayList();
    static String timeStamp = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());

    public static void main(String[] args) {
        System.out.println("Hej och välkommen till din virtuella loggbok");
        while(isRunning){
        System.out.println("[1] Skapa en logg");
        System.out.println("[2] Sök bland existerande loggar");
        System.out.println("[3] Printa alla sparade loggar");
        System.out.println("[4] Ta bort en sparad logg");
        System.out.println("[5] Stäng loggboken");
        int input = sc.nextInt();
        switch(input){
            
            case 1:
            logg();
            break;

            case 2:
            searchForLogg();
            break;

            case 3:
            printAllLoggs();
            break;

            case 4:
            taBortLogg();
            break;

            case 5:
            System.out.println("Stänger loggboken\nHa de gött");
            isRunning = false;
            break;

            default:
            System.out.println("Bruh du har val alternativ framför dig varför testar du annat");
            break;
            }
        }
    }
    
    public static void logg(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Titel till din logg");
        String loggtitel = sc.nextLine().toUpperCase();
        System.out.println("Implementera vad du vill i din logg");
        String loggtext = sc.nextLine();
        loggar.add(new bok(loggtitel, loggtext, timeStamp));
        
    }
    public static void searchForLogg(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Vilken logg vill du söka på?");
        String soklogg = sc.nextLine().toUpperCase();
        for(bok i : loggar){
            if(i.titel.equals(soklogg)){
                System.out.println(i);
            }
        }
    }
    public static void printAllLoggs(){
        for(bok j : loggar){
            System.out.println(j);
        }
    }
    public static void taBortLogg(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Vilken logg vill du ta bort?");
        String tabort = sc.nextLine().toUpperCase();
        for(bok k : loggar){
            if(k.titel.equals(tabort)){
                loggar.remove(k);
            }
        }

    }
}