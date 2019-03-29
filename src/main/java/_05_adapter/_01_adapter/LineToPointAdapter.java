package _05_adapter._01_adapter;

import java.util.ArrayList;

public class LineToPointAdapter extends ArrayList<Point> {

    private static int count = 0;

    public LineToPointAdapter(Line line) {
        System.out.println(
                String.format("%d: Generating points for line [%d,%d]-[%d,%d] (no caching)",
                        ++count, line.getStart().getX(), line.getStart().getY(), line.getEnd().getX(), line.getEnd().getY()));

        int left = Math.min(line.getStart().getX(), line.getEnd().getX());
        int right = Math.max(line.getStart().getX(), line.getEnd().getX());
        int top = Math.min(line.getStart().getY(), line.getEnd().getY());
        int bottom = Math.max(line.getStart().getY(), line.getEnd().getY());
        int dx = right - left;
        int dy = line.getEnd().getY() - line.getStart().getY();

        if (dx == 0) {
            for (int y = top; y <= bottom; ++y) {
                add(new Point(left, y));
            }
        } else if (dy == 0) {
            for (int x = left; x <= right; ++x) {
                add(new Point(x, top));
            }
        }
    }
}
