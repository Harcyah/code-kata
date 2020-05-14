package com.harcyah.kata.exercism.sublist;

import java.util.List;

final class RelationshipComputer<T extends Comparable> {

    public Relationship computeRelationship(List<T> left, List<T> right) {
        if (left.equals(right)) {
            return Relationship.EQUAL;
        }

        if (isSubList(right, left)) {
            return Relationship.SUPERLIST;
        }

        if (isSubList(left, right)) {
            return Relationship.SUBLIST;
        }

        return Relationship.UNEQUAL;
    }

    private boolean isSubList(List<T> left, List<T> right) {
        if (left.size() > right.size()) {
            return false;
        }

        int diff = right.size() - left.size();
        for (int i = 0; i <= diff; i++) {
            if (right.subList(i, i + left.size()).equals(left)) {
                return true;
            }
        }

        return false;
    }

}
