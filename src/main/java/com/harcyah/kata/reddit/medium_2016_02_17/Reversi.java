package com.harcyah.kata.reddit.medium_2016_02_17;

import com.google.common.collect.Sets;
import com.google.common.io.Resources;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Set;

// https://www.reddit.com/r/dailyprogrammer/comments/468pvf/20160217_challenge_254_intermediate_finding_legal/
public class Reversi {

    protected Board board;
    protected Chip player;
    protected Chip opponent;

    public Reversi(String source) throws IOException {
        URL resource = Board.class.getResource(source);
        List<String> lines = Resources.readLines(resource, StandardCharsets.UTF_8);

        // Read players
        if (lines.get(0).equals(Chip.X.name())) {
            player = Chip.X;
            opponent = Chip.O;
        } else {
            player = Chip.O;
            opponent = Chip.X;
        }

        // Read table
        board = new Board();
        for (int i = 0; i < Board.SIZE; i++) {
            String line = lines.get(i + 1);
            for (int j = 0; j < line.length(); j++) {
                String c = line.substring(j, j + 1);
                board.setCellAt(i, j, "-".equals(c) ? null : Chip.valueOf(c));
            }
        }
    }

    public Set<Square> getPossibleMoves() {
        Set<Square> moves = Sets.newHashSet();

        // Let's loop over every square on the board
        for (int col = 0; col < Board.SIZE; col++) {
            for (int row = 0; row < Board.SIZE; row++) {

                // There's already a chip here
                Chip current = board.getChipAt(col, row);
                if (current != null) {
                    continue;
                }

                // Loop over all possible siblings setup
                // Is there such one which allows to put a chip here ?
                for (Sibling move : Sibling.values()) {
                    if (move.canPut(player, opponent, col, row, board)) {
                        moves.add(new Square(col, row));
                    }
                }
            }
        }

        return moves;
    }

}
