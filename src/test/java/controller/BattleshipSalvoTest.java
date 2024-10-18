package controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.StringReader;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BattleshipSalvoTest {

  // fields that go into constructor to create testController
  private Readable input;
  private Appendable output;
  // BattleSalvo game controller
  private Controller testController;

  @BeforeEach
  void setup() {

    output = new StringBuilder();

  }

  @Test
  void runTest() {

    input = new StringReader("6 6" + System.lineSeparator() + "1 1 1 1" + System.lineSeparator());
    testController = new BattleshipSalvo(input, output, 1, 2);
    String expectedOutput = """
        Welcome to BattleSalvo.
        Please enter a valid board height and width below:
        ------------------------------------------------------------------

        Please enter your fleet in the order [Carrier, Battleship, Destroyer, Submarine].
        Remember, your fleet may not exceed size 6.
        ------------------------------------------------------------------


        AI

        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s

        You

        C  C  C  C  C  C \s
        B  ~  ~  S  S  S \s
        B  ~  ~  ~  ~  ~ \s
        B  ~  ~  ~  ~  ~ \s
        B  ~  ~  ~  ~  ~ \s
        B  ~  D  D  D  D \s

        AI: 4 shots available.

        You: 4 shots available.

        ------------------------------------------------------------------
        Please enter 4 unique shots:

        You didn't hit anything! :(

        AI hit 3 shots! :D


        AI

        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s

        You

        C  C  C  C  C  C \s
        B  ~  ~  S  S  S \s
        B  ~  ~  ~  ~  ~ \s
        B  ~  ~  ~  ~  ~ \s
        H  M  ~  ~  ~  ~ \s
        H  ~  D  D  H  D \s

        AI: 4 shots available.

        You: 4 shots available.

        ------------------------------------------------------------------
        Please enter 4 unique shots:

        You didn't hit anything! :(

        AI hit 3 shots! :D


        AI

        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s

        You

        C  C  H  H  C  C \s
        B  ~  ~  S  S  S \s
        B  ~  M  ~  ~  ~ \s
        B  ~  ~  ~  ~  ~ \s
        H  M  ~  ~  ~  ~ \s
        H  ~  D  H  H  D \s

        AI: 4 shots available.

        You: 4 shots available.

        ------------------------------------------------------------------
        Please enter 4 unique shots:

        You didn't hit anything! :(

        AI hit 2 shots! :D


        AI

        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s

        You

        H  C  H  H  C  C \s
        B  M  M  S  S  S \s
        H  ~  M  ~  ~  ~ \s
        B  ~  ~  ~  ~  ~ \s
        H  M  ~  ~  ~  ~ \s
        H  ~  D  H  H  D \s

        AI: 4 shots available.

        You: 4 shots available.

        ------------------------------------------------------------------
        Please enter 4 unique shots:

        You didn't hit anything! :(

        AI hit 3 shots! :D


        AI

        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s

        You

        H  C  H  H  C  H \s
        H  M  M  S  S  S \s
        H  ~  M  ~  ~  ~ \s
        B  ~  ~  ~  ~  ~ \s
        H  M  ~  ~  ~  ~ \s
        H  M  H  H  H  D \s

        AI: 4 shots available.

        You: 4 shots available.

        ------------------------------------------------------------------
        Please enter 4 unique shots:

        You didn't hit anything! :(

        AI hit 1 shots! :D


        AI

        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s

        You

        H  C  H  H  C  H \s
        H  M  M  S  H  S \s
        H  ~  M  ~  ~  ~ \s
        B  ~  ~  ~  ~  ~ \s
        H  M  M  M  ~  M \s
        H  M  H  H  H  D \s

        AI: 4 shots available.

        You: 4 shots available.

        ------------------------------------------------------------------
        Please enter 4 unique shots:

        You didn't hit anything! :(

        AI hit 2 shots! :D


        AI

        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s

        You

        H  C  H  H  C  H \s
        H  M  M  H  H  H \s
        H  M  M  ~  ~  ~ \s
        B  ~  ~  ~  M  ~ \s
        H  M  M  M  ~  M \s
        H  M  H  H  H  D \s

        AI: 4 shots available.

        You: 3 shots available.

        ------------------------------------------------------------------
        Please enter 3 unique shots:

        You didn't hit anything! :(

        AI hit 1 shots! :D


        AI

        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s

        You

        H  C  H  H  C  H \s
        H  M  M  H  H  H \s
        H  M  M  ~  ~  M \s
        B  ~  M  ~  M  ~ \s
        H  M  M  M  M  M \s
        H  M  H  H  H  H \s

        AI: 4 shots available.

        You: 2 shots available.

        ------------------------------------------------------------------
        Please enter 2 unique shots:

        You didn't hit anything! :(

        AI hit 2 shots! :D


        AI

        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s

        You

        H  H  H  H  H  H \s
        H  M  M  H  H  H \s
        H  M  M  M  M  M \s
        B  ~  M  ~  M  ~ \s
        H  M  M  M  M  M \s
        H  M  H  H  H  H \s

        AI: 4 shots available.

        You: 1 shots available.

        ------------------------------------------------------------------
        Please enter 1 unique shots:

        You didn't hit anything! :(

        AI hit 1 shots! :D


        AI won!
        """;

    testController.run();

    assertEquals(expectedOutput, output.toString());

  }

  @Test
  void invalidRunTest() {

    input = new StringReader("6 18\n6 6\n1 1 1 14\n1 1 1 1\n");
    testController = new BattleshipSalvo(input, output, 1, 2);
    String expectedOutput = """
        Welcome to BattleSalvo.
        Please enter a valid board height and width below:
        ------------------------------------------------------------------

        Invalid dimensions. The height and width of the
        game must be in the range (6, 15) inclusive. Try again:
        ------------------------------------------------------------------

        Please enter your fleet in the order [Carrier, Battleship, Destroyer, Submarine].
        Remember, your fleet may not exceed size 6.
        ------------------------------------------------------------------

        Invalid fleet specifications.
        Please enter your fleet in the order [Carrier, Battleship, Destroyer, Submarine].
        Remember, your fleet may not exceed size 6.
        ------------------------------------------------------------------


        AI

        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s

        You

        C  C  C  C  C  C \s
        B  ~  ~  S  S  S \s
        B  ~  ~  ~  ~  ~ \s
        B  ~  ~  ~  ~  ~ \s
        B  ~  ~  ~  ~  ~ \s
        B  ~  D  D  D  D \s

        AI: 4 shots available.

        You: 4 shots available.

        ------------------------------------------------------------------
        Please enter 4 unique shots:

        You didn't hit anything! :(

        AI hit 3 shots! :D


        AI

        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s

        You

        C  C  C  C  C  C \s
        B  ~  ~  S  S  S \s
        B  ~  ~  ~  ~  ~ \s
        B  ~  ~  ~  ~  ~ \s
        H  M  ~  ~  ~  ~ \s
        H  ~  D  D  H  D \s

        AI: 4 shots available.

        You: 4 shots available.

        ------------------------------------------------------------------
        Please enter 4 unique shots:

        You didn't hit anything! :(

        AI hit 3 shots! :D


        AI

        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s

        You

        C  C  H  H  C  C \s
        B  ~  ~  S  S  S \s
        B  ~  M  ~  ~  ~ \s
        B  ~  ~  ~  ~  ~ \s
        H  M  ~  ~  ~  ~ \s
        H  ~  D  H  H  D \s

        AI: 4 shots available.

        You: 4 shots available.

        ------------------------------------------------------------------
        Please enter 4 unique shots:

        You didn't hit anything! :(

        AI hit 2 shots! :D


        AI

        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s

        You

        H  C  H  H  C  C \s
        B  M  M  S  S  S \s
        H  ~  M  ~  ~  ~ \s
        B  ~  ~  ~  ~  ~ \s
        H  M  ~  ~  ~  ~ \s
        H  ~  D  H  H  D \s

        AI: 4 shots available.

        You: 4 shots available.

        ------------------------------------------------------------------
        Please enter 4 unique shots:

        You didn't hit anything! :(

        AI hit 3 shots! :D


        AI

        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s

        You

        H  C  H  H  C  H \s
        H  M  M  S  S  S \s
        H  ~  M  ~  ~  ~ \s
        B  ~  ~  ~  ~  ~ \s
        H  M  ~  ~  ~  ~ \s
        H  M  H  H  H  D \s

        AI: 4 shots available.

        You: 4 shots available.

        ------------------------------------------------------------------
        Please enter 4 unique shots:

        You didn't hit anything! :(

        AI hit 1 shots! :D


        AI

        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s

        You

        H  C  H  H  C  H \s
        H  M  M  S  H  S \s
        H  ~  M  ~  ~  ~ \s
        B  ~  ~  ~  ~  ~ \s
        H  M  M  M  ~  M \s
        H  M  H  H  H  D \s

        AI: 4 shots available.

        You: 4 shots available.

        ------------------------------------------------------------------
        Please enter 4 unique shots:

        You didn't hit anything! :(

        AI hit 2 shots! :D


        AI

        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s

        You

        H  C  H  H  C  H \s
        H  M  M  H  H  H \s
        H  M  M  ~  ~  ~ \s
        B  ~  ~  ~  M  ~ \s
        H  M  M  M  ~  M \s
        H  M  H  H  H  D \s

        AI: 4 shots available.

        You: 3 shots available.

        ------------------------------------------------------------------
        Please enter 3 unique shots:

        You didn't hit anything! :(

        AI hit 1 shots! :D


        AI

        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s

        You

        H  C  H  H  C  H \s
        H  M  M  H  H  H \s
        H  M  M  ~  ~  M \s
        B  ~  M  ~  M  ~ \s
        H  M  M  M  M  M \s
        H  M  H  H  H  H \s

        AI: 4 shots available.

        You: 2 shots available.

        ------------------------------------------------------------------
        Please enter 2 unique shots:

        You didn't hit anything! :(

        AI hit 2 shots! :D


        AI

        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s
        ~  ~  ~  ~  ~  ~ \s

        You

        H  H  H  H  H  H \s
        H  M  M  H  H  H \s
        H  M  M  M  M  M \s
        B  ~  M  ~  M  ~ \s
        H  M  M  M  M  M \s
        H  M  H  H  H  H \s

        AI: 4 shots available.

        You: 1 shots available.

        ------------------------------------------------------------------
        Please enter 1 unique shots:

        You didn't hit anything! :(

        AI hit 1 shots! :D


        AI won!
        """;

    testController.run();

    assertEquals(expectedOutput, output.toString());

  }
}
