/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zootopia;
import javax.swing.JLabel;
/**
 *
 * @author Asus pc
 */
public class LabelChanger implements Runnable {
    @Override
    public void run() {
        Zootopia main = Main.getMain();
        JLabel jLabel3 = main.getLabel3();
        JLabel jLabel4 = main.getLabel4();
        JLabel jLabel5 = main.getLabel5();
        int scoreboard;
        
        while (!Zootopia.getEndworld()) {
            Zootopia.getWorld().update();
            Zootopia.setbufferDirection('N');
            try {
              Thread.sleep(Zootopia.getDeltaTime());
            } catch (InterruptedException ex) {
              Thread.currentThread().interrupt();
            }

            while (Zootopia.getStop() && !Zootopia.getEndworld()) {

            }

            if (!Zootopia.getEndworld()) {
              Zootopia.setEndworld(Zootopia.getWorld().getGameOverStatus());
            }
            String s = Zootopia.getWorld().getBoard().print();
            jLabel3.setText(s);
            
            scoreboard = Zootopia.getWorld().getScore();
            jLabel5.setText("<html><pre>Score = "+scoreboard+"</html></pre>");
          }
          String gameover = "<html><pre>    Game Over      </pre></html>";
          jLabel4.setText(gameover);          
    }
}
