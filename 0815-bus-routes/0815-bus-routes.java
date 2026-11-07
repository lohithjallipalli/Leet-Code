class Solution {
    public int numBusesToDestination(int[][] routes, int source, int target) {
        if (source == target) return 0;
        Map<Integer, List<Integer>> stopToBuses = new HashMap<>();
        for (int i = 0; i < routes.length; i++) {
            for (int stop : routes[i]) {
                stopToBuses.computeIfAbsent(stop, k -> new ArrayList<>()).add(i);
            }
        }
        Set<Integer> visitedBuses = new HashSet<>();
        Set<Integer> visitedStops = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        q.offer(source);
        visitedStops.add(source);
        int busesTaken = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            while (size-- > 0) {
                int stop = q.poll();
                for (int bus : stopToBuses.getOrDefault(stop, new ArrayList<>())) {
                    if (visitedBuses.contains(bus)) continue;
                    visitedBuses.add(bus);
                    for (int nextStop : routes[bus]) {
                        if (nextStop == target) return busesTaken + 1;
                        if (!visitedStops.contains(nextStop)) {
                            visitedStops.add(nextStop);
                            q.offer(nextStop);
                        }
                    }
                }
            }
            busesTaken++;
        }
        return -1;
    }
}