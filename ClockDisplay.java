
/**
 *  Reloj para teléfonos Android formato 24 horas, muestra las horas y minutos desde las 00:00
 *  hasta las 23:59.
 * 
 * @author (Raúl Pérez Baza) 
 * @version (10/11/2015)
 */
public class ClockDisplay
{
    // Las horas del reloj.
    private int horas;
    // Los minutos del reloj.
    private int minutos;
  
    /**
     * Constructor for objects of class ClockDisplay.

     */
    public ClockDisplay()
     {
         horas = 0;
         minutos = 0;
     }
    /**
     * Método setTime que permita fijar un momento determinado de tiempo expresado en horas y minutos.
     */
       
       
    public void setTime(int hora, int minuto)
   {
    
        if (horas >= 0 & horas <= 23) 
        {
            if (minutos >= 0 & minutos <=59)
            {
                horas = hora;
                minutos = minuto;
                System.out.println("La hora actual es " + hora + ":" + minuto);
                
          
            }
        }
    }
   
   /**
    * Método timeTick que permite hacer avanzar un minuto el tiempo fijado.
    */
   public void timeTick()
   {
       minutos = minutos + 1;
       if (minutos > 59)
       {
           minutos = 0;
           horas = horas + 1;
       }
       horas = horas;
       if (horas > 23)
       {
           minutos = 0;
           horas = 0;
       }
       
       {
           System.out.println("A pasado un minuto, la hora actual es " + horas + ":" + minutos);
           
       }
    }
}

