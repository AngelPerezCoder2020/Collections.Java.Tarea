import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import Clases.Vuelo;
public class Main {
    private static List<Vuelo> vuelos;
    private final static SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy HH:mm");
    public static void main(String[] args) {
        try{
            vuelos = new ArrayList<>();
            llenar(vuelos);
            Collections.sort(vuelos);
            System.out.println("===============Listado ordenado por fecha de llegada ascendente===============");
            for(Vuelo v:vuelos){
                System.out.println(v);
            }
            System.out.println("\n===============Ultimo Vuelo en Llegar===============");
            System.out.println(vuelos.get(vuelos.size()-1));
            vuelos.sort((a, b) -> {
                if(a.getNumPasajeros()==b.getNumPasajeros()) return 0;
                if(a.getNumPasajeros()>b.getNumPasajeros()) return 1;
                else return -1;
            });
            System.out.println("\n===============Vuelo con menos pasajeros===============");
            System.out.println(vuelos.get(0));
        }catch(ParseException e){
            System.out.println("Error: "+e.getMessage());
            e.printStackTrace();
        }
    }
    public static void llenar(List<Vuelo> l) throws ParseException {
        l.add(new Vuelo("AAL 933","New York","Santiago",fecha("29-08-2021 05:39"),62));
        l.add(new Vuelo("LAT 755","Sao Paulo","Santiago",fecha("31-08-2021 04:45"),47));
        l.add(new Vuelo("SKU 621","Rio de Janeiro","Santiago",fecha("30-08-2021 16:00"),52));
        l.add(new Vuelo("DAL 147","Atlanta","Santiago",fecha("29-08-2021 13:22"),59));
        l.add(new Vuelo("AVA 241","Bogota","Santiago",fecha("31-08-2021 14:05"),25));
        l.add(new Vuelo("AMX 10","Mexico city","Santiago",fecha("31-08-2021 05:20"),29));
        l.add(new Vuelo("IBE 6833","Londres","Santiago",fecha("30-08-2021 08:45"),55));
        l.add(new Vuelo("LAT 2479","Frankfurt","Santiago",fecha("29-08-2021 07:41"),51));
        l.add(new Vuelo("SKU 803","Lima","Santiago",fecha("30-08-2021 10:35"),48));
        l.add(new Vuelo("LAT 533","Los Angeles","Santiago",fecha("29-08-2021 09:14"),59));
        l.add(new Vuelo("LAT 1447","Guayaquil","Santiago",fecha("31-08-2021 08:33"),31));
        l.add(new Vuelo("CMP 111","Panama city","Santiago",fecha("31-08-2021 15:15"),29));
        l.add(new Vuelo("LAT 705","Madrid","Santiago",fecha("30-08-2021 08:14"),47));
        l.add(new Vuelo("AAL 957","Miami","Santiago",fecha("29-08-2021 22:53"),60));
        l.add(new Vuelo("ARG 5091","Buenos Aires","Santiago",fecha("31-08-2021 09:57"),32));
        l.add(new Vuelo("LAT 1283","Cancun","Santiago",fecha("31-08-2021 04:00"),35));
        l.add(new Vuelo("LAT 579","Barcelona","Santiago",fecha("29-08-2021 07:45"),61));
        l.add(new Vuelo("AAL 945","Dallas-Fort Worth","Santiago",fecha("30-08-2021 07:12"),58));
        l.add(new Vuelo("LAT 501","Paris","Santiago",fecha("29-08-2021 18:29"),49));
        l.add(new Vuelo("LAT 405","Montevideo","Santiago",fecha("30-08-2021 15:45"),39));
    }
    public static Date fecha(String str) throws ParseException{
        return formato.parse(str);
    }
}