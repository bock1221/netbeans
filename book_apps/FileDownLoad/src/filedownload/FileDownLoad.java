/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package filedownload;

import java.util.Scanner;

/**
 *
 * @author zvibock
 */
public class FileDownLoad {
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        final int minute=60;
        Scanner scanner =new Scanner (System.in);
        System.out.print("enter number of mb in file\n");
        System.out.println("enter download speed MB/sec");
        double filesize =scanner.nextDouble();
        double speed = scanner.nextDouble();
        double totalseconds =filesize/speed;
        double minutes = totalseconds/60;
        int single =(int) minutes;
        System.out.println(minutes);
        System.out.println(single);
        int hours  =single/(int)minute;
        int onlyMinutes = (int)minutes- (hours*minute); 
        double calculateSeconds= (minutes-single)*minute;
        int cSeconds =(int)calculateSeconds;
        System.out.println("this download will take "+hours+" hours \n"
                +single+" minutes\n"
                +cSeconds +" seconds");
        
    }
}