import java.util.ArrayList;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.InputMismatchException;
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
        switch(inputToInt()){
            
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
            System.out.println("Ogiltigt input");
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
                System.out.println("Logg hittades: ");
                System.out.println(i);
            }
            else{
                System.out.println("Logg existerar inte.");
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
        for(int i = 0; i < loggar.size(); i++){
            System.out.print("Tar bort loggen: " + loggar);
            loggar.remove(i);
            }
        
    }
    public static int inputToInt(){
        boolean input2 = true;
        int nummer = 0;
        while(input2){
            Scanner sc = new Scanner(System.in);
            try{
                nummer = sc.nextInt();
                input2 = false;
            }
            catch(InputMismatchException e){
                System.out.println("Du kan bara ge ett nummer mellan 1-5");
                }
        
            }
            return nummer;
    } 
    }