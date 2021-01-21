package sorting.screens;

import static sorting.MainApp.WIN_HEIGHT;
import static sorting.MainApp.WIN_WIDTH;

import java.awt.Dimension;
import javax.swing.JPanel;
import sorting.MainApp;

/**
 * @author mhops
 */
public abstract class Screen extends JPanel {

  protected MainApp app;

  public Screen(MainApp app) {
    this.app = app;
  }

  @Override
  public Dimension getPreferredSize() {
    return new Dimension(WIN_WIDTH, WIN_HEIGHT);
  }

  public abstract void onOpen();
}
