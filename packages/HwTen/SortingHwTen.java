package HwTen;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortingHwTen {
    public static void main(String[] args){

       String a ="Шоб таки нє - то таки да, щоб таки да - то таки нє. Але шо вже зробиш - най лишається як сталося. Я вважаю, що це теж не погано";

        Map<String,Integer>map=new HashMap<>();
       map.put("а",0);
       map.put("А",0);
       map.put("б",0);
       map.put("в",0);
       map.put("г",0);
       map.put("д",0);
       map.put("е",0);
       map.put("є",0);
       map.put("ж",0);
       map.put("з",0);
       map.put("и",0);
       map.put("і",0);
       map.put("ї",0);
       map.put("й",0);
       map.put("к",0);
       map.put("л",0);
       map.put("м",0);
       map.put("н",0);
       map.put("о",0);
       map.put("п",0);
       map.put("р",0);
       map.put("с",0);
       map.put("т",0);
       map.put("у",0);
       map.put("ф",0);
       map.put("х",0);
       map.put("ц",0);
       map.put("ч",0);
       map.put("ш",0);
       map.put("Ш",0);
       map.put("щ",0);
       map.put("ь",0);
       map.put("ю",0);
       map.put("я",0);
       map.put(",",0);
       map.put(".",0);
       map.put("-",0);
       map.put("Я",0);

       for (int i = 0; i < a.length(); i++) {
          switch (a.charAt(i))
          {
             case 'а': map.put("а", map.get("а")+1); break;
             case 'А': map.put("А", map.get("А")+1); break;
             case 'б': map.put("б", map.get("б")+1); break;
             case 'в': map.put("в", map.get("в")+1); break;
             case 'г': map.put("г", map.get("г")+1); break;
             case 'д': map.put("д", map.get("д")+1); break;
             case 'е': map.put("е", map.get("е")+1); break;
             case 'є': map.put("є", map.get("є")+1); break;
             case 'ж': map.put("ж", map.get("ж")+1); break;
             case 'з': map.put("з", map.get("з")+1); break;
             case 'и': map.put("и", map.get("и")+1); break;
             case 'і': map.put("і", map.get("і")+1); break;
             case 'ї': map.put("ї", map.get("ї")+1); break;
             case 'й': map.put("й", map.get("й")+1); break;
             case 'к': map.put("к", map.get("к")+1); break;
             case 'л': map.put("л", map.get("л")+1); break;
             case 'м': map.put("м", map.get("м")+1); break;
             case 'н': map.put("н", map.get("н")+1); break;
             case 'о': map.put("о", map.get("о")+1); break;
             case 'п': map.put("п", map.get("п")+1); break;
             case 'р': map.put("р", map.get("р")+1); break;
             case 'с': map.put("с", map.get("с")+1); break;
             case 'т': map.put("т", map.get("т")+1); break;
             case 'у': map.put("у", map.get("у")+1); break;
             case 'ф': map.put("ф", map.get("ф")+1); break;
             case 'х': map.put("х", map.get("х")+1); break;
             case 'ц': map.put("ц", map.get("ц")+1); break;
             case 'ч': map.put("ч", map.get("ч")+1); break;
             case 'ш': map.put("ш", map.get("ш")+1); break;
             case 'Ш': map.put("Ш", map.get("Ш")+1); break;
             case 'щ': map.put("щ", map.get("щ")+1); break;
             case 'ь': map.put("ь", map.get("ь")+1); break;
             case 'ю': map.put("ю", map.get("ю")+1); break;
             case 'я': map.put("я", map.get("я")+1); break;
             case 'Я': map.put("Я", map.get("Я")+1); break;
             case ',': map.put(",", map.get(",")+1); break;
             case '-': map.put("-", map.get("-")+1); break;
             case '.': map.put(".", map.get(".")+1); break;
          }

          // Print current character
       System.out.print(a.charAt(i));
                 }
       System.out.println();
       System.out.print(map);

          }
}
