import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CourseScheduleII {

    private Map<Integer, List<Integer>> map = new HashMap<>();
    private List<Integer> courses;


    // topological sort
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        courses = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) {
            map.put(i, new ArrayList<>());
        }

        for (int[] edge : prerequisites) {
            map.get(edge[0]).add(edge[1]);
        }

        // 0 - unvisited
        // 1 - visiting
        // 2 - visited
        int[] visited = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            if (visited[i] == 0) {
                if (hasCycleDfs(i, visited)) {
                    return new int[0];
                }
            }
        }

        int[] result = new int[courses.size()];
        for (int i = 0; i < courses.size(); i++) {
            result[i] = courses.get(i);
        }
        return result;
    }

    private boolean hasCycleDfs(int i, int[] visited) {
        visited[i] = 1;
        for (int next : map.get(i)) {
            if (visited[next] == 1 || (visited[next] == 0 && hasCycleDfs(next, visited))) {
                return true;
            }
        }
        visited[i] = 2;
        courses.add(i);
        return false;
    }
}
