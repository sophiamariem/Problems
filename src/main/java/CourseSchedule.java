import java.util.*;

public class CourseSchedule {

    // DFS
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adjacent = new ArrayList<>(numCourses);

        for (int i = 0; i < numCourses; i++) {
            adjacent.add(i, new ArrayList<>());
        }

        for (int i = 0; i < prerequisites.length; i++) {
            adjacent.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }

        boolean[] visited = new boolean[numCourses];
        for (int i = 0; i < numCourses; i++) {
            if (hasCycle(adjacent, i, visited, new boolean[numCourses])) {
                return false;
            }
        }
        return true;
    }

    private boolean hasCycle(List<List<Integer>> adjacent, int course, boolean[] completed, boolean[] visited) {
        if (completed[course]) {
            return false;
        }

        if (visited[course]) {
            return true;
        }

        visited[course] = true;
        for (Integer j : adjacent.get(course)) {
            if (hasCycle(adjacent, j, completed, visited)) {
                return true;
            }
        }
        completed[course] = true;
        return false;
    }

    // BFS
    public boolean canFinishTopological(int numCourses, int[][] prerequisites) {
        int graph[] = new int[numCourses];
        for (int i = 0; i < prerequisites.length; i++) {
            graph[prerequisites[i][0]]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (graph[i] == 0) {
                queue.add(i);
            }
        }

        int count = queue.size();
        while (!queue.isEmpty()) {
            int prerequisite = queue.remove();
            for (int i = 0; i < prerequisites.length; i++) {
                if (prerequisites[i][1] == prerequisite) {
                    graph[prerequisites[i][0]]--;
                    if (graph[prerequisites[i][0]] == 0) {
                        count++;
                        queue.add(prerequisites[i][0]);
                    }
                }
            }
        }
        return count == numCourses;
    }
}
