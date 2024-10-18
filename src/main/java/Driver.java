import controller.BattleshipSalvo;
import controller.Controller;
import java.io.InputStreamReader;

/**
 * This is the main driver of this project.
 */
public class Driver {
  /**
   * Project entry point
   *
   * @param args - no command line args required
   */
  public static void main(String[] args) {

    Readable input = new InputStreamReader(System.in);
    Appendable output = System.out;

    Controller battleSalvo = new BattleshipSalvo(input, output);

    battleSalvo.run();

  }
}