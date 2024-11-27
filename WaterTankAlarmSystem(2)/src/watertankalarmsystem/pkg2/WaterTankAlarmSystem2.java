/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package watertankalarmsystem.pkg2;

import java.util.Random;

/**
 *
 * @author Bavindu Shan
 */
public class WaterTankAlarmSystem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       ControllRoom controllRoom=new ControllRoom();
       controllRoom.addWaterLevelObserver(new Alarm());
       controllRoom.addWaterLevelObserver(new Display());
       controllRoom.addWaterLevelObserver(new SMSSender());
       controllRoom.setVisible(true);
      
    }
    
}
