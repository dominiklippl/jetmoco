package de.dominiklippl.jetmoco.windows;

import com.intellij.openapi.wm.ToolWindow;

import javax.swing.*;

public class MocoToolWindow {

  private JPanel mocoToolWindowContent;
  private JComboBox comboBox1;
  private JComboBox comboBox2;
  private JTextArea textArea1;
  private JButton button1;
  private JButton button2;

  public MocoToolWindow(ToolWindow toolWindow) {
    this.currentDateTime();
  }

  public void currentDateTime() {
    // Get current date and time
    /*
    Calendar instance = Calendar.getInstance();
    currentDate.setText(
            instance.get(Calendar.DAY_OF_MONTH) + "/"
                    + (instance.get(Calendar.MONTH) + 1) + "/"
                    + instance.get(Calendar.YEAR)
    );
    currentDate.setIcon(new ImageIcon(getClass().getResource("/toolWindow/Calendar-icon.png")));
    int min = instance.get(Calendar.MINUTE);
    String strMin = min < 10 ? "0" + min : String.valueOf(min);
    currentTime.setText(instance.get(Calendar.HOUR_OF_DAY) + ":" + strMin);
    currentTime.setIcon(new ImageIcon(getClass().getResource("/toolWindow/Time-icon.png")));
    // Get time zone
    long gmt_Offset = instance.get(Calendar.ZONE_OFFSET); // offset from GMT in milliseconds
    String str_gmt_Offset = String.valueOf(gmt_Offset / 3600000);
    str_gmt_Offset = (gmt_Offset > 0) ? "GMT + " + str_gmt_Offset : "GMT - " + str_gmt_Offset;
    timeZone.setText(str_gmt_Offset);
    timeZone.setIcon(new ImageIcon(getClass().getResource("/toolWindow/Time-zone-icon.png")));
     */
  }

  public JPanel getContent() {
    return mocoToolWindowContent;
  }
}
