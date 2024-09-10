package edu.grinnell.csc207.experiments;

import edu.grinnell.csc207.util.BigFraction;

import java.io.PrintWriter;

/**
 * A simple experiment using fractions.
 *
 * @author Samuel A. Rebelsky.
 * @author YOUR NAME HERE
 */
public class BFExperiment {
  /**
   * Generate a few fractions and print them out.
   *
   * @param args
   *   Command-line arguments; ignored.
   *
   * @throws Exception
   *   When we have some unexpected I/O issue.
   */
  public static void main(String[] args) throws Exception {
    PrintWriter pen = new PrintWriter(System.out, true);
    BigFraction f1;
    f1 = new BigFraction(3, 10);
    BigFraction f2;
    f2 = new BigFraction(2, 5);
    BigFraction f3 = f1.multiply(f2);
    BigFraction f4 = new BigFraction(11, 3);
    pen.println("First fraction: " + f1);
    pen.println("Second fraction: " + f2);
    pen.println("Third fraction: " + f3);
    pen.println("Sum: " + (f1.add(f2)));
    pen.println("Fourth fraction: " + f4.fractional());
    pen.close();
  } // main(String[])
} // class BFExperiment
