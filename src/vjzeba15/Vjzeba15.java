package vjzeba15;

public class Vjzeba15 {

    public static void main(String[] args) {
        
     String text = "Kad naidjes na coveka s kojim vredi govoriti i s njim ne govoris, izgubio si ga. Kad naidjes na coveka s kojim ne vredi govoriti i s njim govoris, izbubio si reci. Mudrac ne gubi ni coveka ni reci.";
            int covekNum = 0;
            int reciNum = 0;
            int index;
            
            String covekStr = "covek";
            String reciStr = "reci";
            
            index = text.indexOf(covekStr);
            while(index >= 0){
                ++covekNum;
                index += covekStr.length();
                index = text.indexOf(covekStr, index);
                
            }
            index = text.lastIndexOf(reciStr);
            while(index >= 0){
                ++reciNum;
                index -= reciStr.length();
                index = text.lastIndexOf(reciStr, index);
            }
            System.out.println("Zadati tekst sadrzi " + covekNum + " pojave reci \"covek\" i " + reciNum + " pojave reci \"reci\".");;
            
        
        

   

   
        
    }

}
