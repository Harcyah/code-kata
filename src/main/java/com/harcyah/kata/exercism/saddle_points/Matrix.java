import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Matrix {

    private final int size;
    private final int[][] points;

    public Matrix(List<List<Integer>> rows) {
        if (rows.isEmpty()) {
            size = 0;
            points = new int[0][0];
        } else {
            size = rows.size();
            points = new int[size][size];
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    points[i][j] = rows.get(i).get(j);
                }
            }
        }
    }

    public Set<MatrixCoordinate> getSaddlePoints() {
        Set<MatrixCoordinate> coords = new HashSet<>();
        for (int x=0; x<points.length; x++) {
            for (int y=0; y<points[x].length; y++) {
                int v = points[x][y];
                if (isGreaterInRow(v, y) && isLesserInCol(v, x)) {
                    coords.add(new MatrixCoordinate(x, y));
                }
            }
        }
        return coords;
    }

    private boolean isLesserInCol(int v, int x) {
        for (int i=0; i<size; i++) {
            if (points[x][i] > v) {
                return false;
            }
        }
        return true;
    }

    private boolean isGreaterInRow(int v, int y) {
        for (int i=0; i<size; i++) {
            if (points[i][y] < v) {
                return false;
            }
        }
        return true;
    }

}
