package com.harcyah.kata.exercism.diamond;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class DiamondPrinterTest {

    @Test
    public void testOneByOneDiamond() {
        List<String> output = new DiamondPrinter().printToList('A');
        assertThat(output).isEqualTo(List.of(
            "A"
        ));
    }

    @Test
    public void testTwoByTwoDiamond() {
        List<String> output = new DiamondPrinter().printToList('B');
        assertThat(output).isEqualTo(List.of(
            " A ",
            "B B",
            " A "
        ));
    }

    @Test
    public void testThreeByThreeDiamond() {
        List<String> output = new DiamondPrinter().printToList('C');
        assertThat(output).isEqualTo(List.of(
            "  A  ",
            " B B ",
            "C   C",
            " B B ",
            "  A  "
        ));
    }

    @Test
    public void testFiveByFiveDiamond() {
        List<String> output = new DiamondPrinter().printToList('E');
        assertThat(output).isEqualTo(List.of(
            "    A    ",
            "   B B   ",
            "  C   C  ",
            " D     D ",
            "E       E",
            " D     D ",
            "  C   C  ",
            "   B B   ",
            "    A    "
        ));
    }

    @Test
    public void testFullDiamond() {
        List<String> output = new DiamondPrinter().printToList('Z');
        assertThat(output).isEqualTo(List.of(
            "                         A                         ",
            "                        B B                        ",
            "                       C   C                       ",
            "                      D     D                      ",
            "                     E       E                     ",
            "                    F         F                    ",
            "                   G           G                   ",
            "                  H             H                  ",
            "                 I               I                 ",
            "                J                 J                ",
            "               K                   K               ",
            "              L                     L              ",
            "             M                       M             ",
            "            N                         N            ",
            "           O                           O           ",
            "          P                             P          ",
            "         Q                               Q         ",
            "        R                                 R        ",
            "       S                                   S       ",
            "      T                                     T      ",
            "     U                                       U     ",
            "    V                                         V    ",
            "   W                                           W   ",
            "  X                                             X  ",
            " Y                                               Y ",
            "Z                                                 Z",
            " Y                                               Y ",
            "  X                                             X  ",
            "   W                                           W   ",
            "    V                                         V    ",
            "     U                                       U     ",
            "      T                                     T      ",
            "       S                                   S       ",
            "        R                                 R        ",
            "         Q                               Q         ",
            "          P                             P          ",
            "           O                           O           ",
            "            N                         N            ",
            "             M                       M             ",
            "              L                     L              ",
            "               K                   K               ",
            "                J                 J                ",
            "                 I               I                 ",
            "                  H             H                  ",
            "                   G           G                   ",
            "                    F         F                    ",
            "                     E       E                     ",
            "                      D     D                      ",
            "                       C   C                       ",
            "                        B B                        ",
            "                         A                         "
        ));
    }

}
