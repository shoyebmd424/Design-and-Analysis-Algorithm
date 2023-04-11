# What will happen if we will apply Dijkstra’s algorithm for this purpose?
If the graph has a negative cycle: We cannot apply Dijkstra’s algorithm to the graph which contains a negative cycle. It will give TLE error in that case.
If the graph does not contain a negative cycle: In this case, we will apply Dijkstra’s algorithm for every possible node to make it work like a multi-source shortest path algorithm like Floyd Warshall. The time complexity of Floyd Warshall is O(V3)(Which we will discuss later in this article) whereas if we apply Dijkstra’s algorithm for the same purpose the time complexity reduces to O(V*(E*logV)) (where v = no. of vertices). 

<h2>Formula:</h3>

matrix[i][j] =min(matrix[i][j], matrix[i ][k]+matrix[k][j]), where i = source node,
                  j = destination node and k = the node via which we are reaching from i to j.


<h2>Initial Configuration: </h2>

Adjacency Matrix: The adjacency matrix should store the edge weights for the given edges and the rest of the cells must be initialized with infinity().

After having set the adjacency matrix accordingly, we will run a loop from 0 to V-1(V = no. of vertices). In the kth iteration, this loop will help us to check the path via node k for every possible pair of nodes. Basically, this loop will change the value of k in the formula.
Inside the loop, there will be two nested loops for generating every possible pair of nodes(Nothing but to visit each cell of a 2D matrix using the nested loop). Among these two loops, the first loop will change the value of i and the second one will change the value of j in the formula.
Inside these nested loops, we will apply the above formula to calculate the shortest distance between the pair of nodes.
Finally, the adjacency matrix will store all the shortest paths. For example, matrix[i][j] will store the shortest path from node i to node j.
If we want to check for a negative cycle:
After completing the steps(outside those three loops), we will run a loop and check if any cell having the row and column the same(i = j) contains a value less than 0.

Note: If you wish to see the dry run of the above approach, you can watch the video attached to this article.


<h4>Time Complexity</h4>: O(V3), as we have three nested loops each running for V times, where V = no. of vertices.

<h4>Space Complexity</h4>: O(V2), where V = no. of vertices. This space complexity is due to storing the adjacency matrix of the given graph.

